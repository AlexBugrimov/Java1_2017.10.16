package ru.spec.java1.lec7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.std.MapProperty;

public class EntryPoint {
private static Map<Integer, List<String>> map = new HashMap<>();
	
	public static void main(String[] args) throws MalformedURLException, IOException {
		Document doc = Jsoup.parse(new URL("https://habrahabr.ru/post/340370/"), 5_000);
		
		Elements items = doc.select(".comments-section .comment");
		for(Element item : items) {
			
			Integer key = 0;
			String comm = "";
			
			Elements statistics = item.select(".js-score");
			for(Element stat: statistics) {
				Matcher matcher = Pattern.compile("[–+]{1}[\\d]+").matcher(stat.text());
				key = (matcher.find()) ? Integer.parseInt(matcher.group().replace("–", "-")) : 0;	
			}
			
			Elements comment = item.select(".comment__message");
			for(Element text : comment) {
				comm = text.text();
			}
			
			List<String> listComments = (map.containsKey(key)) ? map.get(key) : new ArrayList<>();
			listComments.add(comm);
			map.put(key, listComments);	
		}
		
		File file = new File("C:/java/result.txt");
		FileOutputStream fos = new FileOutputStream(file);
		
		Map<Integer, List<String>> tr = new TreeMap<>(map);
		Set<Entry<Integer, List<String>>> entrySet = tr.entrySet();
		
		for(Entry<Integer, List<String>> ent : entrySet) {
			byte[] bytes = String.valueOf("Статистика: " + ent.getKey() + "\n").getBytes();
			fos.write(bytes, 0, bytes.length);
			for(String st : ent.getValue()) {
				bytes = (st + "\n").getBytes();
				fos.write(bytes, 0, bytes.length);
			}
			bytes = ("-----------------------------------------------------\n").getBytes();
			fos.write(bytes, 0, bytes.length);
		}
	}

	private static void hhApi() throws IOException, JsonParseException, JsonMappingException, MalformedURLException {
		ObjectMapper mapper = new ObjectMapper();
		SearchResult result = mapper
				.readValue(new URL("https://api.hh.ru/vacancies?text=java"), 
						SearchResult.class);
		
		result.getItems().forEach(item->System.out.println(item.getName()));
	}

	private static void specUrls() throws IOException, MalformedURLException {
		Document doc = Jsoup.parse(new URL("http://specialist.ru/"),5_000);
		Elements refs = doc.select(".menu_main a");
		for (Element ref : refs) {
			System.out.println(ref.text());
			System.out.println(ref.attr("href"));
			System.out.println();
		}
	}

}

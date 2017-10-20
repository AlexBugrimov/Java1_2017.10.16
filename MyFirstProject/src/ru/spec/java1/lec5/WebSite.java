package ru.spec.java1.lec5;

public abstract class WebSite {

	public abstract String getTitle();

	public static void main(String[] args) {
		WebSite[] sites = { new Yandex(), new Mail(), new Google() };

		for (WebSite site : sites) {
			printSite(site);
		}
	}

	static void printSite(WebSite site) {
		System.out.println(site.getTitle());
	}
}

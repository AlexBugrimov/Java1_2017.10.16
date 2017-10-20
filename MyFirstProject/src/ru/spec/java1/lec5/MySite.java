package ru.spec.java1.lec5;

import java.util.ArrayList;

public class MySite implements Site {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "MySite";
	}
	
	
	static interface Proccess {
		void proc(Integer i);
	}
	
	public static void main(String[] args) {
		System.out.println(new MySite().getName());
		
		ArrayList<Integer> ints = new ArrayList<>();
		ints.add(50);
		ints.add(2);
		ints.add(4);
		ints.add(2);
		ints.add(60);
		ints.add(150);
		
		Proccess printBin = new Proccess() {
			
			@Override
			public void proc(Integer i) {
				System.out.println(Integer.toBinaryString(i));
				
			}
		};
		
		Proccess toOct = Integer::toOctalString;
		
		myForEach(ints, printBin);
		myForEach(ints, toOct);
		
		ints.forEach(System.out::println);
		
		
		for(Integer x : ints) {
			for(Integer y : ints) {
				if(y < 5) {
					break;
				}
				System.out.println(x * y);
			}
		}
	}
	
	static void myForEach(ArrayList<Integer> list, Proccess p) {
		for(Integer integer : list) {
			p.proc(integer);
		}
	}
}

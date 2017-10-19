package ru.spec.java1.lec4;

public class Base {
	
	String name = "NAME";
	
	public Base() {
		System.out.println("Base()");
	}
	
	void m() {
		System.out.println("m()");
	}
	
	
	public static void main(String[] args) {
		new Base().m();
	}
}

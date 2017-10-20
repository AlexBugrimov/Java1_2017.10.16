package ru.spec.java1.lec5;

public class Employee {
	
	String name;
	String title;
	int age;
	
	public Employee(String name, String title, int age) {
		super();
		this.name = name;
		this.title = title;
		this.age = age;
	}
	
	public Employee(String name, int age) {
		this(name, null, age);
	}

	public static void main(String[] args) {
		
		final int i = 0;
		new Employee("name", "title", 35);
		
		
		
	}
}

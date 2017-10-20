package ru.spec.java1.lec5;

public interface Site {
	
	String getName();
	
	default String getTitle() {
		return "title: " + getName();
	}
	
}

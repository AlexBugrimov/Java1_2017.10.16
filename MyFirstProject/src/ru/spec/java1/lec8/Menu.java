package ru.spec.java1.lec8;

public enum Menu {
	MAIN("Главная"), PROJECTS("Проекты"), PROJECTS_1("Проекты_1", PROJECTS), PROJECTS_2("Проекты_2",
			PROJECTS), ABOUT("О нас"), CONTACTS("Контакты");

	String title;
	Menu parent;

	Menu(String title, Menu parent) {
		this.title = title;
		this.parent = parent;
	}

	Menu(String title) {
		this(title, null);
	}

	@Override
	public String toString() {
		return (parent == null ? "" : (parent.toString() + " >> ")) + title;
	}
}

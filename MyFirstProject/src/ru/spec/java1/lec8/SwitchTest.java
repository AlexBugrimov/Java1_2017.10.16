package ru.spec.java1.lec8;

import java.util.concurrent.TimeUnit;

public class SwitchTest {

	public static void main(String[] args) throws InterruptedException {
		int i = 3;
		Menu item = Menu.PROJECTS_1;
		System.out.println(item);
		/*switch (item) {
		case ABOUT:
			System.out.println(item.toString());
			System.out.println(item.name());
			break;
		default:
			System.out.println(item);
			break;
		}
*/
		TimeUnit.SECONDS.sleep(5);
	}

}

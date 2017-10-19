package ru.spec.java1.lec2;

public class Sort {
	public static void main(String[] args) {
		int[] array = { 2, 4, 1, 3, 6, 0, 1 };

		for (int i = 1; i < array.length; i++) {
			int currentItem = array[i];
			int j;
			for (j = i - 1;; j--) {
				if (j >= 0 && currentItem < array[j]) {
					array[j + 1] = array[j];
					continue;
				}
				break;
			}
			array[j + 1] = currentItem;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(" [" + array[i] + "]");
		}
	}
}

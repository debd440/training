package com.deb.ds.core.sort;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = { 11, 25, 88, 44, 2, 9, 33, 56 };

		for (int i = 0; i < a.length; i++) {
			boolean isSwapped = false;
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					isSwapped = true;
				}
			}
			if (!isSwapped)
				break;
		}
		System.out.println("Sorted Array is");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "->");
		}
	}
}

package com.deb.ds.core.array;

import java.util.Arrays;

public class WaveArray {

	// Display Array in Wave Format
	public static void main(String[] args) {

		int a[] = { 10, 90, 49, 2, 1, 5, 23 };

		Arrays.sort(a);
		for (int i = 0; i < a.length - 1; i += 2) {
			int temp = a[i];
			a[i] = a[i + 1];
			a[i + 1] = temp;
		}
		System.out.println("Displaying Result");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " -->");
		}
	}
}

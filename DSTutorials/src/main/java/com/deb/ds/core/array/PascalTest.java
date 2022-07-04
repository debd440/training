package com.deb.ds.core.array;

public class PascalTest {

	// Display like below
	/*
	 * 1, 11, 121
	 */
	public static void main(String[] args) {

		int n = 3;
		int number = 1;
		for (int i = 0; i < n; i++) {
			number = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(number);
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}

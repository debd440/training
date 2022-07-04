package com.deb.ds.core.array;

public class ReverseArray {

	// Reverse the Array in Optimized Way
	public static void main(String[] args) {

		int a[] = { 1, 56, 32, 89, 17 };

		// Swap Values beetwen a[i] and a[a.length - 1 - i]
		// Traverse to half of the array.
		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		}

		System.out.println("Printing Result ");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " -->");
		}
	}
}

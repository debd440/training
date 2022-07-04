package com.deb.ds.core.array;

public class MoveAllZeros {
	// Move all element with zero to right hand side
	public static void main(String[] args) {
		int a[] = { 0, 2, 5, 0, 8, 15, 0, 0, 4 };

		// Points to element which are zero
		int j = 0;
		for (int i = 0; i < a.length; i++) {

			// Check if j points to zero and i points to non zero. Then swap the value

			if (a[i] != 0 && a[j] == 0) {
				a[j] = a[i];
				a[i] = 0;
			}
			// if j does not point to zero increase the value.
			if (a[j] != 0) {
				j++;
			}
		}
		System.out.println("Printing Result");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " -->");
		}
	}

}

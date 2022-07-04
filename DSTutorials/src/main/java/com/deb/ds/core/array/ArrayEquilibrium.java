package com.deb.ds.core.array;

public class ArrayEquilibrium {

	public static void main(String[] args) {
		int[] a = { 2, 1, 5, 1, 2 };
		System.out.println(findEquilibrium(a));
	}

	public static int findEquilibrium(int a[]) {
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}

		int left = 0;
		for (int i = 0; i < a.length; i++) {
			// Left should be equal to right. need to substract left as its double
			// calculated. and need to remove current item
			if (left == total - (a[i] + left)) {
				//Use List if we need multiple Values
				return a[i];
			}
			left += a[i];
		}
		return -1;
	}
}

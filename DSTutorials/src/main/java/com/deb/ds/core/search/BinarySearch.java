package com.deb.ds.core.search;

public class BinarySearch {

	public static void main(String[] args) {
		// Sorted array is required
		int a[] = { 1, 2, 3, 4, 5 };
		int target = 4;
		System.out.println(binarySearch(a, 0, a.length - 1, target));
	}

	public static boolean binarySearch(int a[], int start, int end, int target) {

		while (start < end) {
			int mid = (start + end) / 2;
			if (a[mid] == target)
				return true;
			if (a[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return false;
	}
}

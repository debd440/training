package com.deb.ds.core.search;

public class MedianOfTwoArray {

	public static void main(String[] args) {

	}

	private static int median(int a[], int b[]) {

		int m = a.length;
		int n = b.length;
		int start = 0;
		int end = m;
		while (start < end) {
			int partition1 = (start + end) / 2;
			int partition2 = (m + n + 1) / 2 - partition1;
			
			int leftItem1 = (partition1 == 0) ? Integer.MIN_VALUE : a[partition1 - 1];
			int rightItem1 = (partition1 == m) ? Integer.MAX_VALUE : a[partition1];
			int leftItem2 = (partition1 == 0) ? Integer.MIN_VALUE : a[partition2 - 1];
			int rightItem2 = (partition1 == n) ? Integer.MAX_VALUE : a[partition2];

		}

		return 0;
	}
}

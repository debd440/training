package com.deb.ds.core.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumTarget {

	// Leetcode-1 -https://leetcode.com/problems/two-sum/
	public static void main(String[] args) {

		int target = 9;
		int a[] = { 2, 11, 5, 10, 7, 8 };

		// Using hashing. Complexity will be O(n)
		int result[] = twoSumHashing(a, target);
		System.out.println("Using Hashing: " + result[0] + ", " + result[1]);

		// Using sort & binary Search. Complexity will be O(n.log(n))
		// After Sorting index will change.
		result = twoSumBinarySearch(a, target);
		System.out.println("Using Binary Search: " + result[0] + ", " + result[1]);
	}

	private static int[] twoSumHashing(int a[], int target) {

		Map<Integer, Integer> map = new HashMap<>();
		int output[] = new int[2];
		for (int i = 0; i < a.length; i++) {
			int reverserTarget = target - a[i];
			if (map.containsKey(reverserTarget)) {
				output[0] = i;
				output[1] = map.get(reverserTarget);
				return output;
			} else {
				map.put(a[i], i);
			}
		}
		return output;
	}

	private static int[] twoSumBinarySearch(int a[], int target) {

		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "->");
		}
		int start = 0;
		int end = a.length - 1;
		int output[] = new int[2];
		while (start < end) {
			int sum = a[start] + a[end];
			if (sum == target) {
				output[0] = start;
				output[1] = end;
				break;
			}
			if (sum < target)
				start++;
			else
				end--;
		}
		return output;
	}
}

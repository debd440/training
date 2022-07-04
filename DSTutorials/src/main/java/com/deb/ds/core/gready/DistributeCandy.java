package com.deb.ds.core.gready;

import java.util.Arrays;

public class DistributeCandy {

	// Leetcode 135 -https://leetcode.com/problems/candy/
	public static void main(String[] args) {
		int ratings[] = { 1, 0, 2 };
		System.out.println("Example 1: " + candy(ratings));

		int ratings1[] = { 1, 2, 2 };
		System.out.println("Example 1: " + candy(ratings1));
	}

	public static int candy(int[] ratings) {

		int result[] = new int[ratings.length];
		// All Candidate will get atleast 1 candys
		Arrays.fill(result, 1);

		// Check from Left Hand. i should get atleast 1 candy more than i+1 if rating is
		// higher
		for (int i = 0; i < ratings.length - 1; i++) {
			if (ratings[i] > ratings[i + 1]) {
				result[i] = result[i + 1] + 1;
			}
		}

		// Check from right Hand. i should get atleast 1 candy more than i-1 if rating
		// is
		// higher
		for (int i = ratings.length - 1; i > 0; i--) {
			if (ratings[i] > ratings[i - 1]) {
				result[i] = result[i - 1] + 1;
			}
		}

		int totalCandy = 0;
		for (int i = 0; i < result.length; i++) {
			totalCandy += result[i];
		}
		return totalCandy;
	}

}

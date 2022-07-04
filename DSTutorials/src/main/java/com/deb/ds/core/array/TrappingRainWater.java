package com.deb.ds.core.array;

public class TrappingRainWater {

	// Leetcode -42- https://leetcode.com/problems/trapping-rain-water/
	public static void main(String[] args) {
		int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(trap(height));
	}

	public static int trap(int[] height) {

		int left[] = new int[height.length];
		int right[] = new int[height.length];
		int maxLeft = Integer.MIN_VALUE;
		int maxRight = Integer.MIN_VALUE;

		// Scan from Left
		for (int i = 0; i < height.length; i++) {
			maxLeft = Math.max(maxLeft, height[i]);
			left[i] = maxLeft;
		}

		// Scan from Right
		for (int i = height.length - 1; i >= 0; i--) {
			maxRight = Math.max(maxRight, height[i]);
			right[i] = maxRight;
		}
		int result = 0;
		for (int i = 0; i < height.length; i++) {
			result += Math.min(left[i], right[i]) - height[i];
		}
		return result;
	}
}

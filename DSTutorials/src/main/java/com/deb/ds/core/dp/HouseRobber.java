package com.deb.ds.core.dp;

public class HouseRobber {

	// Leetcode-198- https://leetcode.com/problems/house-robber/

	public static void main(String[] args) {

		HouseRobber demo = new HouseRobber();
		int nums[] = { 1, 2, 3, 1 };
		System.out.println(demo.rob(nums));
	}

	public int rob(int[] nums) {
		int sum=0;
		for (int i = 0; i < nums.length; i++) {
			sum +=nums[i];
		}
		if(sum<=0)
			return 0;
		int[] store = new int[nums.length + 1];
		return maxRobbery(store, nums, 0);
	}

	private int maxRobbery(int store[], int nums[], int currentIndex) {

		if (currentIndex >= nums.length)
			return 0;

		if (store[currentIndex] == 0) {
			int stealFirstOne = nums[currentIndex] + maxRobbery(store, nums, currentIndex + 2);
			int skipFirstOne = maxRobbery(store, nums, currentIndex + 1);
			store[currentIndex] = Math.max(stealFirstOne, skipFirstOne);
		}
		return store[currentIndex];
	}
}

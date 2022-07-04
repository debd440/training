package com.deb.ds.core.array;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthElement {
	// Leetcode-215- https://leetcode.com/problems/kth-largest-element-in-an-array/
	public static void main(String[] args) {
		int nums[] = { 3, 2, 1, 5, 6, 4 };
		int k = 2;
		System.out.println(findKthLargest(nums, k));
		System.out.println(findKthLargest1(nums, k));
	}

	public static int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length - k];
	}
	
	public static int findKthLargest1(int[] nums, int k) {
       
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for(int el : nums) {
            pq.add(el);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.poll();
    }
}

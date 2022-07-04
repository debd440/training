package com.deb.ds.core.backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

	/*
	 * Leetcode- 131 - https://leetcode.com/problems/palindrome-partitioning/ Given
	 * a string s, partition s such that every substring of the partition is a
	 * palindrome. Return all possible palindrome partitioning of s. Input: s =
	 * "aab" Output: [["a","a","b"],["aa","b"]]
	 */
	public static void main(String[] args) {
		
		PalindromePartitioning demo = new PalindromePartitioning();
		List<List<String>> result = demo.solvePalindrome("aab");
		result.forEach(System.out::println);
	}

	private List<List<String>> solvePalindrome(String a) {

		List<List<String>> result = new ArrayList<>();
		backtrack(a, result, new ArrayList<>(), 0);
		return result;
	}

	private void backtrack(String input, List<List<String>> result, List<String> curr, int start) {

		if (start == input.length()) {
			result.add(new ArrayList<>(curr));
			return;
		}
		for (int i = start + 1; i <= input.length(); i++) {
			if (isPalindrome(input, start, i - 1)) {
				curr.add(input.substring(start, i));
				backtrack(input, result, curr, i);
				curr.remove(curr.size() - 1);
			}
		}
	}

	private boolean isPalindrome(String input, int start, int end) {

		while (start < end) {
			if (input.charAt(start++) != input.charAt(end--))
				return false;
		}
		return true;
	}
}

package com.deb.ds.leetcode.integers;

public class PalindromeNumber {

	// Leetcode 9- https://leetcode.com/problems/palindrome-number/
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
	}
	
	public static boolean isPalindrome(int x) {
		String data = String.valueOf(x);
		int start = 0;
		int end = data.length() - 1;
		while (start < end) {
			if (data.charAt(start++) != data.charAt(end--))
				return false;
		}
		return true;
	}
}

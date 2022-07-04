package com.deb.ds.leetcode.strings;

public class ReverseString {

	// Tricky Solution
	// Leetcode 344- https://leetcode.com/problems/reverse-string/
	
	public static void main(String[] args) {
		reverseString("Hello".toCharArray());
	}
	public static void reverseString(char[] s) {
		
		int left = 0, right = s.length - 1;
		while (left <= right) {
			char temp = s[left];
			s[left++] = s[right];
			s[right--] = temp;
		}
	}
}

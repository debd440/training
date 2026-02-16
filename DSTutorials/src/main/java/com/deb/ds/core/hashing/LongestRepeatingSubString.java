package com.deb.ds.core.hashing;


public class LongestRepeatingSubString {

    public static int longestRepeating(String s) {
        int maxLength = 1;
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
                maxLength = Math.max(maxLength, count);
            } else {
                count = 1;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(longestRepeating("aaabbccccd")); // 4
    }
}

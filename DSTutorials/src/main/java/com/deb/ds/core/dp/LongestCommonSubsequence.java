package com.deb.ds.core.dp;

public class LongestCommonSubsequence {

    /*
    Given two strings text1 and text2, find the length of the longest subsequence common to both strings.
    A subsequence is obtained by deleting some (or no) characters without changing the order of the remaining characters.
    Example 1: text1 = "abcde", text2 = "ace", LCS = "ace", Answer = 3
    Example 2: String 1 = "ABCBDAB", String 2 = "BDCAB", LCS = "BCAB", Length = 4
     */


    /* Complexity - Time: O(m × n), Space: O(n)*/
    public static int longestCommonSubsequence(String text1, String text2) {

        int m = text1.length();
        int n = text2.length();
        int[] store = new int[n + 1];

        for (int i = 1; i <= m; i++) {
            int diagonal = 0; // Stores store[i-1][j-1]
            for (int j = 1; j <= n; j++) {
                int temp = store[j]; // Save store[i-1][j]
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    store[j] = diagonal + 1;
                } else {
                    store[j] = Math.max(store[j], store[j - 1]);
                }

                diagonal = temp;
            }
        }

        return store[n];
    }

    public static void main(String[] args) {

        String s1 = "abcde";
        String s2 = "ace";

        System.out.println(longestCommonSubsequence(s1, s2));
    }

}

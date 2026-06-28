package com.deb.ds.core.dp;

public class LongestPalindromicSubsequence {

    /*
        Input: "bbbab"
        Possible subsequences:
        bb
        bbb
        bbbb   ← Longest Palindromic Subsequence
        Answer = 4
     */
    public static void main(String[] args) {

        String s = "bbbab";
        int length = longestPalindromeSubseq(s);

        System.out.println("Input : " + s);
        System.out.println("Longest Palindromic Subsequence Length = " + length);
    }

    public static int longestPalindromeSubseq(String s) {

        int n = s.length();
        int[] dp = new int[n];

        // Every single character is a palindrome of length 1
        for (int i = n - 1; i >= 0; i--) {

            dp[i] = 1;
            int diagonal = 0; // Represents dp[i+1][j-1]

            for (int j = i + 1; j < n; j++) {
                int temp = dp[j]; // Save current dp[i+1][j]
                if (s.charAt(i) == s.charAt(j)) {
                    dp[j] = diagonal + 2;
                } else {
                    dp[j] = Math.max(dp[j], dp[j - 1]);
                }

                diagonal = temp;
            }
        }
        return dp[n - 1];
    }
}
package com.deb.ds.core.dp;

public class NumberFactorTest {

    public static int numberFactors(int n) {

        if (n == 0) return 1;
        if (n == 1) return 1;
        if (n == 2) return 1;
        if (n == 3) return 2;

        int a = 1; // dp[0]
        int b = 1; // dp[1]
        int c = 1; // dp[2]
        int d = 2; // dp[3]

        for (int i = 4; i <= n; i++) {

            int next = d + b + a;

            a = b;
            b = c;
            c = d;
            d = next;
        }

        return d;
    }
}

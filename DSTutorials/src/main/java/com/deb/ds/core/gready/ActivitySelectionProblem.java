package com.deb.ds.core.gready;

import java.util.Arrays;

public class ActivitySelectionProblem {

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] finish = {2, 4, 6, 7, 9, 9};

        System.out.println(maxActivities(start, finish)); // O
    }

    private static int maxActivities(int start[], int end[]) {
        Arrays.sort(start);
        Arrays.sort(end);
        int i = 0;
        int count = 0;
        for (int j = 1; j < start.length - 1; j++) {
            if (start[i] < end[j]) {
                count++;
            } else {
                i = j;
            }
        }
        return count;
    }
}

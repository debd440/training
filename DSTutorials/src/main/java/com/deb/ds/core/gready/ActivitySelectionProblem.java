package com.deb.ds.core.gready;

import java.util.Arrays;

public class ActivitySelectionProblem {

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] finish = {2, 4, 6, 7, 9, 9};

        System.out.println(maxActivities(start, finish)); // 4
    }

    private static int maxActivities(int start[], int finish[]) {

        Integer[] idx = new Integer[start.length];
        for (int i = 0; i < start.length; i++) {
            idx[i] = i;
        }
        Arrays.sort(idx, (a, b) -> Integer.compare(finish[a], finish[b]));

        int count = 1;
        int lastFinish = finish[idx[0]];
        for (int j = 1; j < start.length; j++) {
            int i = idx[j];
            if (start[i] > lastFinish) {
                count++;
                lastFinish = finish[i];
            }
        }
        return count;
    }
}

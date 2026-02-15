package com.deb.ds.core.search;

public class FindPeakElement {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};

        int peakIndex = findPeakElements(nums);
        System.out.println("Peak index: " + peakIndex); //2
        System.out.println("Peak element: " + nums[peakIndex]); //3
    }

    static int findPeakElements(int[] a) {

        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (a[mid] < a[mid + 1]) {
                start = mid + 1; //Move Right
            } else {
                end = mid;
            }

        }
        return start;
    }
}

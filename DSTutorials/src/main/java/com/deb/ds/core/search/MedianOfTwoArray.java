package com.deb.ds.core.search;

public class MedianOfTwoArray {

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double median = findMedian(nums1, nums2);
        System.out.println("Median: " + median);

        // Another test case
        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};

        System.out.println("Median: " + findMedian(nums3, nums4));
    }

    private static double findMedian(int[] a, int[] b) {

        int aLength = a.length;
        int bLength = b.length;
        //Always work with smaller array
        if (aLength > b.length) {
            findMedian(b, a);
        }
        int start = 0;
        int end = aLength;
        while (start <= end) {
            int partition1 = (start + end) / 2;
            int partition2 = (aLength + bLength + 1) / 2 - partition1;

            int aLeft = (partition1 == 0) ? Integer.MIN_VALUE : a[partition1 - 1];
            int aRight = (partition1 == aLength) ? Integer.MAX_VALUE : a[partition1];
            int bLeft = (partition2 == 0) ? Integer.MIN_VALUE : b[partition2 - 1];
            int bRight = (partition2 == bLength) ? Integer.MAX_VALUE : b[partition2];

            if (aLeft <= bRight && bLeft <= aRight) {
                if ((aLength + bLength) % 2 == 0) {
                    return (Math.max(aLeft, bLeft) + Math.min(aRight, bRight)) / 2.0;
                } else {
                    return Math.max(aLeft, bLeft);
                }
            } else if (aLeft > bRight) {
                end = partition1 - 1;
            } else {
                start = partition1 + 1;
            }
        }

        return start;
    }
}

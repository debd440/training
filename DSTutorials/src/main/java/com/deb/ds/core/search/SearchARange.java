package com.deb.ds.core.search;

import java.util.Arrays;

public class SearchARange {


    public static void main() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }


    static int findFirst(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;
        int result = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (a[mid] == target) {
                result = mid;
                //Try to find more matching element on left
                end = mid - 1;
            } else if (a[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    static int findLast(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;
        int result = 0;
        while (start < end) {
            int mid = (start + end) / 2;
            if (a[mid] == target) {
                result = mid;
                //Try to find more matching element on right
                start = mid + 1;
            } else if (a[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
}

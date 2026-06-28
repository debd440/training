package com.deb.ds.core.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumTarget {

    public static void main(String[] args) {

        int[] nums = {1, 4, 2, -1, 5, -3};
        int target = 3;
        List<List<Integer>> result = threeSumTarget(nums, target);

        System.out.println("Triplets:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }

    public static List<List<Integer>> threeSumTarget(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first numbers
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int required = target - nums[i];
            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {

                int pairSum = nums[start] + nums[end];
                if (pairSum == required) {
                    result.add(Arrays.asList(nums[i], nums[start], nums[end] ));
                    start++;
                    end--;

                    // Skip duplicate second numbers
                    while (start < end && nums[start] == nums[start - 1]) {
                        start++;
                    }

                    // Skip duplicate third numbers
                    while (start < end && nums[end] == nums[end + 1]) {
                        end--;
                    }

                } else if (pairSum < required) {
                    start++;
                } else {
                    end--;
                }
            }
        }

        return result;
    }
}

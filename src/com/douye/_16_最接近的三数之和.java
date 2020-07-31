package com.douye;

import java.util.Arrays;

public class _16_最接近的三数之和 {
    public int threeSumClosest(int[] nums, int target) {
        int res = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int l = i, r = nums.length-1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (Math.abs(sum-target) < Math.abs(res-target)) {
                    res = sum;
                }
                if (sum > target) {
                    r--;
                } else if (sum < target) {
                    l++;
                } else {
                    return 0;
                }
            }
        }
        return res;
    }
}

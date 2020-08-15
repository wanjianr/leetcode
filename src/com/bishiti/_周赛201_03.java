package com.bishiti;

public class _周赛201_03 {
    public int maxNonOverlapping(int[] nums, int target) {
        int n = 0;
        int front = 0, second = 0;
        int sum = nums[front];
        while (second < nums.length) {
            if (sum == target) {
                n++;
                second++;
                front = second;
                sum = nums[front];
            } else if (sum < target) {
                sum += nums[++second];
            } else {
                second++;
                front = second;
            }
        }
        return n;
    }
}

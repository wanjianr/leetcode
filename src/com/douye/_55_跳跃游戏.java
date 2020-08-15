package com.douye;

public class _55_跳跃游戏 {
    public boolean canJump(int[] nums) {
        int step = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (step < 1) return false;
            step = Math.max(--step,nums[i]);
        }
        return true;
    }
}

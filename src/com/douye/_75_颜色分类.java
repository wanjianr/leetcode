package com.douye;

public class _75_颜色分类 {
    public void sortColors(int[] nums) {
        int left = 0,cur = 0, right = nums.length-1;
        while (cur <= right) {
            if (nums[cur] == 0) {
                swap(nums, left, cur);
                left++;
                cur++;
            } else if (nums[cur] == 2) {
                swap(nums, right, cur);
                right--;
            }
            cur++;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}

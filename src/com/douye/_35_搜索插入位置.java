package com.douye;

public class _35_搜索插入位置 {
    public int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length-1]) return nums.length;
        int l = 0, r = nums.length-1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (target > nums[mid]) {
                l = mid+1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}

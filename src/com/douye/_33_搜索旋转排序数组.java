package com.douye;

public class _33_搜索旋转排序数组 {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length;
        while (l<r) {
            int mid = (l+r) / 2;
            if (target == nums[mid]) {
                return mid;
            }

            if (nums[l] < nums[mid]) { // 左半部分有序
                if (target > nums[l] && target < nums[mid]) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            } else {
                if (target > nums[mid] && target < nums[r-1]) {
                    l = mid + 1;
                } else {
                    r = mid;
                }
            }
        }
        return -1;
    }
}

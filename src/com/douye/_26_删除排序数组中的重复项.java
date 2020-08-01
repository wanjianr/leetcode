package com.douye;

public class _26_删除排序数组中的重复项 {
    public int removeDuplicates(int[] nums) {
        int p=0, q=1;
        while (q < nums.length) {
            if (nums[p] != nums[q]) {
                if (q - p > 1)
                    nums[p+1] = nums[q];
                p++;
            }
            q++;
        }
        return p+1;
    }
}

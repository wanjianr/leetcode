package com.douye;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _18_四数之和 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        if (nums.length < 4 || nums == null) return lists;
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-3; i++) {
            if ((nums[i] + 3 * nums[i+1]) > target) break;  // 优化
            if ((nums[i] + 3 * nums[len-1]) < target) continue;
            if (i>0 && nums[i] == nums[i-1]) continue;  // 去重
            for (int j = i+1; j < nums.length-2; j++) {
                if ((nums[i] + nums[j] + 2 * nums[j+1]) > target) break;
                if ((nums[i] + nums[j] + 2 * nums[len-1]) < target) continue;
                if (j>i+1 && nums[j] == nums[j-1]) continue;
                int l = j+1, r = nums.length-1;
                while (l < r) {
                    int sum = nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum == target) {
                        lists.add(Arrays.asList(nums[i],nums[j],nums[l++],nums[r--]));
                        while (l<r && nums[l] == nums[l-1]) l++;
                        while (l<r && nums[r] == nums[r+1]) r--;
                    } else if (sum > target) {
                        r--;
                    } else {
                        l++;
                    }
                }
            }
        }
        return lists;
    }
}

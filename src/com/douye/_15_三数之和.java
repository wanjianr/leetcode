package com.douye;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15_三数之和 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        if (nums == null || nums.length<1) return lists;
        for (int i = 0; i < nums.length-2 && nums[i] <= 0; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        //int[] l = new int[]{i,j,k};
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        lists.add(list);
                        if (lists.contains(list)){
                            return lists;
                        }
                    }
                }
            }
        }
        return lists;
    }
}

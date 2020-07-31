package com.douye;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15_三数之和 {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3) return null;
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++) {
            if(i>0 && nums[i-1] == nums[i]) continue;
            if(nums[i] > 0) break;
            int l = i+1, r = nums.length-1;
            while(l < r) {
                if(nums[i] + nums[l] + nums[r] == 0) {
                    lists.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while(l < r && nums[l-1] == nums[l]) l++;
                    while(l < r && nums[r] == nums[r+1]) r--;
                } else if (nums[i] + nums[l] + nums[r] > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        _15_三数之和 l = new _15_三数之和();
        List<List<Integer>> lists = l.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println(lists.toString());
    }
}

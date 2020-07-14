package com.douye.hot100.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _1_两数之和 {


    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i,nums[i]);
            if (map.containsValue(target-nums[i])) {
                return new int[] {i,map.get(target-nums[i])};
            }
        }
        return null;
    }

    public int[] twoSum1(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i]) && i != map.get(target-nums[i])) {
                return new int[] {i,map.get(target-nums[i])};
            }
        }
        return null;
    }
}

package com.douye.hot100.easy;

import java.util.HashSet;
import java.util.Set;

public class _136_只出现一次的数字 {

    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        set.add(nums[0]);
        for (Integer integer:nums) {
            if (set.contains(integer)) {
                set.remove(integer);
            } else {
                set.add(integer);
            }
        }
        int res = 0;
        for (Integer integer : set) {
            res = integer;
        }
        return res;
    }

    public int singleNumber1(int[] nums) {
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans  = ans ^ nums[i];
        }
        return ans;
    }
}

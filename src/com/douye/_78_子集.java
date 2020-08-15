package com.douye;

import java.util.ArrayList;
import java.util.List;

public class _78_子集 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        dfs(nums, 0, new ArrayList(), lists);
        return lists;
    }

    private void dfs(int[] nums, int start, List sub, List<List<Integer>> list) {
        if (start == nums.length) return;
        list.add(new ArrayList(sub));
        for (int i = start; i < nums.length; i++) {
            sub.add(nums[i]);
            dfs(nums,i+1,sub,list);
            sub.remove(sub.size()-1);
        }
    }
}

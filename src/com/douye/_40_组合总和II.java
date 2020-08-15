package com.douye;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _40_组合总和II {
    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates,target,new ArrayList(),0);
        return lists;
    }

    public void dfs(int[] nums, int target, List list, int index) {
        if (target == 0) {
            lists.add(new ArrayList<>(list));
            return;
        }
        if (target < 0) return;
        for (int i = index; i < nums.length; i++) {
            if(i > index && nums[i] == nums[i-1]) {
                continue;
            }
            list.add(nums[i]);
            dfs(nums,target-nums[i],list,i+1);
            list.remove(list.size()-1);
        }
    }
}

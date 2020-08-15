package com.douye;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _39_组合总和 {
    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates,target,new ArrayList<>(),0);
        return lists;
    }

    public void dfs(int[] nums, int target, List list, int index) {
        if (target == 0) {
            lists.add(new ArrayList<>(list));
        }
        if (target < 0) return;;
        for (int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            dfs(nums,target - nums[i], list, i);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        _39_组合总和 l = new _39_组合总和();
        l.combinationSum(new int[]{2,3,6,7}, 7);
        System.out.println(l.lists.toString());
    }
}

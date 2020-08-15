package com.douye;

import java.util.ArrayList;
import java.util.List;

public class _46_全排列 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        dfs(nums,0,new ArrayList(),lists);
        return lists;
    }

    private void dfs(int[] nums, int index, List path, List res) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        if (index >= nums.length) return;
        for (int i = 0; i < nums.length; i++) {
            if (path.contains(nums[i])) continue;
            path.add(nums[i]);
            dfs(nums,i,path,res);
            path.remove(path.size()-1);
        }
    }

    // public List<List<Integer>> permute(int[] nums) {
    //     List<List<Integer>> lists = new ArrayList<>();
    //     boolean[] isUsed = new boolean[nums.length];
    //     dfs(nums,0,new ArrayList(),lists, isUsed);
    //     return lists;
    // }

    // private void dfs(int[] nums, int index, List path, List res, boolean[] isUsed) {
    //     if (path.size() == nums.length) {
    //         res.add(new ArrayList<>(path));
    //         return;
    //     }
    //     for (int i = 0; i < nums.length; i++) {
    //         if (isUsed[i]) continue;
    //         path.add(nums[i]);
    //         isUsed[i] = true;
    //         dfs(nums,i,path,res, isUsed);
    //         isUsed[i] = false;
    //         path.remove(path.size()-1);
    //     }
    // }
}

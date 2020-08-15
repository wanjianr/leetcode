package com.douye;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _47_全排列II {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> sets = new HashSet<>();
        boolean[] isUsed = new boolean[nums.length];
        dfs(nums,0,new ArrayList(),sets, isUsed);
        return new ArrayList<>(sets);
    }

    private void dfs(int[] nums, int index, List path, Set res, boolean[] isUsed) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (isUsed[i]) continue;
            path.add(nums[i]);
            isUsed[i] = true;
            dfs(nums,i,path,res, isUsed);
            isUsed[i] = false;
            path.remove(path.size()-1);
        }
    }

    //    public List<List<Integer>> permuteUnique(int[] nums) {
//        List<List<Integer>> lists = new ArrayList<>();
//        boolean[] isUsed = new boolean[nums.length];
//        dfs(nums,0,new ArrayList(),lists, isUsed);
//        Set<List<Integer>> set = new HashSet<>();
//        for (List<Integer> list : lists) {
//            set.add(list);
//        }
//        return new ArrayList<>(set);
//    }
//
//     private void dfs(int[] nums, int index, List path, List res, boolean[] isUsed) {
//         if (path.size() == nums.length) {
//             res.add(new ArrayList<>(path));
//             return;
//         }
//         for (int i = 0; i < nums.length; i++) {
//             if (isUsed[i]) continue;
//             path.add(nums[i]);
//             isUsed[i] = true;
//             dfs(nums,i,path,res, isUsed);
//             isUsed[i] = false;
//             path.remove(path.size()-1);
//         }
//     }
}

package com.douye;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _56_合并区间 {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length < 1) return new int[0][0];
        Arrays.sort(intervals,(o1, o2) -> o1[0]-o2[0]);
        int l = intervals[0][0];
        int r = intervals[0][1];
        List<int[]> list = new ArrayList<>();
        for (int[] interval : intervals) {
            if (interval[0] > r) {
                list.add(new int[]{l,r});
                l = interval[0];
                r = interval[1];
            } else {
                l = Math.min(l,interval[0]);
                r = Math.max(r,interval[1]);
            }
        }
        int[][] res = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}

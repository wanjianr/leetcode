package com.douye.hot100.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class _4_寻找两个正序数组的中位数 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length,l2 = nums2.length,l = l1 + l2;
        int count = l >> 1;
        int i = 0, j = 0;
        double mid = 0.0;
        if (l % 2 != 0) {
            while (count > 0) {
                if (nums1[i] <= nums2[j]) {
                    if (count == 0) mid = nums1[i];
                    if (i == l1-1) continue;
                    i++;
                    count--;

                } else {
                    if (count == 0) mid = nums2[j];
                    if (j == l2-1) continue;
                    j++;
                    count--;

                }
            }
        } else {
            while (count > 0) {
                if (nums1[i] <= nums2[j]) {
                    if (count == 1) mid = nums1[i];
                    if (count == 0) mid = (mid + nums1[i])/2;
                    if (i == l1-1) continue;
                    i++;
                    count--;
                } else {
                    if (count == 1) mid = nums2[j];
                    if (count == 0) mid = (mid + nums2[j])/2;
                    if (j == l2-1) continue;
                    j++;
                    count--;

                }
            }
        }
        return mid;
    }
}

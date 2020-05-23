package com.douye.sort;

import java.util.Arrays;

public class _88_合并两个有序数组 {
    public static void main(String[] args) {
        _88_合并两个有序数组 merge = new _88_合并两个有序数组();
        int[] num1 = {0};//{1,2,3,0,0,0};
        int[] num2 = {1};//{2,5,6};
        merge.merge02(num1,0,num2,1);
        System.out.println(Arrays.toString(num1));
    }

    private int[] leftArray;
    /**
     * 执行用时 :1 ms, 
     * 内存消耗 :40.2 MB
     */
    public void merge01(int[] nums1, int m, int[] nums2, int n) {
        leftArray = new int[nums1.length >> 1];
        for (int i = m; i < m+n; i++) {
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);
    }

    /**
     * 执行用时 :0 ms,
     * 内存消耗 :39.8 MB
     * 注意输入为[0], 0, [1], 1的情况
     */
    public void merge02(int[] nums1, int m, int[] nums2, int n) {
        int last = m + n -1;
        while (n > 0) {
            if (m==0 || nums1[m-1] <= nums2[n-1]) {
                nums1[last--] = nums2[--n];
            } else {
                nums1[last--] = nums1[--m];
            }
        }
    }

}

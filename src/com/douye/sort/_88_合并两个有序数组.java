package com.douye.sort;

import java.util.Arrays;

public class _88_合并两个有序数组 {
    public static void main(String[] args) {
        _88_合并两个有序数组 merge = new _88_合并两个有序数组();
        int[] num1 = {2,0};//{1,2,3,0,0,0};
        int[] num2 = {1};//{2,5,6};
        merge.merge(num1,1,num2,1);
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

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = m + n -1;
        while(n > 0) {
            // 首先就要判断m是否已经越界，越界的话就说明num1已经遍历完成，只剩下num2，直接返回nunm2中的值
            // 错误写法： nums1[l--] = (nums1[m == 0 ? 0 : m-1] > nums2[n-1]) ? nums1[m == 0 ? 0 : --m] : nums2[--n];
            nums1[l--] = (m-1 >= 0 && nums1[m-1] > nums2[n-1]) ? nums1[--m] : nums2[--n];
        }
    }

}

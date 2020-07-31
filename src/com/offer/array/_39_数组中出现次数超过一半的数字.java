package com.offer.array;

import java.util.Arrays;

/**
 * 2020年7月25日15:04:15
 */

public class _39_数组中出现次数超过一半的数字 {
    public int[] majorityElement(int[] nums) {
        // 排序
        // 1. 冒泡排序(记录了最后一个交换的位置)
//        for (int end = nums.length-1; end > 0 ; end--) {
//            int sortedIndex = 0;
//            for (int start = 0; start < end; start++) {
//                if (nums[start] > nums[start+1]) {
//                    swap(nums, start, start+1);
//                    sortedIndex = start+1;
//                }
//            }
//            end = sortedIndex;
//        }

        // 选择排序 (超时)
//        for (int i = nums.length-1; i > 0 ; i--) {
//            int maxValueIndex = 0;
//            for (int j = 0; j <= i; j++) {
//                if (nums[j] > nums[maxValueIndex]) {
//                    maxValueIndex = j;
//                }
//            }
//            swap(nums,maxValueIndex,i);
//        }

        // 插入排序(华东插入代替逐个替换) 80ms
//        for (int i = 1; i < nums.length; i++) {
//            int cur = i;
//            int curValue = nums[cur];
//            while (cur > 0 && (curValue < nums[cur-1])) {
//                //swap(nums,cur,cur-1);
//                nums[cur] = nums[cur-1];
//                cur--;
//            }
//            nums[cur] = curValue;
//        }

        // 基于二分搜索的插入排序
//        for (int i = 1; i < nums.length; i++) {
//            insert(nums,i,binarySearch(nums,i));
//        }
//

        // 归并排序
//        sort(nums,0,nums.length);

        // 快速排序
        quickSort(nums, 0, nums.length);

        return nums;
    }

    private void quickSort(int[] nums, int begin, int end) {
        if (end - begin < 2) return;
        int mid = quick(nums,begin,end);
        quickSort(nums,begin,mid);
        quickSort(nums,mid+1,end);
    }

    private int quick(int[] nums, int begin, int end) {
        swap(nums,begin,begin+(int)(Math.random()*(end-begin)));
        //if (end - begin < 2) return 0;
        int privot = nums[begin];
        end--;
        while (begin < end) {
            while (begin < end) {
                if (nums[end] > privot) {
                    end --;
                } else {
                    nums[begin++] = nums[end];
                    break;
                }
            }

            while (begin < end) {
                if (nums[begin] < privot) {
                    begin ++;
                } else {
                    nums[end--] = nums[begin];
                    break;
                }
            }
        }
        nums[begin] = privot;
        return begin;
    }

    private void sort(int[] nums, int begin, int end) {
        if (end - begin < 2) return;
        int mid = (begin + end) / 2;
        sort(nums, begin,mid);
        sort(nums,mid, end);
        merge(nums,begin,mid,end);
    }

    private void merge(int[] nums, int begin, int mid, int end) {
        int[] leftArray = new int[nums.length >> 1];
        int li = 0, le = mid-begin, ri = mid, re = end, ai = begin;
        for (int i = li; i < le; i++) {
            leftArray[i] = nums[i+begin];
        }
        while (li < le) {
            if (ri < re && leftArray[li] > nums[ri]) {
                nums[ai++] = nums[ri++];
            } else {
                nums[ai++] = leftArray[li++];
            }
        }
    }

    /**
     * 交换数组nums中的两个元素
     * @param nums
     * @param i
     * @param j
     */
    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    /**
     * 在数组nums的dest位置插入元素
     * @param nums
     * @param src
     * @param dest
     */
    private void insert(int[] nums, int src, int dest) {
        int curValue = nums[src];
        for (int i = src; i > dest; i--) {
            nums[i] = nums[i-1];
        }
        nums[dest] = curValue;
    }

    /**
     * 二分法查找nums[index]值在有序数组中的位置
     * @param nums
     * @param index
     * @return
     */
    private int binarySearch(int[] nums, int index) {
        int l = 0, r = index;
        while (l < r) {
            int mid = l + ((r-l) >> 1);
            if (nums[index] > nums[mid]) {
                l = mid+1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        _39_数组中出现次数超过一半的数字 l = new _39_数组中出现次数超过一半的数字();
        int[] ints = l.majorityElement(new int[]{1, 4, 1, 1, 1, 2, 1, 2, 2});
        System.out.println(Arrays.toString(ints));
    }

}

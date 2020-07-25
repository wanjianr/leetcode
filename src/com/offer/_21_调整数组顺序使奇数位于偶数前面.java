package com.offer;

/**
 * 2020-07-25 10:16:58
 * 快慢指针 与 头尾指针
 */
public class _21_调整数组顺序使奇数位于偶数前面 {

    // 快慢指针
    public int[] exchange(int[] nums) {
        // slow指向下一个奇数存放的位置；fast用于搜下下一个奇数
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if ((nums[fast] & 1) == 1) {
                int tmp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = tmp;
                slow ++;
            }
            fast++;
        }
        return nums;
    }

    // 头尾指针
    public int[] exchange1(int[] nums) {
        int l = 0, r = nums.length-1;
        while (l < r) {
            int left = nums[l] & 1;
            int right = nums[r] & 1;
//            if (left == 1 || right == 0) {
//                if (left == 1) {
//                    l++;
//                }
//                if (right == 0) {
//                    r--;
//                }
//                continue;
//            }
            if (left == 1) {
                l++;
                continue;
            }
            if (right == 0) {
                r--;
                continue;
            }
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
            l++;
            r--;
        }
        return nums;
    }
}

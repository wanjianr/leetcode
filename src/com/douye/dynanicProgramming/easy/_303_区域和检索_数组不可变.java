package com.douye.dynanicProgramming.easy;

public class _303_区域和检索_数组不可变 {

    int[] array = null;
    public _303_区域和检索_数组不可变(int[] nums) {
        array = new int[nums.length+1];
        for (int i = 1; i <= nums.length; i++) {
            array[i] = array[i-1] + nums[i-1];
        }
    }

    public int sumRange(int i, int j) {
        return array[j+1]-array[i];
    }

    //    public _303_区域和检索_数组不可变(int[] nums) {
//        this.array = nums;
//    }
//
//    public int sumRange(int i, int j) {
//        int sum = 0;
//        for (int k = i; k <= j; k++) {
//            sum+=array[k];
//        }
//        return sum;
//    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */

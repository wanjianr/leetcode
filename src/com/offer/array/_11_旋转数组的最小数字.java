package com.offer.array;

public class _11_旋转数组的最小数字 {
    public int minArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > numbers[i+1]) {
                return numbers[i+1];
            }
        }
        return numbers[0];
    }

    public int binarySearch(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        while (l < r) {
            int mid = (r-l)/2 + l;
            if (nums[mid] < nums[r]) {
                r = mid;
            } else if (nums[mid] > nums[r]){
                l = mid+1;
            } else {
                r--;
            }
        }
        return nums[l];
    }
}

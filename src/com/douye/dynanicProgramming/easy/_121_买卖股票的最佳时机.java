package com.douye.dynanicProgramming.easy;

public class _121_买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
        if (prices.length < 1) return 0;
        int min = prices[0];
        int max = prices[0];
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(prices[i]-min,max);

            min = Math.min(min,prices[i]);
        }
        return max;
    }
//    public int maxProfit(int[] prices) {
//        if (prices.length < 1) return 0;
//        int min = prices[0], minIndex = 0;
//        int max = prices[0];
//        for (int i = 1; i < prices.length; i++) {
//            if (prices[i] < min) {
//                min = prices[i];
//                minIndex = i;
//            }
//
//            for (int j = minIndex; j < prices.length; j++) {
//                max = Math.max(prices[j]-min,max);
//            }
//        }
//        return max;
//    }
}

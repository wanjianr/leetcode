package com.douye;

public class _5453_所有蚂蚁掉下来前的最后一刻 {

    public int getLastMoment(int n, int[] left, int[] right) {
        int minr=n,maxl=0;
        String str = new String("12");
        for (int i = 0; i < right.length; i++) {
            if (minr > right[i]) minr = right[i];
        }
        for (int i = 0; i < left.length; i++) {
            if (maxl < left[i]) maxl = left[i];
        }
        return Math.max(n-minr,maxl);
    }


    public int getLastMoment1(int n, int[] left, int[] right) {
        int minr=n,maxr=0,minl=n,maxl=0;
        for (int i = 0; i < right.length; i++) {
            if (maxr < right[i]) maxr = right[i];
            if (minr > right[i]) minr = right[i];
        }
        for (int i = 0; i < left.length; i++) {
            if (maxl < left[i]) maxl = left[i];
            if (minl > left[i]) minl = left[i];
        }
        if (left.length < 1) return n-minr;
        if (right.length < 1) return maxl;
        int s = maxl + minr;
        if (s % 2 == 0) {
            return s/2-minr + s/2 > s/2-minr + n-s/2 ? s-minr : n-minr;
        } else {
            return 2*(s/2.0-minr)+minr > 2*(s/2.0-minr)+n-maxl ? (int)(2*(s/2.0-minr)+minr) : (int)(2*(s/2.0-minr)+n-maxl);
        }
    }
}

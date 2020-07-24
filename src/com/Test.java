package com;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}

public class Test {
    public boolean isBanlance(TreeNode root) {
        if (root == null) return true;
        return Math.abs(getDepth(root.left)-getDepth(root.right)) < 2 && isBanlance(root.left) && isBanlance(root.right);
    }
    public int getDepth(TreeNode node) {
        if (node == null) return 0;
        return Math.max(getDepth(node.left),getDepth(node.right)) + 1;
    }

    TreeNode pre;
    public boolean isBST(TreeNode root) {
        if (root == null) return true;
        boolean l = isBST(root.left);
        if (pre != null) {
            if (pre.val >= root.val)
                return false;
        }
        pre = root;
        boolean r = isBST(root.right);
        return l && r;
    }


    public static void main(String[] args) {
        // 获取 Java 线程管理 MXBean
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        // 不需要获取同步的 monitor 和 synchronizer 信息，仅获取线程和线程堆栈信息
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        // 遍历线程信息，仅打印线程 ID 和线程名称信息
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println("[" + threadInfo.getThreadId() + "] " +
                    threadInfo.getThreadName());
        }
    }
}

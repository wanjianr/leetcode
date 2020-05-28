package com.douye.tree;

import java.util.LinkedList;
import java.util.Queue;

public class _559_N叉树的最大深度 {
    public int maxDepth(Node root) {
        if (root == null) return 0;
        Queue<Node> queue = new LinkedList<>();
        Node node = null;
        queue.offer(root);
        int levelSize = 0;
        int count = 1;
        while (!queue.isEmpty()) {
            node = queue.poll();
            count--;
            if (node.children!=null) {
                for (int i = 0; i < node.children.size(); i++) {
                    queue.offer(node.children.get(i));
                }
            }
            if (count == 0) {
                count = queue.size();
                levelSize++;
            }
        }
        return levelSize;
    }
}

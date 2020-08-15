package com.bishiti;

import java.util.*;

class Node {
    String id;    // 部门id
    String name;  // 部门名称
    List<Node> child = new ArrayList<>();  // 子节点列表

    Node (String id, String name) {
        this.id = id;
        this.name = name;
    }
}

/**
 * 用例:      [["d5", "d2", "Frontend"], ["d1", "d0", "IT"], ["d2", "d0", "RD"], ["d6", "d2", "Backend"],["d0", "", "The Company"], ["d3", "d0", "HR"]]
 *
 * 对应输出应该为:     ["The Company","HR","IT","RD","Backend","Frontend"]
 *

 * 输入       [["d1", "d0", "IT"], ["d2", "d0", "RD"], ["d0", "", "The Company"], ["d3", "d0", "HR"]]
 * 输出       ["The Company","HR","IT","RD"]
 */
public class Wangyi04 {
    /**
     * Convert the department list to preorder traversal of the department tree
     * @param departments string字符串二维数组 [["id1", "parentId", "name"]...], there's only one root department with empty parent id.
     * @return string字符串一维数组
     */
    List<String> res = new ArrayList<>();
    public String[] listToTree (String[][] departments) {
        // write code here
        Node root = null;
        Map<String,Node> map = new HashMap<>(); // 部门id作为key，对应的node作为value
        for (String[] department : departments) {
            Node node = new Node(department[0],department[2]);
            map.put(department[0],node);
            if (department[1] == "")
                root = node;
        }
        for (String[] department : departments) {
            if (department[1] != "") {
                map.get(department[1]).child.add(map.get(department[0]));
            }
        }
        res.add(root.name);
        preOrder(root);
        String[] r = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            r[i] = res.get(i);
        }
        return r;

    }
    private void preOrder(Node node) {
        if (node == null) return;
        node.child.sort((o1,o2) -> o1.name.compareTo(o2.name));
        for (Node n : node.child) {
            res.add(n.name);
            preOrder(n);
        }
    }

    public static void main(String[] args) {
        Wangyi04 wangyi04 = new Wangyi04();
        //String[][] strings = {{"d1", "d0", "IT"}, {"d2", "d0", "RD"}, {"d0", "", "The Company"}, {"d3", "d0", "HR"}};
        String[][] strings =  {{"d5", "d2", "Frontend"}, {"d1", "d0", "IT"}, {"d2", "d0", "RD"}, {"d6", "d2", "Backend"},{"d0", "", "The Company"}, {"d3", "d0", "HR"}};
        String[] listToTree = wangyi04.listToTree(strings);
        Arrays.stream(listToTree).forEach(System.out::println);
    }
}

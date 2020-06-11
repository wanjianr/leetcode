package com.douye.tree.binaryTree;

import com.douye.tree.TreeNode;

public class _572_另一个树的子树 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) return false;
        return isSame(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t);
    }

    public boolean isSame(TreeNode s, TreeNode t) {
        if (s==null && t==null) return true;
        if (s==null || t==null) return false;
        if (s.val != t.val) return false;
        return isSame(s.left,t.left) && isSame(s.right,t.right);
    }
}


//    public boolean isSubtree(TreeNode s, TreeNode t) {
//         if (s == null) return false;
//         if (s.val == t.val) {
//             // 递归遍历所有节点
//             if (s.left != null && s.left.val == t.val) return true;
//             if (s.right != null && s.right.val == t.val) return true;
//             return isSame(s.left,t.left) && isSame(s.right,t.right);
// //            if (s==null && t!=null) return false;
// //            if (s!=null && t==null) return false;
// //            if (s==null && t==null) return true;
// //            return isSubtree(s.left,t.left) && isSubtree(s.right,t.right);
//         } else {
//             return isSubtree(s.left,t) || isSubtree(s.right,t);
//         }
//     }

//     public boolean isSame(TreeNode s, TreeNode t) {
//         if (s==null && t!=null) return false;
//         if (s!=null && t==null) return false;
//         if (s==null && t==null) return true;
//         if (s.val != t.val) return false;
//         return isSame(s.left,t.left) && isSame(s.right,t.right);
//     }
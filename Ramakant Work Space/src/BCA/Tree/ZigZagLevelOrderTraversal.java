package BCA.Tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ZigZagLevelOrderTraversal {
//    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//        List<List<Integer>> Parentlist = new ArrayList<>();
//        if (root == null) {
//            return Parentlist;
//        }
//        Queue<TreeNode> queue = new ArrayDeque<>();
//        queue.add(root);
//        boolean toggleFlag = true;
//        while (!queue.isEmpty()) {
//            int n = queue.size();
//            List<Integer> list = new ArrayList<>();
//            for (int i = 0; i < n; i++) {
//                TreeNode frontNode = queue.peek();
//                queue.poll();
//                if (toggleFlag) {
//                    list.add(i, frontNode.data);
//                } else {
//                    list.add(n - 1 - i, frontNode.data);
//                }
//                list.s
//
//                if (frontNode.left != null) {
//                    queue.add(frontNode.left);
//                }
//                if (frontNode.right != null) {
//                    queue.add(frontNode.right);
//                }
//                Parentlist.add(list);
//            }
//            toggleFlag = !toggleFlag;
//        }
//        return Parentlist;
//    }
}

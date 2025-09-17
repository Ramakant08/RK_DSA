package BCA.Tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraaversal {
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> list = new ArrayList<>();
//        if (root == null) {
//            return list;
//        }
//
//        Queue<TreeNode> queue = new ArrayDeque<>();
//        queue.add(root);
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            List<Integer> currentList = new ArrayList<>();
//            for (int i = 0; i < size; i++) {
//                TreeNode fronNode = queue.peek();
//                queue.poll();
//                if (fronNode.left != null) {
//                    queue.add(fronNode);
//                }
//                if (fronNode.right != null) {
//                    queue.add(fronNode);
//                }
//                currentList.add(fronNode.val);
//            }
//
//            list.add(currentList);
//        }
//        return list;
//    }
}

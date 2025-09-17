package BCA.Tree;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class PathSumExistII {
//    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
//        int currentSum = 0;
//        List<List<Integer>> list = new ArrayList<>();
//        List<Integer> currentPath = new ArrayList<>();
//        help(root, targetSum, currentSum, currentPath, list);
//        return list;
//    }

//    public void help(TreeNode root, int targetSum, int currentSum, List<Integer> currentPath, List<List<Integer>> list) {
//        if (root == null) {
//            return;
//        }
//
//        if (root.left == null && root.right == null) {
//            if (currentSum + root.val == targetSum) {
//                list.add(currentPath);
//            }
//        }
//        currentPath.add(root.val);
//        help(root.left, targetSum, currentSum + root.val, currentPath, list);
//        help(root.right, targetSum, currentSum + root.val, currentPath, list);
//        currentPath.remove(currentPath.size() - 1);
//    }
}

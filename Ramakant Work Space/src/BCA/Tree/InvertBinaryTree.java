package BCA.Tree;

import javax.swing.tree.TreeNode;

public class InvertBinaryTree {

    //TC-> O(n)
//    public TreeNode invertTree(TreeNode root) {
//       if(root==null){
//           return null;
//       }
//
//       TreeNode leftSubTreeRoot=invertTree(root.left);
//       TreeNode rightSubTreeRoot=invertTree(root.right);
//
//       root.left=rightSubTreeRoot;
//       root.right=rightSubTreeRoot;
//       return root;
//    }
}

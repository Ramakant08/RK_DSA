package BCA.Tree;

import javax.swing.tree.TreeNode;

public class ValidateABinarySearchTree {


//    public long findMaxLeftElement(TreeNode root){
//        if(root==null){
//            return Integer.MIN_VALUE;
//        }
//        TreeNode leftMax=findMaxLeftElement(root.left);
//        TreeNode rightMax=findMaxLeftElement(root.right);
//
//        return Math.max(Math.max(leftMax.val,rightMax.val),root.val);
//    }

//    public  long findMinRightElement(TreeNode root){
//        if(root==null){
//            return Integer.MIN_VALUE;
//        }
//
//        TreeNode leftMin=findMaxLeftElement(root.left);
//        TreeNode rightMin=findMinRightElement(root.right);
//
//        return  Math.min(Math.min(leftMin.val,rightMin.val),root.val);
//    }

//    public boolean isValidBST(TreeNode root) {
//      if(root==null){
//          return  true;
//      }
//
//      int maxLeftElement=findMaxLeftElement(root.left);
//      int minRightElement=findMinRightElement(root.right);
//
//      if(maxLeftElement>root.val||minRightElement<root.val){
//          return false;
//      }
//
//      return isValidBST(root.left)&&isValidBST(root.right);
//
//    }
}

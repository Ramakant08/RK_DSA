package BCA.Tree;

import org.w3c.dom.Node;

import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.Map;

public class BinaryTreeFromInOrderPreOrder {
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        Map<Integer, Integer> map = new HashMap<>();
//        int n = preorder.length;
//        for (int i = 0; i < n; i++) {
//            map.put(inorder[i], i);
//        }
//
//        return build(preorder,inorder,map,0,n-1,0,n-1);
//    }
//
//    TreeNode build(int[]preorder,int[]inorder,Map<Integer,Integer>rootIndex,int preS,int preE,int inS,int inE){
//        if(preS>preE||inS>inE){
//            return null;
//        }
//
//        int rootNodeData= preorder[preS];
//        int leftRootElements=rootIndex.get(rootNodeData)-inS;
//        int indexOfRootElementInOrder=rootIndex.get(rootNodeData);
//        TreeNode root =new TreeNode(rootNodeData);
//
//
//        Node root.left=build(preorder,inorder,rootIndex,preS+1,preS+leftRootElements,inS,indexOfRootElementInOrder-1);
//        Node root.right=build(preorder,inorder,rootIndex,preS+leftRootElements+1,preE,indexOfRootElementInOrder+1,inE);
//        return  root;
//    }
}

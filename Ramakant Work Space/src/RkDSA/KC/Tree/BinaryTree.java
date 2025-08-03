package RkDSA.KC.Tree;

import java.util.Scanner;

public class BinaryTree {

    public BinaryTree(){
    }

    private static class Node{
       int value;
       Node left;
       Node right;
       public Node(int value){
           this.value=value;
       }
    }

    private Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter the value of root note");
        int value=scanner.nextInt();
        root=new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you enter the left of : "+ node.value);
        boolean isLeft=scanner.nextBoolean();
        if(isLeft){
            int value=scanner.nextInt();
            node.left=new Node(value);
            populate(scanner,node.left);
        }
        System.out.println("Do you enter the right of : "+ node.value);
        boolean isRight=scanner.nextBoolean();
        if(isRight){
            int value=scanner.nextInt();
            node.right=new Node(value);
            populate(scanner,node.right);
        }
    }

    public void display(){
        display(this.root,"");
    }

    private void display(Node node, String indent) {
        if(root==null){
            return;
        }
        System.out.println(indent+root.value);
        display(node.left,indent+"/t");
        display(node.right,indent+"/t");
    }
}

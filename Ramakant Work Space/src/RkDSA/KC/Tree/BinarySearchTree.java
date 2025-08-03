package RkDSA.KC.Tree;

public class BinarySearchTree {
    public class Node {
        private int value;
        private int height;
        private Node leftNode;
        private Node rightNode;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public BinarySearchTree() {
    }

    public int getHeight(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        insert(value, root);
    }

    public Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.getValue()) {
            node.leftNode = insert(value, node.leftNode);
        }

        if (value > node.getValue()) {
            node.rightNode = insert(value, node.rightNode);
        }

        node.height = Math.max(getHeight(node.leftNode), getHeight(node.rightNode)) + 1;
//        return node;
        return rotate(node);
    }

    private Node rotate(Node node) {
        if (getHeight(node.leftNode) - getHeight(node.rightNode) > 1) {
            //left heavy tree
            if (getHeight(node.leftNode.leftNode) - getHeight(node.leftNode.rightNode) > 0) {
                //left left case
                return rightRotate(node);
            }
            if (getHeight(node.leftNode.leftNode) - getHeight(node.leftNode.rightNode) < 0) {
                node.leftNode = leftRotate(node.leftNode);
                return rightRotate(node);
            }
        }
        if (getHeight(node.leftNode) - getHeight(node.rightNode) < -1) {
            if (getHeight(node.rightNode.rightNode) - getHeight(node.rightNode.leftNode) > 0) {
                return leftRotate(node);
            }
            if (getHeight(node.rightNode.rightNode) - getHeight(node.rightNode.leftNode) < 0) {
                node.rightNode = rightRotate(node.rightNode);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node rightRotate(Node p) {
        Node c = p.leftNode;
        Node t = c.rightNode;
        c.rightNode = p;
        p.leftNode = t;
        p.height = Math.max(getHeight(p.leftNode), getHeight(p.rightNode) + 1);
        c.height = Math.max(getHeight(c.leftNode), getHeight(c.rightNode) + 1);
        return c;
    }

    private Node leftRotate(Node c) {
        Node p = c.rightNode;
        Node t = p.leftNode;
        p.leftNode = c;
        c.rightNode = t;
        p.height = Math.max(getHeight(p.leftNode), getHeight(p.rightNode) + 1);
        c.height = Math.max(getHeight(c.leftNode), getHeight(c.rightNode) + 1);
        return p;
    }

    public boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(node.leftNode.height - node.rightNode.height) <= 1 && balanced(node.rightNode) && balanced(node.leftNode);
    }

    public void display() {
        display(root, "root is: ");
    }

    public void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.leftNode, "left node of " + node.value + ": ");
        display(node.rightNode, "left node of " + node.value + ": ");
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length);
    }

    private void populateSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        this.insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid + 1, end);
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value + "  ");
        preOrder(node.leftNode);
        preOrder(node.rightNode);
    }

    private void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.leftNode);
        System.out.println(node.value + " ");
        inOrder(node.rightNode);
    }

    private void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.leftNode);
        postOrder(node.rightNode);
        System.out.println(node.value + " ");
    }

}

package RkDSA.KC.Tree;

public class BinarySegmentTree {

    private static class Node {
        int data;
        int start;
        int end;
        Node leftNode;
        Node rightNode;

        public Node(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    private Node root;

    public BinarySegmentTree(int[] arr) {
        this.root = this.constructSegmentTree(arr, 0, arr.length - 1);
    }

    private Node constructSegmentTree(int[] arr, int start, int end) {
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start, end);
        int mid = (start + end) / 2;
        node.leftNode = constructSegmentTree(arr, start, mid);
        node.rightNode = constructSegmentTree(arr, mid + 1, end);
        node.data = node.leftNode.data + node.rightNode.data;
        return node;
    }

    public void display() {
        dispaly(this.root);
    }

    public void dispaly(Node node) {
        String str = "";
        if (node.leftNode != null) {
            str += "Interval[" + node.leftNode.start + "-" + node.leftNode.end + "]" + " data= " + node.leftNode.data + " +-> ";
        }
        if (node.rightNode != null) {
            str += "Interval[" + node.rightNode.start + "-" + node.rightNode.end + "]" + " data= " + node.rightNode.data + " +-> ";
        }
        if (!str.equals(""))
            System.out.println(str);
        if (node.leftNode != null) {
            dispaly(node.leftNode);
        }
        if (node.rightNode != null) {
            dispaly(node.rightNode);
        }
    }

    public int query(int qsi, int qei) {
        return query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei) {
        if (node.start >= qsi && node.end <= qei) {
            return node.data;
        } else if (node.start > qei || node.end < qsi) {
            return 0;
        } else {
            return query(node.leftNode, qsi, qei) + query(node.rightNode, qsi, qei);
        }
    }

    public void update(int index, int value) {

    }

    public int update(Node node, int index, int value) {
        if (index >= node.start && index <= node.end) {
            if (index == node.start && index == node.end) {
                node.data = value;
                return node.data;
            } else {
                int leftValue = update(node.leftNode, index, value);
                int rightValue = update(node.rightNode, index, value);
                node.data = leftValue + rightValue;
                return node.data;
            }
        }
        return node.data;
    }
}
package RkDSA.KC.LinkedList;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    int size;

    private class Node {
        private int value;
        private Node next;
        private Node previous;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.previous = null;
        if (head != null) {
            head.previous = node;
        }

        if (tail == null) {
            tail = head;
        }

        head = node;
        size++;
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + "->");
            node = node.next;
        }

        System.out.print("end");
    }

    public void displayReverse() {
        Node node = tail;
        while (node != null) {
            System.out.print(node.value + "<-");
            node = node.previous;
        }
        System.out.println("start");
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        node.next = null;
        node.previous = tail;
        if (tail != null) {
            tail.next = node;
        }
        tail = node;
    }

    public void insert(int index, int value) {
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp, temp.previous);
        temp.previous = node;
        temp.previous.previous.next = node;
    }

    public Node getNode(int value) {
        Node node = head;
        while (node.next != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertAfterNode(int afterValue, int nodeValue) {
        Node afNode = getNode(afterValue);
        Node node = new Node(nodeValue);
        node.next = afNode.next;
        node.previous = afNode;
        afNode.next = node;
        if (node.next != null) {
            node.next.previous = node;
        }
    }
}

package RkDSA.KC.LinkedList;

public class CircularLinkedList {

    private Node head;
    private Node tail;

    public CircularLinkedList() {
        head = null;
        tail = null;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insert(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display() {
        Node node = head;
        do {
            System.out.print(node.value + "->");
            node = node.next;
        } while (node != head);

        System.out.println("HEAD");
    }

    public void insertAfterValue(int value, int nodeValue) {
        Node node = new Node(nodeValue);
        Node temp = head;
        do {
            if (temp.value == value) {
                break;
            }
            temp = temp.next;
        } while (temp == head);

        node.next = temp.next;
        temp.next = node;
    }

    public void deleteElement(int elementValue) {
        Node node = head;

        do {
            if (node.next.value == tail.value) {
                node.next = tail.next;
                tail = node;
            }
            if (node.next.value == elementValue && node.next != tail) {
                node.next = node.next.next;
                return;
            }

            node=node.next;

        } while (node.next != head);
    }
}

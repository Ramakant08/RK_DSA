package RkDSA.KC.LinkedList;

public class LinkedListProgram {

    private Node head;
    private Node tails;
    private int size;

    public LinkedListProgram() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tails == null) {
            tails = head;
        }
        size += 1;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }

        System.out.println("end");
    }

    public void insertLast(int value) {
        if (tails == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tails.next = node;
        tails = node;
    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
        }
        if (index == size) {
            insertLast(value);
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    public void deleteFirst() {
        head = head.next;
    }

    public Node getNode(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void deleteLast() {
        Node node = getNode(size - 1);
        tails = node;
        tails.next = null;
    }

    public void delete(int index) {
        if (index == size - 1) {
            deleteLast();
        }

        if (index == 0) {
            deleteFirst();
        }
        Node node = getNode(index);
        Node temp = getNode(index - 1);
        temp.next = node.next;
    }

    public void insertUsingRecursion(int value, int index) {
        head = insertRec(head, index, 7);
    }

    private Node insertRec(Node currentNode, int index, int value) {
        if (index == 0) {
            Node temp = new Node(value, currentNode);
            size++;
            return temp;
        }

        currentNode.next = insertRec(currentNode.next, index - 1, value);
        return currentNode;
    }

    public void recDuplicateRem(LinkedListProgram linkedListProgram) {
        head = duplicate(head);
    }

    public void inPlaceDuplicateRem(LinkedListProgram linkedListProgram) {
        head = duplicate(head);
    }

    private void inPlaceRemoval(Node head) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == temp.next.value) {
                temp = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

    }

    private Node duplicate(Node node) {
        if (node == tails) {
            return node;
        }

        if (node.value == node.next.value) {
            node = duplicate(node.next);
        } else {
            node.next = duplicate(node.next);
        }

        return node;
    }
    // removing duplicates using while loop


    //merging two sorted list
    public void mergeSortedLists(LinkedListProgram list1, LinkedListProgram list2) {
        Node head1 = list1.head;
        Node head2 = list2.head;
        LinkedListProgram linkedListProgram = new LinkedListProgram();

        while (head1 != null && head2 != null) {
            if (head1.value < head2.value) {
                linkedListProgram.insertLast(head1.value);
                head1 = head1.next;
            } else {
                linkedListProgram.insertLast(head2.value);
                head2 = head2.next;
            }
        }

        while (head1 != null) {
            linkedListProgram.insertLast(head1.value);
            head1 = head1.next;
        }

        while (head2 != null) {
            linkedListProgram.insertLast(head2.value);
            head2 = head2.next;
        }
        linkedListProgram.display();
    }

    public void bubbleSort() {
        bubbleSortLL(size - 1, 0);
    }

    public void bubbleSortLL(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            Node first = getNode(col);
            Node second = getNode(col + 1);
            if (second.value < first.value) {
                if (first == head && second == head.next) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tails) {
                    Node prev = getNode(col - 1);
                    prev.next = second;
                    tails = first;
                    second.next = first;
                    first.next = null;

                } else {
                    Node prev = getNode(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
                bubbleSortLL(row, col + 1);
            } else {
                bubbleSortLL(row, col + 1);
            }
        } else {
            bubbleSortLL(row - 1, 0);
        }
    }

    public void reverseRec() {
        linkedListReversal(head);
    }

    public void reverseLL() {
        linkedListReverseInPlace(head);
    }

    private Node linkedListReverseInPlace(Node node) {
        if (size < 2) {
            return head;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;
        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        //not currentb ecause current will be null after the end of this loop
        head = prev;
        return head;
    }

    public void linkedListReversal(Node node) {
        if (node == tails) {
            head = tails;
            return;
        }

        linkedListReversal(node.next);
        tails.next = node;
        tails = node;
        tails.next = null;
    }

    public void reversePartOfList(int left, int right) {
        reverseList(head, left, right);
    }

    private Node reverseList(Node head, int left, int right) {
        if (left == right) {
            return head;
        }

        Node previous = null;
        Node current = head;
        Node next = current.next;
        for (int i = 0; current != null && i < left; i++) {
            previous = current;
            current = current.next;
            next = next.next;
        }


        Node last = previous;
        Node newEnd = current;
        next = current.next;
        for (int i = 0; current != null && i < right - left + 1; i++) {
            current.next = previous;
            previous = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = previous;
        } else {
            head = previous;
        }
        newEnd.next = current;
        return head;
    }

    public void midNode() {
        System.out.println(getMidNode(head).value);
    }

    private Node getMidNode(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public boolean checkPalinDrome() {
        Node node = getMidNode(head);
        Node headSecond = linkedListReverseInPlace(node);
        Node reverseHead = headSecond;
        while (head != null && headSecond != null) {
            if (head.value != headSecond.value) {
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }

        linkedListReverseInPlace(reverseHead);
        if (head == null || headSecond == null) {
            return true;
        }
        return false;
    }


    public Node shiftListKTimes(int k) {
        if (head == null || head.next == null || k <= 0) {
            return head;
        }
        Node last = head;
        int lenght = 1;
        while (last.next != null) {
            last = last.next;
            lenght++;
        }

        last.next = head;
        int rotation = k % lenght;
        int skip = lenght - rotation;
        Node newlast = head;
        for (int i = 0; i < skip - 1; i++) {
            newlast = newlast.next;
        }
        head = newlast.next;
        newlast.next = null;
        return head;


    }
}

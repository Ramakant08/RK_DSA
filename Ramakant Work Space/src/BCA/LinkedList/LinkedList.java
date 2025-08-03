package BCA.LinkedList;

public class LinkedList {
    Node head;
    Node tail;
    int size;

    LinkedList() {
        this.size = 0;
    }

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insert(int value) {    //inserting from start
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        if (tail == null) {
            insert(value);
            return;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("end");
    }

    public static void mergeTwoSortedList(LinkedList list1, LinkedList list2) {
        if (list1 == null || list2 == null) {
            return;
        }

        Node temp1 = list1.head;
        Node temp2 = list2.head;
        Node itr = null;
        Node temp3 = null;
        if (temp1.value < temp2.value) {
            itr = temp1;
            temp1 = temp1.next;
        } else {
            itr = temp2;
            temp2 = temp2.next;
        }

        temp3 = itr;
        while (temp1 != null && temp2 != null) {
            if (temp1.value < temp2.value) {
                itr.next = temp1;
                temp1 = temp1.next;
                itr = itr.next;
            } else {
                itr.next = temp2;
                temp2 = temp2.next;
                itr = itr.next;
            }
        }

        while (temp1 != null) {
            itr.next = temp1;
            temp1 = temp1.next;
            itr = itr.next;
        }
        while (temp2 != null) {
            itr.next = temp2;
            temp2 = temp2.next;
            itr = itr.next;
        }

        display(temp3);

    }

    private static Node findMiddle(LinkedList list) {
        Node fast = list.head;
        Node slow = list.head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

    }

    private static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node curr = head;
        Node next = curr.next;

        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    public static boolean isPalindrome(LinkedList list) {
        if (list.head == null) {
            return true;
        }
        Node head1 = list.head;
        Node head2 = findMiddle(list).next;
        findMiddle(list).next = null;
        head2 = reverseLinkedList(head2);
        while (head1 != null && head2 != null) {
            if (head1.value != head2.value) {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return true;

    }



    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insert(5);
        list1.insert(4);
        list1.insert(3);
        list1.insert(2);
        list1.insert(1);
        display(list1.head);
        LinkedList list2 = new LinkedList();
        System.out.println();
        list2.insert(9);
        list2.insert(8);
        list2.insert(7);
        list2.insert(6);
        display(list2.head);
        System.out.println();
//        mergeTwoSortedList(list1, list2);
        LinkedList list3 = new LinkedList();
        list3.insert(1);
        list3.insert(2);
//        System.out.println(isPalindrome(list3));
        LinkedList list4=new LinkedList();
        list4.insert(1);
        list4.insert(2);


    }
}

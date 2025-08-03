package RkDSA.KC.LinkedList;

public class CLRunner {
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.insert(2);
        circularLinkedList.insert(45);
        circularLinkedList.insert(6);
        circularLinkedList.insert(7);
        circularLinkedList.insert(8);
        circularLinkedList.insert(9);
        circularLinkedList.insert(23);
        circularLinkedList.insertAfterValue(6, 13);
        circularLinkedList.display();
        circularLinkedList.deleteElement(9);
        circularLinkedList.deleteElement(6);
        circularLinkedList.display();
    }
}

package RkDSA.KC.LinkedList;

public class DLLRunner {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertFirst(1);
        doublyLinkedList.insertFirst(2);
        doublyLinkedList.insertFirst(3);
        doublyLinkedList.insertFirst(6);
        doublyLinkedList.insertFirst(7);
        doublyLinkedList.insertFirst(9);
        doublyLinkedList.insertFirst(8);
        doublyLinkedList.insertLast(12);
        doublyLinkedList.insert(4,13);
        doublyLinkedList.insertAfterNode(6,32);
        doublyLinkedList.display();


    }
}

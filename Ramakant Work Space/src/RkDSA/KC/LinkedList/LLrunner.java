package RkDSA.KC.LinkedList;

import org.w3c.dom.Node;

public class LLrunner {
    public static void main(String[] args) {
        LinkedListProgram linkedListProgram1 = new LinkedListProgram();
        LinkedListProgram linkedListProgram2 = new LinkedListProgram();
        LinkedListProgram linkedListProgram3 = new LinkedListProgram();
//        linkedListProgram.insertFirst(1);
//        linkedListProgram.insertFirst(2);
//        linkedListProgram.insertFirst(3);
//        linkedListProgram.insertFirst(4);
//        linkedListProgram.insertFirst(5);
//        linkedListProgram.insertFirst(6);
//        linkedListProgram.insertLast(12);
//        linkedListProgram.insert(45, 3);
//        linkedListProgram.display();
//        linkedListProgram.insertUsingRecursion(7, 3);
////      linkedListProgram.deleteFirst();
////      linkedListProgram.deleteLast();
//        linkedListProgram.display();

        LinkedListProgram linkedListProgram = new LinkedListProgram();
        linkedListProgram.insertFirst(1);
        linkedListProgram.insertFirst(1);
        linkedListProgram.insertFirst(1);
        linkedListProgram.insertFirst(2);
        linkedListProgram.insertFirst(4);
        linkedListProgram.insertFirst(4);
        linkedListProgram.insertFirst(7);
        linkedListProgram.insertFirst(7);
        linkedListProgram.insertFirst(8);
        linkedListProgram.insertFirst(8);
        linkedListProgram.display();
        linkedListProgram.inPlaceDuplicateRem(linkedListProgram);
        linkedListProgram.display();

//        linkedListProgram1.insertFirst(1);
//        linkedListProgram1.insertFirst(2);
//        linkedListProgram1.insertFirst(3);
//        linkedListProgram1.insertFirst(4);
//        linkedListProgram1.display();
//        linkedListProgram2.insertFirst(5);
//        linkedListProgram2.insertFirst(6);
//        linkedListProgram2.insertFirst(7);
//        linkedListProgram2.insertFirst(8);
//        linkedListProgram2.display();
        linkedListProgram3.mergeSortedLists(linkedListProgram1, linkedListProgram2);

//        LinkedListProgram linkedListProgram = new LinkedListProgram();
//        linkedListProgram.insertFirst(9);
//        linkedListProgram.insertFirst(8);
//        linkedListProgram.insertFirst(5);
//        linkedListProgram.insertFirst(7);
//        linkedListProgram.insertFirst(1);
//        linkedListProgram.insertFirst(4);
//        linkedListProgram.insertFirst(6);
//        linkedListProgram.insertFirst(8);
//        linkedListProgram.display();
//        linkedListProgram.bubbleSort();
//        linkedListProgram.display();
//        linkedListProgram.reverseRec();
//        linkedListProgram.reverseLL();
//        linkedListProgram.display();
//        linkedListProgram.reversePartOfList(2, 6);
//        linkedListProgram.midNode();

//        linkedListProgram.display();
//        linkedListProgram.shiftListKTimes(2);
//        linkedListProgram.display();


    }


}

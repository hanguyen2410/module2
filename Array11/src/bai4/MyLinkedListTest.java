package bai4;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList myLinkedList = new MyLinkedList(10);
        myLinkedList.addFirst(16);
        myLinkedList.addFirst(15);
        myLinkedList.addFirst(14);
        myLinkedList.add(4,9);
        myLinkedList.add(4,9);
        myLinkedList.printList();
    }
}

public class Main{
    public static void main(String arg[]){
        doublyLinkedlist Linkedlist = new doublyLinkedlist();
//        Linkedlist.insertAtBeginning(32);
//        Linkedlist.insertAtBeginning(12);
//        Linkedlist.insertAtBeginning(22);
//        Linkedlist.insertAtBeginning(52);
        Linkedlist.insertAtLast(40);
        Linkedlist.insertAtLast(60);
        Linkedlist.insertAtLast(50);
        Linkedlist.insertAtLast(80);
        Linkedlist.insertAtPosition(5,10);
        Linkedlist.printData();
    }
}
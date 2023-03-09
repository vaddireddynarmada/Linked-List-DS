
public class LinkedListMain {
    public static void main(String[] args) {
        MyNode<Integer> Node1 = new MyNode<Integer>(56);
        MyNode<Integer> Node2 = new MyNode<Integer>(30);
        MyNode<Integer> Node3 = new MyNode<Integer>(70);
        LinkedList myLinkedList1 = new LinkedList();
        myLinkedList1.append(Node1);
        myLinkedList1.append(Node2);
        myLinkedList1.append(Node3);
        myLinkedList1.print();
    }
}

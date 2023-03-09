
public class LinkedListMain {
    public static void main(String[] args) {
        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.append(thirdNode);
        System.out.println("Inserting 30 between 56 and 70");
        myLinkedList.insert(firstNode, secondNode);
        myLinkedList.print();
    }
}

public class LinkedListMain {
    public static void main(String[] args) {
        MyNode<Integer> firstNode = new MyNode<Integer>(70);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(56);
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.add(secondNode);
        myLinkedList.add(thirdNode);
        myLinkedList.print();
    }
}

public class LinkedListMain {
    public static void main(String[] args) {
        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.append(thirdNode);
        myLinkedList.insert(firstNode, secondNode);
        System.out.println("Linked list before deletion: ");
        myLinkedList.print();
        INode deletedNode = myLinkedList.popLast();
        System.out.println("The deleted key value is:"+deletedNode.getKey());
    }
}

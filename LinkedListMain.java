
public class LinkedListMain {
    public static void main(String[] args) {
        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.append(thirdNode);
        myLinkedList.insert(firstNode, secondNode);
        myLinkedList.print();
        INode searchedKey = myLinkedList.search(70);
        if(searchedKey.getKey().equals(70)) {
            System.out.println("Key Found");
        }
        else {
            System.out.println("Key Not Found");
        } }
}

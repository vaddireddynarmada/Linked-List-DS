public class SortedLinkedList<K extends Comparable<K>>{
    INode<K> head;
    INode<K> tail;
    int positionOfLastNode;
    public SortedLinkedList() {
        head = null;
        tail = null;
        positionOfLastNode = -1;
    }
    public void add(INode<K> newNode) {
        K newNodeKey = newNode.getKey();
        if(head == null) {
            head = newNode;
            tail = head;
        }
        else if(head.getKey().compareTo(newNodeKey)>0) {
            newNode.setNext(head);
            head = newNode;
        }
        else if(tail.getKey().compareTo(newNodeKey)<0) {
            tail.setNext(newNode);
            tail = newNode;
        }
        else {
            INode<K> temporaryPrevious = head;
            INode<K> temporaryCurrent = head.getNext();
            while((temporaryCurrent != tail) && (temporaryCurrent.getKey().compareTo(newNodeKey)<0)) {
                temporaryPrevious = temporaryCurrent;
                temporaryCurrent = temporaryCurrent.getNext();
            }
            temporaryPrevious.setNext(newNode);
            newNode.setNext(temporaryCurrent);
        }
        positionOfLastNode++;
    }
    public void printSortedLinkedList() {
        System.out.println("My Nodes: " + head);
    }
    public static void main(String[] args) {
        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);
        MyNode<Integer> test = new MyNode<Integer>(66);
        SortedLinkedList mySortedLinkedList = new SortedLinkedList();
        mySortedLinkedList.add(firstNode);
        mySortedLinkedList.add(secondNode);
        mySortedLinkedList.add(thirdNode);
        mySortedLinkedList.add(test);
        System.out.println(" Sorted Linked List");
        mySortedLinkedList.printSortedLinkedList();
    }
}
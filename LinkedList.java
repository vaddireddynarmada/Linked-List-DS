public class LinkedList {
    private INode head;
    private INode tail;

    public LinkedList() {

        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode temporarayNode = this.head;
            this.head = newNode;
            this.head.setNext(temporarayNode);

        }
    }

    public void append(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempINode = this.tail;
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    public void insert(INode previousNode, INode newNode) {
        INode temporaryNode = previousNode.getNext();
        previousNode.setNext(newNode);
        newNode.setNext(temporaryNode);
    }

    public INode pop() {
        INode temporaryNode = this.head;
        this.head = this.head.getNext();
        return temporaryNode;
    }

    public INode popLast() {
        INode temp = head;
        while (!temp.getNext().equals(tail)) {
            temp = temp.getNext();
        }
        this.tail = temp;
        temp = temp.getNext();
        return temp;
    }

    public void print() {
        System.out.println("My Nodes: " + head);
    }
}
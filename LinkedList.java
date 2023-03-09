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
            INode temp = this.head;
            this.head = newNode;
            this.head.setNext(temp);

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

    public void print() {
        System.out.println("My Nodes: " + head);
    }
}
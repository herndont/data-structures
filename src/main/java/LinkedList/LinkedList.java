package LinkedList;

//The inspiration for this code came from studying GeeksforGeeks examples
// at https://www.geeksforgeeks.org/linked-list-set-1-introduction/


public class LinkedList<AnyType> {
    public Node head;

    public LinkedList(AnyType data) {
        this.head = new Node(data);
    }

    public LinkedList() {
        this.head = null;
    }

    public void insert(AnyType data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

//    public boolean includes()

        LinkedList list = new LinkedList();
}




package LinkedList;

public class Node<AnyType> {
    AnyType data;
    Node<AnyType> next;

    public Node(AnyType data) {
        this.data = data;
        this.next = null;
    }
}


package LinkedList;

//The inspiration for this code came from studying GeeksforGeeks examples
// at https://www.geeksforgeeks.org/linked-list-set-1-introduction/


public class LinkedList<T> {
    public Node head;

    public LinkedList(T data) {
        this.head = new Node(data);
    }

    public LinkedList() {
        this.head = null;
    }

    public void insert(T data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public boolean includes(T data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void print() {
        Node current = this.head;
        while (current != null) {
            System.out.println(current.data);
        }
    }
}




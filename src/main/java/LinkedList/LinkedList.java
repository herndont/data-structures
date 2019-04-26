package LinkedList;

import org.omg.IOP.ExceptionDetailMessage;

import java.sql.SQLOutput;

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

    public void append(int value) {
        Node current = this.head;
        if (current == null) {
            this.head = new Node(value);
        }
        while(current.next != null) {
            current = current.next;
        }
        current.next = new Node(value);
    }

    public boolean insertBefore(T data, T newData) {
        Node current = head;
        while(current.next.data != data && current.next != null) {
         current = current.next;
        }
        if(current.next != null) {
            Node new_node = new Node(newData);
            new_node.next = current.next;
            current.next = new_node;
            return true;
        }
        return false;
    }

    public boolean insertAfter(T data, T newData) {
        Node current = head;
        while(current.data != data && current != null) {
            current = current.next;
        }
        if(current != null) {
            Node new_node = new Node(newData);
            new_node.next = current;
            current.next = new_node;
            return true;
        }
        return false;
    }


//    use `throw new IndexOutOfBoundsException();` in your LinkedList class
//    Then for your test file use the below example
//    try {
//        list.findValue(5);
//        assertTrue(false);
//    } catch (IndexOutOfBoundsException e) {
//        assertTrue(true);
//    }

    public T findValue(int k) throws Exception {
        Node current = head;
        T val = null;
        for (int i = this.size()-k; i >= 0; i--) {
            val = (T)current.data;
        }
            if (k > this.size() || k < 0) {
                throw new Exception();
            }
        return val;
    }

    private int size() {
        int size = 0;
        Node current = head;
        while(current.next != null){
            current = current.next;
            size++;
        }
        return size;
    }

    public static Node mergedLists(Node nodeA, Node nodeB){
        if (nodeA == null) {
            return nodeB;
        } else if (nodeB == null){
            return nodeA;
        }
        Node head;
        if (nodeA.compareTo(nodeB) < 0) {
            head = nodeA.next;
        } else {
            head = nodeB;
            nodeB = nodeB.next;
        }
        Node current = head;
        while ((nodeA != null) || (nodeB != null)) {
            if (nodeA == null) {
                current.next = nodeB;
                return head;
            } else if (nodeB == null) {
                current.next = nodeA;
                return head;
            }
            if (nodeA.compareTo(nodeB) < 0) {
                current.next = nodeA;
                current = current.next;
                nodeA = nodeA.next;
            }
            else {
                current.next = nodeB;
                current = current.next;
                nodeB = nodeB.next;
            }
        }
        current.next = null;
        return head;
    }
    }

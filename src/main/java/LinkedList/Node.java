package LinkedList;

public class Node<T> implements Comparable<Node<T>> {
    public T data;
    public Node<T> next;

    public Node (T data) {
        this.data = data;
        this.next = null;
    }
    public int compareTo(Node<T> a) {
        String temp1 = this.toString();
        String temp2 = a.toString();
        return temp1.compareTo(temp2);
    }

    public String toString()
    {
        return data.toString();
    }
}
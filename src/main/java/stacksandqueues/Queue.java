package stacksandqueues;

import java.sql.SQLOutput;

public class Queue {
    public Node front;

    public Queue() {
        this.front = null;
    }

    public void enqueue(int data) {
        Node new_node = new Node(data);
        if (front == null) {
            front = new_node;
        }
        else {
            Node last = front;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
    }

    public int dequeue() {
        if (front == null) {
            System.out.println(0 + "There is nothing in this queue to return");
        }
            int value = 0;
            value = front.data;
            front = front.next;
            return value;
    }

    public int peek() {
        if (front == null) {
            System.out.println("There is nothing in this queue to return");
        }
        return this.front.data;
    }
}

package stacksandqueues;

public class Stack {
    public Node top;

    public Stack() {
        this.top = null;
    }
    public void push(int data) {
        Node new_node = new Node(data);
        new_node.next = top;
        top = new_node;
    }
    public int pop() {
        if (top == null) {
            System.out.println("There are no more nodes in this stack");
        }
        int value = 0;
        value = this.top.data;
        this.top = top.next;
        return value;
    }

    public int peek() {
        if (top == null) {
            System.out.println("There is nothing to peek at in this stack.");
        }
        return this.top.data;
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        }else {
            return false;
        }
    }
}

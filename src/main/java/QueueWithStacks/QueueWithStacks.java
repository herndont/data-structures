package QueueWithStacks;
import stacksandqueues.Stack;


public class QueueWithStacks {
    Stack S1 = new Stack();
    Stack S2 = new Stack();
    public int front;
    public int rear;

    public void enqueue(int value) {
        if (S1.isEmpty()) {
            if (S2.isEmpty()) {
                S1.push(value);
                front = value;
                rear = value;
            } else if (S2.isEmpty() == false) {
                if(S2.peek() == rear) {
                   S2.push(value);
                   rear = value;
                }else if (S2.peek() != rear) {
                    while (S2.isEmpty() == false) {
                        int temp = S2.pop();
                        S1.push(temp);
                    }
                    S1.push(value);
                    rear = value;
                }
            }
        }else if (S1.isEmpty() == false) {
            if (S1.peek() == rear) {
                S1.push(value);
                rear = value;
            }else if (S1.peek() != rear) {
                while (S1.isEmpty() == false) {
                    int temp = S1.pop();
                    S2.push(temp);
                }
                S2.push(value);
                rear = value;
            }
        }
    }

    public int dequeue() throws Exception {
        if (S2.isEmpty()) {
            if (S1.isEmpty()) {
                System.out.println("There is nothing in either stack currently. Please go ahead and add something");
                throw new Exception();
            } else if (S1.isEmpty() == false) {
                if(S1.peek() == front) {
                    int value = S1.pop();
                    front = S1.peek();
                    return value;
                }else if(S1.peek() != front) {
                    while (S1.isEmpty() == false) {
                        int value = S1.pop();
                        S2.push(value);
                    }
                    int value = S2.pop();
                    front = S2.peek();
                    return value;
                }
            }
        } else if (S2.isEmpty() == false) {
            if (S2.peek() == front) {
                int value = S2.pop();
                front = S2.peek();
                return value;
            }else if (S2.peek() != front) {
                while (S2.isEmpty() == false) {
                    int value = S2.pop();
                    S1.push(value);
                }
                int value = S1.pop();
                front = S1.peek();
                return value;
            }
        }
        return 0;
    }
}

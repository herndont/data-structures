package QueueWithStacks;

import java.util.Stack;

public class QueueWithStacks {
    Stack<Integer> S1 = new Stack<>();
    Stack<Integer> S2 = new Stack<>();
        public Node front;
        public Node rear;

        public void enqueue(int value) {
            if(S1 == null) {
                if(S2 == null) {
                    value.push;
                }else if (S2 != null) {
                    while(S2 != null) {
                        next.value = front.next;
                        S1.push(front);
                        S2.pop(front);
                        front = next.value;
                    }
                    S1.push(value);
                }else if(S1 != null) {
                    if(S1.peek == rear) {
                        S1.push(value);
                    }
                }
            }
        }

        public void dequeue() {
            if(S2 == null) {
                if(S2 == null) {
                    S2.pop(front);
                }else if (S1 != null) {
                    while(S1 != null) {
                        next.value = rear.next;
                        S2.push(rear);
                        S1.pop(rear);
                        rear = next.value;
                    }
                    S2.push(value);
                } else if(S2 != null) {
                    if (S2.peek == front) {
                        S2.push(value)
                    }
                }
            }
        }
}

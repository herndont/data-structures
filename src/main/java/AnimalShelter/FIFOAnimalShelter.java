package AnimalShelter;

public class FIFOAnimalShelter {
    public Node front;

    public FIFOAnimalShelter() {
        this.front = null;
    }

    public void enqueue(String data) {
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

    public String dequeue() {
        if (front == null) {
            return null;
        }
        String value = front.data;
        front = front.next;
        return value;
    }
}

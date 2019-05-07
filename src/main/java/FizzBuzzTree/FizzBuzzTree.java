package FizzBuzzTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FizzBuzzTree {

    public Node root;

    public Node FizzBuzzTree(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (queue.isEmpty() == false) {
            Node poppedNode = queue.remove();
            for (int i = 0; i < poppedNode.nodes.size(); i++) {
                queue.add(poppedNode.nodes.get(i));
            }
            if (((int)poppedNode.data % 3) == 0) {
                poppedNode.data = ("Fizz");
            } if (((int)poppedNode.data % 5) == 0) {
                poppedNode.data = ("Buzz");
            } if (((int)poppedNode.data % 3 & (int)poppedNode.data % 5) == 0){
                poppedNode.data = ("FizzBuzz");
            }
        }
        return root;
    }

}

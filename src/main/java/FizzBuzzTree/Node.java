package FizzBuzzTree;

import java.util.ArrayList;

public class Node {
        public Object data;
        public ArrayList<Node> nodes;

        public Node(Object data) {
            this.data = data;
            this.nodes = new ArrayList<Node>();
        }
}

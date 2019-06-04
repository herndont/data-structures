package Graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirst extends Graph {
    Queue<Vertex> queue = new LinkedList<>();

    public void bfs(Vertex root) {
        queue.add(root);
        root.visited = true;
        while (!queue.isEmpty()) {
            Vertex element = queue.remove();
            System.out.println(element.label + "\t");
            List<Vertex> neightbors = element.getNeighbors;
        }
//        Queue<Vertex> queue = new LinkedList<>();
//        if (root == null) {
//            System.out.println("there is nothing in the graph");
//            return;
//        } queue.add(root);
//
//        while(!queue.isEmpty()) {
//            Vertex poppedVertex = queue.remove();
//            System.out.println(" " + poppedVertex.label);
//            if (poppedVertex.)
//        }
    }

}

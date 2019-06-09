package Graph;

import java.util.*;

public class BreadthFirst {

    public Set<Vertex> breadthFirstTraversal(Graph graph, Vertex root) {
        Set<Vertex> visited = new LinkedHashSet<>();
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Vertex vertex = queue.poll();
            for (Vertex v : graph.getNeighbors(vertex)) {
                if (!visited.contains(vertex)) {
                    visited.add(v);
                }
            }
        }
        return visited;
    }
}

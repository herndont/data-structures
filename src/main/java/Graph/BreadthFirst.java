package Graph;

import java.util.*;

public class BreadthFirst extends Graph {

    Set<String> breadthFirstTraversal(Graph graph, String root) {
        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            String vertex = queue.poll();
            for (Vertex v : graph.getNeighbors(vertex)) {
                if (!visited.contains(v.label)) {
                    visited.add(v.label);
                }
            }
        }
        return visited;
    }
}

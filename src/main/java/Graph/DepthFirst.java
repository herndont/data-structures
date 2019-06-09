package Graph;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;

public class DepthFirst {

    //    using depthFirst traversal to return a list of all of the Nodes on the graph
    public Set<Vertex> getNodesDepthFirst(Graph graph, Vertex root) {
        Set<Vertex> visited = new LinkedHashSet<>();
        Stack<Vertex> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Vertex vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                for (Vertex v : graph.getNeighbors(vertex)) {
                    stack.push(v);
                }
            }
        }
        return visited;
    }
}

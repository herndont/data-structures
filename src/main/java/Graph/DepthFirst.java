package Graph;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;

public class DepthFirst extends Graph{

    //    using depthFirst traversal to return a list of all of the Nodes on the graph
    public Set<String> getNodesDepthFirst(Graph graph, String root) {
        Set<String> visited = new LinkedHashSet<>();
        Stack<String> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            String vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                for (Vertex v : graph.getNeighbors(vertex)) {
                    stack.push(v.label);
                }
            }
        }
        return visited;
    }
}

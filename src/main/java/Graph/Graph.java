package Graph;

import java.util.*;

public class Graph {
    private Map<Vertex, List<Vertex>> adjVertices;

//  Adding a vertex *********** Need to figure out logic for adding values on top of the same Vertex
    public void addVertex(String label) {
        adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
    }

//  Adding edge between Vertices
    public void addEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v1);
    }

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

//    utilizing the HashSet named visited from the method above, return the number of vertices within the graph
    public int size(Graph graph, String root) {
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
        int nodeNum = 0;
        for (int i = 0; i < visited.size(); i++) {
            nodeNum = nodeNum + 1;
        }
        return nodeNum;
    }

//    Returns all of the Nodes that are neighbors of the current or selected Node
//    meaning that it returns those Nodes that have edges connecting them
    public List<Vertex> getNeighbors(String label) {
        return adjVertices.get(new Vertex(label));
    }
}
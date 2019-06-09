package Graph;

import java.util.*;

public class Graph {

    private Map<Vertex, List<Vertex>> adjVertices;

    public Graph() {
        this.adjVertices = new HashMap<Vertex, List<Vertex>>();
    }

//  Adding a vertex *********** Need to figure out logic for adding values on top of the same Vertex
    public void addVertex(Vertex label) {
        adjVertices.putIfAbsent(label, new ArrayList<>());
    }

//  Adding edge between Vertices
    public void addEdge(Vertex label1, Vertex label2) {
        Vertex v1 = label1;
        Vertex v2 = label2;
        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v1);
    }


//    utilizing the HashSet named visited from the method above, return the number of vertices within the graph
    public int size(Graph graph, Vertex root) {
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
        int nodeNum = 0;
        for (int i = 0; i < visited.size(); i++) {
            nodeNum = nodeNum + 1;
        }
        return nodeNum;
    }

//    Returns all of the Nodes that are neighbors of the current or selected Node
//    meaning that it returns those Nodes that have edges connecting them
    public List<Vertex> getNeighbors(Vertex label) {
        return adjVertices.get (label);
    }
}
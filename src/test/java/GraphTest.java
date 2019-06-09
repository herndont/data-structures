import Graph.Graph;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void createGraph() {
        Graph graph = new Graph();
        graph.addVertex("Tiller");
        graph.addVertex("Oscar");
        graph.addVertex("Squirt");
        graph.addVertex("Ainsley");
        graph.addVertex("Trey");
        graph.addEdge("Tiller", "Squirt");
        graph.addEdge("Tiller", "Oscar");
        graph.addEdge("Squirt", "Trey");
        graph.addEdge("Trey", "Ainsley");
        graph.addEdge("Oscar", "Ainsley");


        Assert.assertEquals("[]", graph);
    }

//    List<Vertex> getAdjVertices(String label) {
//        return adjVertices.get(new Vertex(label));
//    }

    @Test
    public void addVertex() {
    }

    @Test
    public void addEdge() {
    }

    @Test
    public void getNodesDepthFirst() {

    }

    @Test
    public void size() {
    }

    @Test
    public void getNeighbors() {
    }
}
import Graph.Graph;
import Graph.Vertex;
import org.junit.Assert;
import org.junit.Test;
import Graph.DepthFirst;
import Graph.BreadthFirst;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void createGraph() {

//        Node can be successfully added to the graph
//        Edge can be successfully added to the graph
//
        Graph graph = new Graph();
        Vertex v1= new Vertex("Tiller");
        Vertex v2= new Vertex("Oscar");
        Vertex v3= new Vertex("Squirt");
        Vertex v4= new Vertex("Ainsley");
        Vertex v5= new Vertex("Trey");
        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);
        graph.addVertex(v5);
        graph.addEdge(v1, v3);
        graph.addEdge(v1, v2);
        graph.addEdge(v3, v5);
        graph.addEdge(v5, v4);
        graph.addEdge(v2, v4);


        Assert.assertEquals(5, graph.size(graph, v1));
        Assert.assertNotNull(graph);
        Assert.assertNotEquals(4, graph.size(graph, v2));
    }

    @Test
    public void getNodesBreadthFirst() {

        BreadthFirst breadthFirst = new BreadthFirst();

        Graph graph = new Graph();
        Vertex v1= new Vertex("Tiller");
        Vertex v2= new Vertex("Oscar");
        Vertex v3= new Vertex("Squirt");
        Vertex v4= new Vertex("Ainsley");
        Vertex v5= new Vertex("Trey");
        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);
        graph.addVertex(v5);
        graph.addEdge(v1, v3);
        graph.addEdge(v1, v2);
        graph.addEdge(v3, v5);
        graph.addEdge(v5, v4);
        graph.addEdge(v2, v4);

        Set<Vertex> bFT = breadthFirst.breadthFirstTraversal(graph, v3);

        Assert.assertEquals(true, bFT.contains(v1));

    }


    @Test
    public void getNodesDepthFirst() {

        DepthFirst depthFirst = new DepthFirst();

        Graph graph = new Graph();
        Vertex v1= new Vertex("Tiller");
        Vertex v2= new Vertex("Oscar");
        Vertex v3= new Vertex("Squirt");
        Vertex v4= new Vertex("Ainsley");
        Vertex v5= new Vertex("Trey");
        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);
        graph.addVertex(v5);
        graph.addEdge(v1, v3);
        graph.addEdge(v1, v2);
        graph.addEdge(v3, v5);
        graph.addEdge(v5, v4);
        graph.addEdge(v2, v4);

        Set<Vertex> dFS = depthFirst.getNodesDepthFirst(graph, v1);

        Assert.assertEquals(true, dFS.contains(v1));
        Assert.assertEquals(true, dFS.contains(v2));
        Assert.assertEquals(true, dFS.contains(v4));

    }

    @Test
    public void getNeighbors() {

        Graph graph = new Graph();
        Vertex v1 = new Vertex("Tiller");
        Vertex v2 = new Vertex("Oscar");
        Vertex v3 = new Vertex("Squirt");
        Vertex v4 = new Vertex("Ainsley");
        Vertex v5 = new Vertex("Trey");
        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);
        graph.addVertex(v5);
        graph.addEdge(v1, v3);
        graph.addEdge(v1, v2);
        graph.addEdge(v3, v5);
        graph.addEdge(v5, v4);
        graph.addEdge(v2, v4);

        List<Vertex> neighbors = graph.getNeighbors(v1);

        Assert.assertEquals(false, neighbors.contains("Squirt"));
    }
}
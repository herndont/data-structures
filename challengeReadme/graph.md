# Tree Intersection
## Code Challenge 32

### Challenge Description
    - Implement your own graph. This graph should be represented as an adjacency list and should include the following methods.
        - AddNode()
            - Adds a new node to the graph
            - Takes in the value of that node
            - returns the added node
        - AddEdge()
            - Adds a new edge between two nodes in the graph
            - include the ability to have a "weight"
            - Takes in the two nodes to be connected by the edge
                -Both nodes should already be in the graph
        - GetNodes()
            - Returns a collection of nodes connected to the given node
            - Takes in a given node
            - Includes the weight of the connection in the returned collection
        - Size()
            - Returns the total number of nodes in the graph
    
    
    - Structure and Testing
        Write tests to prove the following functionality:
            - Node can be successfully added to the graph
            - An edge can be successfully added to the graph
            - A collection of all nodes can be properly retrieved from the graph
            - All appropriate neighbors can be retrieved from the graph
            - Neighbors are returned with the weight between nodes included
            - The proper size is returned, representing the number of nodes in the graph
            - A graph with only one node and edge can be properly returned
            - An empty graph properly returns null


### Approach & Efficiency
    
    Inspiration and help online:
        - https://www.baeldung.com/java-graphs
        - https://www.geeksforgeeks.org/graph-and-its-representations/
        
        
### Solution
[Code Solution](/src/main/java/Graph/Graph.java)

[Code Tests](/src/test/java/GraphTest.java)

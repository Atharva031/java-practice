import java.util.*;

public class DepthFirstSearch {
    private LinkedList<Integer>[] adjacencyList;
    private boolean[] visitedNodes;

    // Constructor to initialize the graph with 'vertexCount' vertices
    DepthFirstSearch(int vertexCount) {
        adjacencyList = new LinkedList[vertexCount];
        visitedNodes = new boolean[vertexCount];

        for (int i = 0; i < vertexCount; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // Method to add an edge from vertex 'source' to vertex 'destination'
    void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }

    // Utility method for DFS traversal
    private void dfsUtil(int vertex) {
        // Mark the current node as visited and print it
        visitedNodes[vertex] = true;
        System.out.print(vertex + " ");

        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> iterator = adjacencyList[vertex].listIterator();
        while (iterator.hasNext()) {
            int adjacentVertex = iterator.next();
            if (!visitedNodes[adjacentVertex]) {
                dfsUtil(adjacentVertex);
            }
        }
    }

    // Method to perform DFS traversal starting from a given vertex
    void performDFS(int startVertex) {
        // Reset visited nodes before performing DFS
        Arrays.fill(visitedNodes, false);
        dfsUtil(startVertex);
        System.out.println();
    }

    // Main method to test the DepthFirstSearch class
    public static void main(String[] args) {
        DepthFirstSearch graph = new DepthFirstSearch(6);

        // Adding edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        System.out.println("Depth First Search (starting from vertex 0):");
        graph.performDFS(0); // Should print DFS traversal starting from vertex 0
    }
}

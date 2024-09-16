import java.util.Iterator;
import java.util.LinkedList;

public class BreadthFirstSearch {
    private LinkedList<Integer>[] adjacencyList;

    // Constructor to initialize the graph with 'vertexCount' vertices
    BreadthFirstSearch(int vertexCount) {
        adjacencyList = new LinkedList[vertexCount];
        for (int i = 0; i < vertexCount; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // Method to add an edge from vertex 'source' to vertex 'destination'
    void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }

    // Method to perform BFS traversal starting from a given vertex
    void performBFS(int startVertex) {
        boolean[] visitedNodes = new boolean[adjacencyList.length];
        LinkedList<Integer> queue = new LinkedList<>();

        // Mark the start vertex as visited and enqueue it
        visitedNodes[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            // Dequeue a vertex from the queue and print it
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            // Iterate through all adjacent vertices of the dequeued vertex
            Iterator<Integer> iterator = adjacencyList[currentVertex].listIterator();
            while (iterator.hasNext()) {
                int adjacentVertex = iterator.next();
                if (!visitedNodes[adjacentVertex]) {
                    // Mark the adjacent vertex as visited and enqueue it
                    visitedNodes[adjacentVertex] = true;
                    queue.add(adjacentVertex);
                }
            }
        }
        System.out.println();
    }

    // Main method to test the BreadthFirstSearch class
    public static void main(String[] args) {
        BreadthFirstSearch graph = new BreadthFirstSearch(6);

        // Adding edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        System.out.println("Breadth First Search (starting from vertex 0):");
        graph.performBFS(0); // Should print BFS traversal starting from vertex 0
    }
}

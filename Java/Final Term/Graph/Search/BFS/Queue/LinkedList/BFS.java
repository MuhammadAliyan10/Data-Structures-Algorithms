import java.util.LinkedList;
import java.util.Queue;

class Graph {
    int[][] adjMatrix;
    public int numVertices;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int source, int destination) {
        if (source >= 0 && source < numVertices && destination >= 0 && destination < numVertices) {
            adjMatrix[source][destination] = 1;
            adjMatrix[destination][source] = 1;
        } else {
            System.out.println("Invalid Edge");
        }
    }

    public int[] getAdjVertices(int vertex) {
        return adjMatrix[vertex];
    }
}

public class BFS {
    public static void bfs(Graph graph, int start, int numVertices) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[numVertices];
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");
            int[] adjVertices = graph.getAdjVertices(vertex);
            for (int i = 0; i < numVertices; i++) {
                if (adjVertices[i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numVertices = 10;
        Graph graph = new Graph(numVertices);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);
        graph.addEdge(3, 7);
        graph.addEdge(4, 8);
        graph.addEdge(5, 9);

        bfs(graph, 0, numVertices);
    }
}

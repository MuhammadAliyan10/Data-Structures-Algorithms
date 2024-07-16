import java.util.LinkedList;

class Stack<T> {
    private LinkedList<T> list = new LinkedList<>();

    public void push(T item) {
        list.addFirst(item);
    }

    public T pop() {
        return list.removeFirst();
    }

    public T peek() {
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}

class Graph {
    private LinkedList<Integer>[] adjacencyList;

    @SuppressWarnings("unchecked")
    public Graph(int numVertices) {
        adjacencyList = new LinkedList[numVertices];
        for (int i = 0; i < numVertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest) {
        adjacencyList[src].add(dest);
        adjacencyList[dest].add(src);
    }

    public LinkedList<Integer> getAdjVertices(int vertex) {
        return adjacencyList[vertex];
    }
}

public class DFS {
    public static void dfs(Graph graph, int start, int numVertices) {
        Stack<Integer> stack = new Stack<>();
        boolean visited[] = new boolean[numVertices];
        stack.push(start);
        visited[start] = true;
        while (!stack.isEmpty()) {
            int vertex = stack.pop();
            System.out.print(vertex + " "); // Changed to print instead of println
            for (int adjVertex : graph.getAdjVertices(vertex)) {
                if (!visited[adjVertex]) {
                    stack.push(adjVertex);
                    visited[adjVertex] = true;
                }
            }
        }
        System.out.println(); // Add a new line after the DFS completes
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

        dfs(graph, 0, numVertices);
    }
}

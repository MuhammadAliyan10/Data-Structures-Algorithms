class Stack {
    private int[] stackArray;
    private int top;

    public Stack(int capacity) {
        stackArray = new int[capacity];
        top = -1;
    }

    public void push(int number) {
        if (top < stackArray.length - 1) {
            stackArray[++top] = number;
        } else {
            System.out.println("The stack is full.");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            System.out.println("No value is in the stack.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

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

public class DFS {
    public static void dfs(Graph graph, int start, int numVertices) {
        Stack stack = new Stack(numVertices);
        boolean[] visited = new boolean[numVertices];
        stack.push(start);
        visited[start] = true;
        while (!stack.isEmpty()) {
            int vertex = stack.pop();
            System.out.print(vertex + " ");
            int[] adjVertices = graph.getAdjVertices(vertex);
            for (int i = 0; i < numVertices; i++) {
                if (adjVertices[i] == 1 && !visited[i]) {
                    stack.push(i);
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

        dfs(graph, 0, numVertices);
    }
}

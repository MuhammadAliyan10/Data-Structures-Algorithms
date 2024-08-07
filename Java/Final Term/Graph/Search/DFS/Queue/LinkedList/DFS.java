class QueueNode {
    int data;
    QueueNode next;

    QueueNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private QueueNode front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    public void enqueue(int data) {
        QueueNode newNode = new QueueNode(data);
        if (this.rear == null) {
            this.front = this.rear = newNode;
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
    }

    public int dequeue() {
        if (this.front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = this.front.data;
        this.front = this.front.next;
        if (this.front == null) {
            this.rear = null;
        }
        return data;
    }

    public boolean isEmpty() {
        return this.front == null;
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
        Queue queue = new Queue();
        boolean[] visited = new boolean[numVertices];
        queue.enqueue(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int vertex = queue.dequeue();
            System.out.print(vertex + " ");
            int[] adjVertices = graph.getAdjVertices(vertex);

            for (int i = 0; i < numVertices; i++) {
                if (adjVertices[i] == 1 && !visited[i]) {
                    queue.enqueue(i);
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

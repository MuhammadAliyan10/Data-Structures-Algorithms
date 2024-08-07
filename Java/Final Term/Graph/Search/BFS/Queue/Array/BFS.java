
class QueueArray {
    private int[] queueArray;
    private int front;
    private int rear;
    private int size;

    public QueueArray(int capacity) {
        queueArray = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int number) {
        if (size < queueArray.length) {
            rear = (rear + 1) % queueArray.length;
            queueArray[rear] = number;
            size++;
        } else {
            System.out.println("The queue is full.");
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int number = queueArray[front];
            front = (front + 1) % queueArray.length;
            size--;
            return number;
        } else {
            System.out.println("No value is in the queue.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return size == 0;
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

public class BFS {
    public static void bfs(Graph graph, int start, int numVertices) {
        QueueArray queue = new QueueArray(numVertices);
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

        bfs(graph, 0, numVertices);
    }
}

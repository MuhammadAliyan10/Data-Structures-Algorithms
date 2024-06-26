package Java.Graph;

import java.util.Scanner;

public class Graph {
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

    public void removeEdge(int source, int destination) {
        if (source >= 0 && source < numVertices && destination >= 0 && destination < numVertices) {
            adjMatrix[source][destination] = 0;
            adjMatrix[destination][source] = 0;
        } else {
            System.out.println("Invalid Edge");
        }
    }

    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int vertices = value.nextInt();
        Graph graph = new Graph(vertices);

        System.out.print("Enter the number of edges: ");
        int edges = value.nextInt();

        for (int i = 0; i < edges; i++) {
            System.out.print("Enter source for edge " + (i + 1) + ": ");
            int source = value.nextInt();
            System.out.print("Enter destination for edge " + (i + 1) + ": ");
            int destination = value.nextInt();
            graph.addEdge(source, destination);
        }

        graph.printGraph();

        value.close();
    }
}

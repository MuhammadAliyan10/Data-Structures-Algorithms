package Java.Graph.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Graph {
    public LinkedList<Integer>[] adjList;
    public int numVertices;

    @SuppressWarnings("unchecked")
    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjList = new LinkedList[numVertices];
        for (int i = 0; i < numVertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        if (source >= 0 && source < numVertices && destination >= 0 && destination < numVertices) {
            adjList[source].add(destination);
            adjList[destination].add(source);
        } else {
            System.out.println("Invalid source and destination.");
        }
    }

    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + ":");
            for (Integer vertex : adjList[i]) {
                System.out.print(" -> " + vertex);
            }
            System.out.println();
        }
    }

    public void showGraph() {
        System.out.println("Graph with Edge Information:");
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + ":");
            for (Integer vertex : adjList[i]) {
                System.out.print(" -> " + vertex);
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

        System.out.println("Graph structure:");
        graph.showGraph();
        value.close();

    }
}

package com.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class AdjMatrixNonWeightedGraph1 {
    private int vertexCount;
    private int edgeCount;
    private int[][] adjmat;

    public AdjMatrixNonWeightedGraph1(int vertexCount) {
        this.edgeCount = 0;
        this.vertexCount = vertexCount;
        this.adjmat = new int[vertexCount][vertexCount]; // 2D array allocation

        // Initializing the adjacency matrix
        for (int i = 0; i < vertexCount; i++) {
            for (int j = 0; j < vertexCount; j++) {
                adjmat[i][j] = 0;
            }
        }
    }

    public void accept(Scanner sc) {
        System.out.println("Enter number of edges: ");
        edgeCount = sc.nextInt();
        for (int i = 0; i < edgeCount; i++) {
            System.out.println("Enter edge (src dest): ");
            int src = sc.nextInt();
            int dest = sc.nextInt();

            // Validate the input to ensure vertices are within bounds
            if (src < 0 || src >= vertexCount || dest < 0 || dest >= vertexCount) {
                System.out.println("Invalid edge! Vertices must be between 0 and " + (vertexCount - 1));
                i--; // Decrement i to retry the edge entry
                continue; // Skip this iteration and retry
            }

            adjmat[src][dest] = 1;
            adjmat[dest][src] = 1; // Remove this line for directed graph
        }
    }

    public void display() {
        System.out.println("\nAdjacency Matrix:");
        for (int i = 0; i < vertexCount; i++) {
            for (int j = 0; j < vertexCount; j++) {
                System.out.print(adjmat[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void bfsTraversal(int start) {
        System.out.print("BFS Traversal: ");
        boolean[] marked = new boolean[vertexCount];
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        marked[start] = true;

        while (!q.isEmpty()) {
            int trav = q.poll();
            System.out.print(trav + " ");

            for (int dest = 0; dest < vertexCount; dest++) {
                if (adjmat[trav][dest] != 0 && !marked[dest]) { // Check adjacency and mark
                    q.offer(dest);
                    marked[dest] = true;
                }
            }
        }
        System.out.println(); // New line after BFS traversal completes
    }
    public void dfsTraversal(int start) {
        System.out.print("DFS Traversal: ");
        boolean[] marked = new boolean[vertexCount];
        Stack<Integer> s = new Stack<>();
        s.push(start);
        marked[start] = true;

        while (!s.isEmpty()) {
            int trav = s.pop();
            System.out.print(trav + " ");

            for (int dest = 0; dest < vertexCount; dest++) {
                if (adjmat[trav][dest] != 0 && !marked[dest]) { // Check adjacency and mark
                    s.push(dest);
                    marked[dest] = true;
                }
            }
        }
        System.out.println(); // New line after BFS traversal completes
    }
}

public class GraphBfsDfsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices: ");
        int vertexCount = sc.nextInt();
        AdjMatrixNonWeightedGraph1 g = new AdjMatrixNonWeightedGraph1(vertexCount);
        g.accept(sc);
        g.bfsTraversal(0); // Starting BFS from vertex 0
        g.dfsTraversal(0);
        g.display(); // Displaying the adjacency matrix
        sc.close();
    }
}


/*
6
7
0 1
0 2
0 3
1 2
1 4 
3 4 
3 5

copy these and pest to check all data entry 


*/



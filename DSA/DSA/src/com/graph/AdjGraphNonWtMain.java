package com.graph;

import java.util.LinkedList;
import java.util.Scanner;

class AdjListNonWeightedGraph {
	private int vertexCount, edgeCount;
	private LinkedList<Integer>[] adjList;

	// Constructor
	public AdjListNonWeightedGraph(int vertexCount) {
		this.vertexCount = vertexCount;  // Properly assign the instance variable
		this.edgeCount = 0;
		adjList = new LinkedList[vertexCount]; // Allocate memory for adjacency list

		// Initialize each adjacency list
		for (int i = 0; i < vertexCount; i++) {
			adjList[i] = new LinkedList<Integer>();
		}
	}

	// Method to accept edges
	public void accept(Scanner sc) {
		System.out.print("Enter number of edges : ");
		edgeCount = sc.nextInt();
		for (int i = 0; i < edgeCount; i++) {
			System.out.print("Enter edge (src dest): ");
			int src = sc.nextInt();
			int dest = sc.nextInt();
			adjList[src].add(dest);
			adjList[dest].add(src); // Remove this line for a directed graph
		}
	}

	// Method to display the adjacency list
	public void display() {
		for (int v = 0; v < vertexCount; v++) {
			System.out.print("Vertex " + v + " --> ");
			for (Integer dest : adjList[v]) {
				System.out.print(dest + " --> ");
			}
			System.out.println();
		}
	}
}

public class AdjGraphNonWtMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of vertices: ");
		int vertexCount = sc.nextInt();
		AdjListNonWeightedGraph g = new AdjListNonWeightedGraph(vertexCount);
		g.accept(sc);
		g.display();
		sc.close();
	}
}

/*
Sample Input:
6
7
0 1
0 2
0 3
1 2
1 4 
3 4 
3 5

Copy and paste this input to test.
*/

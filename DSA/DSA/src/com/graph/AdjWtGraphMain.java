package com.graph;

import java.util.LinkedList;
import java.util.Scanner;


class AdjListWeightedGraph {
	
	static class Edge{
		private int src;
		private int dest;
		private int weight;
		public Edge() {
			
		}
		public Edge(int src, int dest, int weight) {
			super();
			this.src = src;
			this.dest = dest;
			this.weight = weight;
		}
		@Override
		public String toString() {
			return String.format("[%s-->%s dest (%s)]", src, dest, weight);
		}
		
		
	}
	
	private int vertexCount, edgeCount;
	private LinkedList<Edge>[] adjList;

	// Constructor
	public AdjListWeightedGraph(int vertexCount) {
		this.vertexCount = vertexCount; // Properly assign the instance variable
		this.edgeCount = 0;
		adjList = new LinkedList[vertexCount]; // Allocate memory for adjacency list

		// Initialize each adjacency list
		for (int i = 0; i < vertexCount; i++) {
			adjList[i] = new LinkedList<Edge>();
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
			int wt =sc.nextInt();
			adjList[src].add(new Edge(src ,dest,wt));
			adjList[dest].add(new Edge(dest ,src,wt));
		}
	}

	// Method to display the adjacency list
	public void display() {
		for (int v = 0; v < vertexCount; v++) {
			System.out.print("Vertex " + v + " --> ");
			for (Edge e : adjList[v]) {
				System.out.print(e + " --> ");
			}
			System.out.println();
		}
	}
}

public class AdjWtGraphMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of vertices: ");
		int vertexCount = sc.nextInt();
		AdjListWeightedGraph g = new AdjListWeightedGraph(vertexCount);
		g.accept(sc);
		g.display();
		sc.close();
	}
}

/*
6
7
0 1 7
0 2 4
0 3 8
1 2 9
1 4 5
3 4 6
3 5 2

copy these and pest to check all data entry 


*/

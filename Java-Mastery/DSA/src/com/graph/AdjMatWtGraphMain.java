package com.graph;

import java.util.Scanner;

class AdjMatrixWeightedGraph {
	public static final int INF =999;
	private int vertexCount;
	private int edgeCount;
	private int[][] adjmat;

	public AdjMatrixWeightedGraph(int vertexCount) {
		this.edgeCount = 0;
		this.vertexCount = vertexCount;
		this.adjmat = new int[vertexCount][vertexCount]; // 2d array allocate

		for (int i = 0; i < vertexCount; i++) {
			
			for (int j = 0; j < vertexCount; j++) {
				adjmat[i][j] = INF;
			}

		}
	}

	public void accept(Scanner sc) {
		System.out.println("Enter number of edges : ");
		edgeCount = sc.nextInt();
		for (int i = 0; i < edgeCount; i++) {
			System.out.println("enter edge (src dest weight: )");
			int src = sc.nextInt();
			int dest = sc.nextInt();
			int weight = sc.nextInt();
			adjmat[src][dest] = weight;
			adjmat[dest][src] = weight;

		}

	}

	public void display() {
		System.out.println("\nAdjancecy Matrix");
		for (int i = 0; i < vertexCount; i++) {
			for (int j = 0; j < vertexCount; j++) {
				if(adjmat[i][j]==INF)
					System.out.print("X\t");
				else
				System.out.print(adjmat[i][j] + "\t");
			}
			System.out.println();

		}
	}

}

public class AdjMatWtGraphMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of vertices: ");
		int vertexCount = sc.nextInt();
		AdjMatrixWeightedGraph g = new AdjMatrixWeightedGraph(vertexCount);
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

package com.graph;

import java.util.Scanner;

class AdjMatrixNonWeightedGraph {
	private int vertexCount;
	private int edgeCount;
	private int[][] adjmat;

	public AdjMatrixNonWeightedGraph(int vertexCount) {
		this.edgeCount = 0;
		this.vertexCount = vertexCount;
		this.adjmat = new int[vertexCount][vertexCount]; // 2d array allocate

		for (int i = 0; i < vertexCount; i++) {
			for (int j = 0; j < vertexCount; j++) {
				adjmat[i][j] = 0;
			}

		}
	}

	public void accept(Scanner sc) {
		System.out.println("Enter number of edges : ");
		edgeCount = sc.nextInt();
		for (int i = 0; i < edgeCount; i++) {
			System.out.println("enter edge (src dest: )");
			int src = sc.nextInt();
			int dest = sc.nextInt();
			adjmat[src][dest] =1;
			adjmat[dest][src] =1;  //delete this line for directed graph 
			
		}
		
	}
	public void display(){
		System.out.println("\nAdjancecy Matrix");
		for (int i = 0; i < vertexCount; i++) {
			for (int j = 0; j < vertexCount; j++) {
				System.out.print(adjmat[i][j]+"\t");
			}System.out.println();

		}
	}

}

public class AdjMatNonWtGraphMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of vertices: ");
		int vertexCount =sc.nextInt();
		AdjMatrixNonWeightedGraph g = new AdjMatrixNonWeightedGraph(vertexCount);
		g.accept(sc);
		g.display();
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



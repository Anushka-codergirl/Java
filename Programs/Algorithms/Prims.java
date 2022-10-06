package com;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int noOfNodes = sc.nextInt();
		int numberOfEdges = sc.nextInt();
		
		int[][] T = new int[noOfNodes][numberOfEdges];
		int min = 0, result = 0;
		
		boolean[] visited = new boolean[numberOfEdges];

		int v = 0;
		
		final int MAX_WEIGHT = 1000000;

		for (int i = 0; i < noOfNodes; i++) {
			Arrays.fill(T[i], MAX_WEIGHT);
		}
		
		for (int i = 0; i < numberOfEdges; i++) {

			int firstNode = sc.nextInt() - 1;
			int secondNode = sc.nextInt() - 1;
			int weight = sc.nextInt();
			
			T[firstNode][secondNode] = weight;
			T[secondNode][firstNode] = T[firstNode][secondNode];

		}
		
		for (int k = 1; k <= noOfNodes; k++) {
			min = MAX_WEIGHT;

			for (int i = 0; i < numberOfEdges; i++) {
				
				if (visited[i]){
					for (int j = 0; j < numberOfEdges; j++) {

						if (!visited[j]) {
							if (min > T[i][j]) {
								min = T[i][j];
								v = j;
							}
						}
					}
				}
			}
			
			visited[v] = true;
			
			if (min < MAX_WEIGHT)
				result += min;
		}
		
		System.out.println(result);
		
		sc.close();
	}
}

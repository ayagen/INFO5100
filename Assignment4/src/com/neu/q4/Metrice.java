package com.neu.q4;

public class Metrice {

	public int[][] multiMetrices(int[][] A, int[][] B) {
		int[][] result = new int[A.length][B[0].length];

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				int sum = 0;
				for (int k = 0; k < A[0].length; k++) {
					sum += A[i][k] * B[k][j];
				}
				result[i][j] = sum;
			}
		}
		return result;
	}
}

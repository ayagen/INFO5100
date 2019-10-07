package com.neu.q5;

public class Permutation {

	public int[] getPermutation(String S) {

		int n = S.length();
		int left = 0;
		int right = n;
		int[] result = new int[n + 1];
		for (int i = 0; i < n; ++i) {
			result[i] = S.charAt(i) == 'I' ? left++ : right--;			
		}
		result[n] = left;
		return result;
	}
}

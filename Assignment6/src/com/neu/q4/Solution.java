package com.neu.q4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
	
	
	/**
	 * Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique
	 */
	
	public boolean uniqueOccurrences(int[] arr) {
		Map<Integer, Integer> count = new HashMap<>();
        for (int a : arr)
            count.put(a, 1 + count.getOrDefault(a, 0));
        return count.size() == new HashSet<>(count.values()).size();
	}
}

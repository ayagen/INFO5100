package com.neu.q3;

import java.io.BufferedReader;
import java.io.FileReader;

public class Solution {

	public void countLines(String fileName) {

		BufferedReader in; 
		int lineCount; 

		try {
			in = new BufferedReader(new FileReader(fileName));
		} catch (Exception e) {
			System.out.println("Error.  Can't open file.");
			return;
		}

		lineCount = 0;

		try {
			String line = in.readLine(); 
			while (line != null) {
				lineCount++;
				line = in.readLine();
			}
		} catch (Exception e) {
			System.out.println("Error.   Problem with reading from file.");
			return;
		}

		System.out.println(lineCount + " lines");

	}
}

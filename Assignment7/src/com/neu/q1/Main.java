package com.neu.q1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String currentPath  = Class.class.getClass().getResource("/").getPath();
		String filePath = (args.length == 0 ?  currentPath + "/../src/input.txt" : args[0]);
		
		
		
		String outFile = "outfile.txt";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
			String line = reader.readLine();
			System.out.println("Input File content: ");
			while(line != null) {
				line = reader.readLine();
				System.out.println(line);
				
				writer.write(reverse(line));
				writer.newLine();
			}
			reader.close();
			writer.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private static String reverse(String line) {
		if(line == null) {
			return "";
		}
		String[] array = line.split(" ");
		List<String> result = new ArrayList<String>();
		for(int i = array.length - 1; i >= 0; i--) {
			result.add(array[i]);
		}
		return String.join(" ", result);
	}
}

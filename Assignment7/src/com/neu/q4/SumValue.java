package com.neu.q4;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SumValue {
	
	private int[] testData = new int[4000000];
	
	public int[] getTestData() {
		return testData;
	}

	public void setTestData(int[] testData) {
		this.testData = testData;
	}

	class SumThread implements Callable<Long> {
		private int step;
		private int[] arr;
		
		public SumThread(int step, int[] arr) {
	        this.step = step;
	        this.arr = arr;
	    }
		
		public Long call() {
	        long result = 0;
	 
	        for (int i = step; i < arr.length; i += 4) {
	            result += arr[i];
	        }
	        return result;
	    }
	}
	
	
	/*generate array of random numbers*/
    static void generateRandomArray(int[] arr){
    	for(int i = 0; i < arr.length; i++) {
    		arr[i] = new Random().nextInt(10000); 
    	}
    }

    /*get sum of an array using 4 threads*/
    long sum(){
    	
    	SumThread thread1 = new SumThread(0, testData);
    	SumThread thread2 = new SumThread(1, testData);
    	SumThread thread3 = new SumThread(2, testData);
    	SumThread thread4 = new SumThread(3, testData);
    	ExecutorService pool = Executors.newFixedThreadPool(4);
    	Future<Long> sumResult1 = pool.submit(thread1);
    	Future<Long> sumResult2 = pool.submit(thread2);
    	Future<Long> sumResult3 = pool.submit(thread3);
    	Future<Long> sumResult4 = pool.submit(thread4);
    	try {
    		return sumResult1.get() + sumResult2.get() + sumResult3.get() + sumResult4.get();
    	} catch (InterruptedException | ExecutionException ex) {
    		ex.printStackTrace();
    	}
    	return 0;
    }

    public static void main(String[] args){
    	SumValue sumValue = new SumValue();
        generateRandomArray(sumValue.testData);
        long sum = sumValue.sum();
        System.out.println("Sum: " + sum);
    }
}

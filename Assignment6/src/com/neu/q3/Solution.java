package com.neu.q3;

public class Solution {

	
	/**
	 * Given two strings s and t , write a function to determine if t is an anagram of s
	 * 
	 * 	Example 1:

        Input: s = "anagram", t = "nagaram"
        Output: true
        
        Example 2:
        Input: s = "rat", t = "car"
        Output: false
        
        Note:
        You may assume the string contains only lowercase alphabets.
	 */
	
	public boolean isAnagram(String s, String t) {
	    if(s==null || t==null)
	        return false;
	 
	    if(s.length()!=t.length())
	        return false;
	 
	    int[] arr = new int[26];
	    for(int i=0; i<s.length(); i++){
	        arr[s.charAt(i)-'a']++;
	        arr[t.charAt(i)-'a']--;
	    }
	 
	    for(int i: arr){
	        if(i!=0)
	            return false;
	    }
	 
	    return true;
	}
}

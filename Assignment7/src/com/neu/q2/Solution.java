package com.neu.q2;

import java.util.Stack;

public class Solution {
	public String decodeString(String s) {
        String decoded = "";
        Stack<String> result = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();
        int index = 0;
        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) {
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = 10 * count + (s.charAt(index) - '0');
                    index++;
                }
                tempStack.push(count);
            }
            else if (s.charAt(index) == '[') {
                result.push(decoded);
                decoded = "";
                index++;
            }
            else if (s.charAt(index) == ']') {
                StringBuilder builder = new StringBuilder (result.pop());
                int times = tempStack.pop();
                for (int i = 0; i < times; i++) {
                    builder.append(decoded);
                }
                decoded = builder.toString();
                index++;
            }
            else {
                decoded += s.charAt(index++);
            }
        }
        return decoded;
    }
}

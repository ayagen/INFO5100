package assignment3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Course {
	private int courseId;
	private String courseName;
	private int maxCapacity;
	private int professorId;
	private int credits;
	private int[] studentIds;
	
	public Course() {
		studentIds = new int[maxCapacity];
	}
	
	public Course(int courseId) throws Exception {
		this();
		if(courseId <= 0) {
			throw new Exception("courseId should not be negative or 0");
		}
		this.courseId = courseId;
	}
	
	public Course(int courseId, int professorId) throws Exception {
		this();
		if(courseId <= 0) {
			throw new Exception("courseId should not be negative or 0");
		}
		this.courseId = courseId;
		this.professorId = professorId;
	}
	
	public Course(int courseId, int professorId, int credits) throws Exception {
		this();
		if(courseId <= 0) {
			throw new Exception("courseId should not be negative or 0");
		}
		this.courseId = courseId;
		this.professorId = professorId;
		this.credits = credits;
	}
	
	public void registerStudent(int studentId) {
		//assuming studentId is greater than 0
		if(studentIds[maxCapacity - 1] > 0) {
			//there is no space for new student
			System.out.println("there is no space for new student");
			return ;
		}
		
		for(int i = 0; i < maxCapacity; i++) {
			if(studentIds[i] == 0) {
				studentIds[i] = studentId;				
			}
		}
	}
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) throws Exception {
		if(courseId <= 0) {
			throw new Exception("courseId should not be negative or 0");
		}
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) throws Exception {
		if(courseName == null || courseName.length() < 10 || courseName.length() > 60) {
			throw new Exception("courseName should be a string with minimum length 10 and maximum 60");
		}
		this.courseName = courseName;
	}
	public int getMaxCapacity() {
		return maxCapacity;
	}
	public void setMaxCapacity(int maxCapacity) throws Exception {
		if(maxCapacity < 10 || maxCapacity > 100) {
			throw new Exception("maxCapacity should not be less than 10 greater than 100");
		}
		this.maxCapacity = maxCapacity;
	}
	public int getProfessorId() {
		return professorId;
	}
	public void setProfessorId(int professorId) throws Exception {
		if(professorId < 100000 || professorId > 999999) {
			throw new Exception("professorId should be a six digit integer");
		}
		
		this.professorId = professorId;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) throws Exception {
		if(credits <= 0 || credits > 9) {
			throw new Exception("credits should be a single digit but greater than 0");
		}
		this.credits = credits;
	}
	public int[] getStudentIds() {
		return studentIds;
	}
	public void setStudentIds(int[] studentIds) {
		this.studentIds = studentIds;
	}
	
	/**
	 * Q3. Add a function called removeDuplicates in Course class...
	 * @param studentIds
	 * @return
	 */
	public int[] removeDuplicates(int[] studentIds) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < studentIds.length; i++) {
			map.put(studentIds[i], 1);
		}
		int[] idWithoutDuplicate = new int[map.keySet().size()];
		int index = 0;
		for(Integer item : map.keySet()) {
			idWithoutDuplicate[index++] = item;
		}
		return idWithoutDuplicate;
	}
	
	/**
	 * Q4. Implement the following method in Course class.
	 * @param studentIds
	 * @return
	 */
	public int groupsOfStudents(int[] studentIds) {
		int[] withoutDupIds = removeDuplicates(studentIds);
		int countOfEven = 0;
		int countOfOdd = 0;
		for(int i = 0; i < withoutDupIds.length; i++) {
			if(withoutDupIds[i] % 2 == 0) {
				countOfEven++;
			} else {
				countOfOdd++;
			}
		}
		return countOfEven*(countOfEven - 1)/2 + countOfOdd*(countOfOdd-1)/2;
	}
	
	/**
	 * Q5: Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
	 * @param n
	 * @return
	 * @throws Exception 
	 */
	public String countAndSay(int n) throws Exception {
		if(n < 1 || n > 30) {
			throw new Exception("n should be 1 ≤ n ≤ 30");
		}
		if(n == 1) {
			return "1";
		}
		if(n == 2) {
			return "11";
		}
		return countAndSayRecursive("11", n - 2);
	}
	
	private String countAndSayRecursive(String current, int loopTimes) {
		if(loopTimes <= 0) {
			return current;
		}
		char[] chars = current.toCharArray();
		StringBuilder result = new StringBuilder();
		int countOfRepeatedNumber = 1;
		for(int i = 1; i < chars.length; i++) {
			if(chars[i] == chars[i-1]) {
				countOfRepeatedNumber++;
			} else {
				result.append(countOfRepeatedNumber).append(chars[i-1]);
				countOfRepeatedNumber = 1;
			}
		}
		//append the last char(s)
		result.append(countOfRepeatedNumber).append(chars[chars.length - 1]);
		return countAndSayRecursive(result.toString(), --loopTimes);
	}
	
	/**
	 * Q6: Given an input string , reverse the string word by word.
	 * @param sequence
	 * @return
	 */
	public String reverse(String sequence) {
		String[] splitedArray = sequence.split(" ");
		StringBuilder reversed = new StringBuilder();
		for(int i = splitedArray.length - 1; i >= 0; i--) {
			reversed.append(splitedArray[i]).append(" ");
		}
		//remove the last space
		return reversed.substring(0, sequence.length() - 1);
	}
	
	/**
	 * Q7. Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
	 * @param matrix
	 * @return
	 */
	public int[] spiralOrder(int[][] matrix) {
		int width = matrix[0].length - 1;
		int height = matrix.length - 1;
		
		int[] result = new int[matrix[0].length * matrix.length];
		int resultIndex = 0;
		
		for(int i = 0; i <= width/2; i++) {
			if(width-i > 0 && resultIndex < result.length) {
				int from = i;
				int to = width-i;
				if(from <= to) {
					while(from <= to) {
						result[resultIndex++] = matrix[i][from++];
					} 			
				} else {
					while(from >= to) {
						result[resultIndex++] = matrix[i][from--];
					}			
				}
			}
			
			
			if(width-i > 0 && height-i > 0 && resultIndex < result.length) {
				int from = i+1;
				int to = height - i;
				if(from <= to) {
					while(from <= to) {
						result[resultIndex++] = matrix[from++][width-i];
					} 			
				} else {
					while(from >= to) {
						result[resultIndex++] = matrix[from--][width-i];
					}			
				}
			}
			
			if(height-i > 0 && width >= i+1 && resultIndex < result.length) {
				int from = width-(i+1);
				int to = i;
				if(from <= to) {
					while(from <= to) {
						result[resultIndex++] = matrix[height-i][from++];
					} 			
				} else {
					while(from >= to) {
						result[resultIndex++] = matrix[height-i][from--];
					}			
				}
			}
			
			if(height >= i+1 && resultIndex < result.length) {
				int from = height-(i+1);
				int to = i+1;
				if(from <= to) {
					while(from <= to) {
						result[resultIndex++] = matrix[from++][i];
					} 			
				} else {
					while(from >= to) {
						result[resultIndex++] = matrix[from--][i];
					}			
				}
			}
		}
		return result;
	}
	
	/**
	 * Q8. The string "PAYPALISHIRING" is written in a zigzag pattern...
	 * @param s
	 * @param numRows
	 * @return
	 */
	public String convert(String s, int numRows) {
		List<StringBuilder> rows = new ArrayList<StringBuilder>();
		for(int i = 0; i < numRows; i++) {
			rows.add(i, new StringBuilder());
		}
		
		int curRow = 0;
		boolean directionToBottom = false;
		for(int i = 0; i < s.length(); i++) {
			String item = s.substring(i, i+1);
			rows.get(curRow).append(item);
			
			if(curRow == 0 || curRow == numRows - 1) {
				directionToBottom = !directionToBottom;
			}
			curRow += directionToBottom ? 1 : -1;
		}
		
		StringBuilder result = new StringBuilder();
		for(StringBuilder sb : rows) {
			result.append(sb.toString());
		}
		return result.toString();
	}
	
	
}


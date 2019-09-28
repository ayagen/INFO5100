package Assignment2;

import java.util.regex.Pattern;

public class Assignment2 {
	/*
	 * This method should return the sum of salaries of employees having salary
	 * greater than 5000 Note: Employee array is passed, not employee
	 */
	public double salaryGreaterThanFiveThousand(Employee[] employees) {
		double salarySum = 0;
		for(Employee employee : employees) {
			if(employee.getSalary() > 5000) {
				salarySum += employee.getSalary();
			}
		}
		return salarySum;
	}

	/*
	 * This method should print either "Fizz", "Buzz" or "FizzBuzz" 
	 * "Fizz" - if id of employee is divisible by 3 
	 * "Buzz" - if id of employee is divisible by 5
	 * "FizzBuzz" - if id of employee is divisible by both 3 and 5
	 */
	public void fizzBuzz(Employee employee) {
		if(employee.getId() % 3 == 0) {
			System.out.println("Fizz");
		}
		if(employee.getId() % 5 == 0) {
			System.out.println("Buzz");
		}
		if(employee.getId() % 3 == 0 && employee.getId() % 5 == 0) {
			System.out.println("FizzBuzz");
		}
	}

	/*
	 * This method should calculate tax for an employee in dollars 
	 * If salary of employee is less than or equal to 2500, tax should be 10% 
	 * If salary of employee is greater than 2500 but less than or equal to 5000, tax should be 25% 
	 * If salary of employee is greater than 5000, tax should be 35%
	 */
	public double calculateTax(Employee employee) {
		double salary = employee.getSalary();
		if(salary > 5000) {
			return salary * 0.35;
		} else if(salary > 2500) {
			return salary * 0.25;
		} else {
			return salary * 0.1;
		}
	}

	/*
	 * We are given two employee objects. Implement this method to swap salaries of
	 * employees
	 */
	public void swap(Employee firstEmployee, Employee secondEmployee) {
		double tempSalary = firstEmployee.getSalary();
		firstEmployee.setSalary(secondEmployee.getSalary());
		secondEmployee.setSalary(tempSalary);
	}

	/*
	 * Return number of employees whose age is greater than 50 
	 * Note: Employee array is passed, not employee
	 */
	public int employeesAgeGreaterThan50(Employee[] employees) {
		int number = 0;
		for(Employee employee : employees) {
			if(employee.getAge() > 50) {
				number++;
			}
		}
		return number;
	}

	/*
	 * Implement this method to reverse firstName of employee. Ex. Before:
	 * employee.getFirstName() -> "John" After : employee.getFirstName() -> "nhoJ"
	 */
	public void reverseFirstName(Employee employee) {
		String originalName = employee.getFirstName();
		String newName = "";
		for(int i = originalName.length() - 1; i >= 0; i--) {
			newName += originalName.substring(i, i+1);
		}
		employee.setFirstName(newName);
	}

	/*
	 * Print "true" if employee's first name contain one or more digits 
	 * Print "false" if employee's first name doesn't contain any digit 
	 * Ex:
	 * employee.getFirstName() -> "ha8l" == true 
	 * employee.getFirstName() -> "hail" == false
	 */
	public void isContainDigit(Employee employee) {
		String firstName = employee.getFirstName();
		System.out.println(Pattern.matches("\\d", firstName));
	}

	/*
	 * Write a method to raise an employee's salary to three times of his/her
	 * original salary. Eg: original salary was 1000/month. After using this method,
	 * the salary is 3000/month. 
	 * DO NOT change the input in this method. Try to add
	 * a new method in Employee class: public void raiseSalary(double byPercent)
	 * Call this new method.
	 */
	public void tripleSalary(Employee employee) {
		employee.raiseSalary(2);
	}

	// Additional question for extra credit
	/*
	 * Implement this method to convert String[] to employees array. 
	 * Ex: 
	 * String[] employees = new String[]{"1,John,24,7500", "2,Hail,28,7899.90"}; 
	 * This String array of length 2 contains 2 employees in form of string, where id = 1
	 * firstName=John age=24 salary=7500 convert each string to employee object.
	 * Hint: Use String methods. Refer :
	 * https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
	 */
	public Employee[] createEmployees(String[] employeesStr) {
		Employee[] employees = new Employee[employeesStr.length];
		for(int i = 0; i < employeesStr.length; i++) {
			String itemStr = employeesStr[i];
			String[] item = itemStr.split(",");
			int id = Integer.parseInt(item[0]);
			String firstName = item[1];
			int age = Integer.parseInt(item[2]);
			double salary = Double.parseDouble(item[3]);
			Employee employeeItem = new Employee(id, firstName, age, salary);
			employees[i] = employeeItem;
		}
		return employees;
	}
}


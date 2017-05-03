package test1;
//import java.io.*;

public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	public Employee(String newName, int newAge, String newDesignation, double newSalary) {
		// TODO Auto-generated constructor stub
		this.name = newName;
		this.age = newAge;
		this.designation = newDesignation;
		this.salary = newSalary;
	}
	
	public void printEmployee() {
		System.out.println("employee's name is :" + this.name);
		System.out.println("employee's age is :" + this.age);
		System.out.println("employee's designation is :" + this.designation);
		System.out.println("employee's salary is :" + this.salary);
	}
}

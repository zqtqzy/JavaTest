package test1;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee1 = new Employee("Bob", 30, "manager", 15000);
		Employee employee2 = new Employee("Steve", 25, "engineer", 10000);
		
		employee1.printEmployee();
		employee2.printEmployee();
	}
}

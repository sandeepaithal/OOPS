package encapsulation;

/**
 * Represents an employee with encapsulated properties: name, age, and salary.
 * Provides getter and setter methods for accessing and modifying these
 * properties.
 * 
 * @author C Sandeep Aithal
 */
public class Employee {
	private String name;
	private int age;
	private double salary;

	/**
	 * Constructs an Employee object with the specified name, age, and salary.
	 */
	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	/**
	 * Gets the name of the employee.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the employee.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the age of the employee.
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Sets the age of the employee.
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Gets the salary of the employee.
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * Sets the salary of the employee.
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
}

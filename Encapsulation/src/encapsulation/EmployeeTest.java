package encapsulation;

/**
 * A test class to demonstrate the use of the Employee class with encapsulation.
 * 
 * @author C Sandeep Aithal
 */
public class EmployeeTest {
    public static void main(String[] args) {
        // Create an Employee object with specified name, age, and salary
        Employee e1 = new Employee("ABC", 30, 50000.0);
        
        // Display the employee details using getter methods
        System.out.println("Employee name: " + e1.getName());
        System.out.println("Employee age: " + e1.getAge());
        System.out.println("Employee Salary: " + e1.getSalary());
    }
}

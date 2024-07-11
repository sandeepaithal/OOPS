package encapsulation;

public class EmployeeTest {
public static void main(String[] args) {
	Employee e1= new Employee("ABC",30,50000.0);
	 System.out.println("Employee name: " + e1.getName());
     System.out.println("Employee age: " + e1.getAge());
     System.out.println("Employee Salary: " + e1.getSalary());
}
}

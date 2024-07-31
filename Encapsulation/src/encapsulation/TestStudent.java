package encapsulation;

/**
 * A test class to demonstrate the use of the Student class with encapsulation.
 * 
 * @author C Sandeep Aithal
 */
public class TestStudent {
    public static void main(String[] args) {
        // Create a Student object with specified name and age
        Student student = new Student("ABC", 15);
        
        // Display the student details using getter methods
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}

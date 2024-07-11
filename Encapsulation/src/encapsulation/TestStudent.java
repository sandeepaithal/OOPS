package encapsulation;

public class TestStudent {
public static void main(String[] args) {
	Student student=new Student("ABC", 15);
	System.out.println("Student Name: " + student.getName());
    System.out.println("Student Grade: " + student.getAge());
	
}
}

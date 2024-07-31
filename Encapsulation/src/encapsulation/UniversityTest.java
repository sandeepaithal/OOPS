package encapsulation;

/**
 * A test class to demonstrate the use of the UniversityCourse class with encapsulation.
 * 
 * @author C Sandeep Aithal
 */
public class UniversityTest {
    public static void main(String[] args) {
        // Create a UniversityCourse object with specified course code, course name, and credits
        UniversityCourse u1 = new UniversityCourse("CS001", "Java Programming", 5);
        
        // Display the course details using getter methods
        System.out.println("Course Code: " + u1.getCoursecode());
        System.out.println("Course Name: " + u1.getCoursename());
        System.out.println("Credits: " + u1.getCredits());
    }
}

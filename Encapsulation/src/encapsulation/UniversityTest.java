package encapsulation;

public class UniversityTest {
	public static void main(String[] args) {
		Universitycourse u1 = new Universitycourse("CS001", "Java Programming", 5);
		System.out.println("Course Code: " + u1.getCoursecode());
		System.out.println("Course Name: " + u1.getCoursename());
		System.out.println("Credits: " + u1.getCredits());
	}
}
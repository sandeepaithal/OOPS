package encapsulation;

public class UniversityCourse {
	private String coursecode;
	private String coursename;
	private int credits;

	public UniversityCourse(String coursecode, String coursename, int credits) {
		this.coursecode = coursecode;
		this.coursename = coursename;
		this.credits = credits;
	}

	public String getCoursecode() {
		return coursecode;
	}

	public void setCoursecode(String coursecode) {
		this.coursecode = coursecode;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

}

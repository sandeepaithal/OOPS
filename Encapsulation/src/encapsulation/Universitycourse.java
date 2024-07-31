package encapsulation;

/**
 * Represents a university course with encapsulated properties: course code, course name, and credits.
 * Provides getter and setter methods for accessing and modifying these properties.
 * 
 * @author C Sandeep Aithal
 */
public class UniversityCourse {
    private String coursecode;
    private String coursename;
    private int credits;

    /**
     * Constructs a UniversityCourse object with the specified course code, course name, and credits.
     */
    public UniversityCourse(String coursecode, String coursename, int credits) {
        this.coursecode = coursecode;
        this.coursename = coursename;
        this.credits = credits;
    }

    /**
     * Gets the course code of the course.
     */
    public String getCoursecode() {
        return coursecode;
    }

    /**
     * Sets the course code of the course.
     */
    public void setCoursecode(String coursecode) {
        this.coursecode = coursecode;
    }

    /**
     * Gets the course name of the course.
     */
    public String getCoursename() {
        return coursename;
    }

    /**
     * Sets the course name of the course.
     */
    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    /**
     * Gets the number of credits for the course.
     */
    public int getCredits() {
        return credits;
    }

    /**
     * Sets the number of credits for the course.
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }
}

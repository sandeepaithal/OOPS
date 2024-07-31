package encapsulation;

/**
 * Represents a student with encapsulated properties: name and age.
 * Provides getter and setter methods for accessing and modifying these properties.
 * 
 * @author C Sandeep Aithal
 */
public class Student {
    private String name;
    private int age;

    /**
     * Constructs a Student object with the specified name and age.
     */
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Gets the name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the student.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the age of the student.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the student.
     */
    public void setAge(int age) {
        this.age = age;
    }
}

package singleinheritance;

/**
 * Represents a person with a name and age.
 * Provides a method to display this information.
 * 
 * @author C Sandeep Aithal
 */
class Person {
    String name;
    int age;

    /**
     * Displays the name and age of the person.
     * 
     * @param name The name of the person.
     * @param age The age of the person.
     */
    public void displayinfo(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + name + "  Age: " + age);
    }
}

/**
 * Represents a student, which is a subclass of Person.
 * Demonstrates single inheritance.
 * 
 * @author C Sandeep Aithal
 */
class Student extends Person {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "ABC";
        s1.age = 22;
        s1.displayinfo(s1.name, s1.age);
    }
}

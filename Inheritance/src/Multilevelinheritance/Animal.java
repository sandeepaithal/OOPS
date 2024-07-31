package multilevelinheritance;

/**
 * Represents an animal with a name.
 * Provides a method to display the name.
 * 
 * @author C Sandeep Aithal
 */
class Animal {
    String name;

    /**
     * Displays the name of the animal.
     */
    public void displayname() {
        System.out.println("Name: " + this.name);
    }
}

/**
 * Represents a mammal, which is a subclass of Animal.
 * Adds a method to simulate running behavior.
 * 
 * @author C Sandeep Aithal
 */
class Mammal extends Animal {
    /**
     * Simulates the mammal running.
     */
    public void run() {
        System.out.println(name + " is running");
    }
}

/**
 * Represents a dog, which is a subclass of Mammal.
 * Adds a method to simulate barking behavior.
 * 
 * @author C Sandeep Aithal
 */
class Dog extends Mammal {
    /**
     * Simulates the dog barking.
     */
    public void bark() {
        System.out.println(name + " is barking");
    }

    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "xyz";
        d1.displayname();
        d1.run();
        d1.bark();
    }
}

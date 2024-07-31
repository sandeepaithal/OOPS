package encapsulation;

/**
 * Represents a car with encapsulated properties: company, model, and year.
 * Provides getter and setter methods for accessing and modifying these properties.
 * 
 * @author C Sandeep Aithal
 */
public class Car {
    private String company;
    private String model;
    private int year;

    /**
     * Constructs a Car object with the specified company, model, and year.
     */
    public Car(String company, String model, int year) {
        this.company = company;
        this.model = model;
        this.year = year;
    }

    /**
     * Gets the company that manufactures the car.
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the company that manufactures the car.
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Gets the model of the car.
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the model of the car.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Gets the year the car was manufactured.
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the year the car was manufactured.
     */
    public void setYear(int year) {
        this.year = year;
    }
}

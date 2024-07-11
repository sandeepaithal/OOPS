package encapsulation;

public class Car {
    private String company;
    private String model;
    private int year;

   
    public Car(String company, String model, int year) {
        this.company = company;
        this.model = model;
        this.year = year;
    }


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
}
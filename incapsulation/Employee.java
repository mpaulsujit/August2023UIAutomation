package incapsulation;

public class Employee {
	//This class is called POJO(Plain Old Java Object

	private String name;
	private int id;
	private String city;
	private boolean isPerm;
	//Create constructor
	
	public Employee(String name, int id, String city, boolean isPerm) {
		
		this.name = name;
		this.id = id;
		this.city = city;
		this.isPerm = isPerm;
	}
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isPerm() {
		return isPerm;
	}
	public void setPerm(boolean isPerm) {
		this.isPerm = isPerm;
	}
	

}

package constructorconcept;

public class User {

	
	String name;
	String Email ;
	int  Userid;
	String DOB;
	String city;
	public User(String name, String email, int userid, String dOB, String city) {
		
		this.name = name;
		Email = email;
		Userid = userid;
		DOB = dOB;
		this.city = city;
	}
	public User(String name) {
		
		this.name = name;
	}
	public User(String name, String email) {
		
		this.name = name;
		Email = email;
	}
	public User(String name, int userid) {
		
		this.name = name;
		Userid = userid;
	}
	public User(String name, String email, String dOB) {
		
		this.name = name;
		Email = email;
		DOB = dOB;
	}
//	public User(String name, String dOB) {
//		
//		this.name = name;
//		DOB = dOB;
//	}
	
	
	
	
	//1. Name
	//2. Name, Email
	//3. Name, userid,
	//4. name, email, dob
	//5. name, email, userid, dob, city
	//6. name, city: duplicate contructor is not allowed
	
	//Bussiness logic is always in method. ex. get order details
	
	public String[] getUserDetails( String name) {
		
		String orderDetails[] = {"Laptop", "Mouse", "USB Cable"};
		
		return orderDetails;
		
	
	
	
	}
	
	
	
	
	
}
	
	
	
	
		

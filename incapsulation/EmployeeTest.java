package incapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Variable should be same order as contructor
	Employee e = new Employee("Meghna", 10, "Monmouth", false);
	//Since all the variable are private cane not access by object 
	//As soon as i make it public i can access by object variable
	//importantant of setter.
	//update data we use setter. 
	//e.setName("Meghna Paul");
//	e.setId(1);
	e.setCity("Dhaka");
//	e.setPerm(false);
	
	
	System.out.println(e.getCity());	
	System.out.println(e.getId());
	System.out.println(e.getName());
	System.out.println(e.isPerm());
	
	}

}

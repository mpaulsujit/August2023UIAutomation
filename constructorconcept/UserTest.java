package constructorconcept;
import testing.Customer;// import package if it is in different package
public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User u1 = new User("Avinash");
		User u2 = new User("Ekanth", 101);
		//User u3 =new User();// Constructor is restricting to create unnecessary object
		
		Customer c1 = new Customer("Lipi", 30, true);
		
		System.out.println(c1.name);
		
		System.out.println(c1.age+ " "+c1.isActive);
	}

}

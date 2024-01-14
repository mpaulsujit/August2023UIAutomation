package BuilderPatern;

public class Ecomerce {

	
	public Ecomerce login() {
		
		System.out.println("user is logged in");
		return this;
	} 
	
public Ecomerce logIn(String un, String pwd) {
		
		System.out.println("user is logged in with :" + un + " "+ pwd);
		return this;
	}
	
public Ecomerce search(String productName) {
	
	System.out.println("searching product:" + productName);
	return this;
}
public Ecomerce search(String productName, String color) {
	
	System.out.println("searching product:" + productName+ " " + color);
	return this;
}

public Ecomerce selectProduct(String productName) {
	
	System.out.println("searching product:" + productName);
	return this;
	
}
public Ecomerce addToCart(String productName) {
	
	System.out.println("Adding product:" + productName);
	return this;	
}

public Ecomerce doPayment(String cc, int cvv) {
	
	System.out.println("making payment using card: :" + cc + ":"+ cvv);
	return this;
}

public Ecomerce generateOrderId() {
	
	System.out.println("Order id is : "+ 12345);
	return this;
}

public Ecomerce logout() {
	
	System.out.println("logout");
	return this;
}
}
	
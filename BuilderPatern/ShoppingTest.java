package BuilderPatern;

public class ShoppingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ecomerce u1= new Ecomerce();
		u1.logIn("meghna", "meghna123")
		
		.search("laptop")
		.selectProduct("MACbook")
		.addToCart("MACbook")
		.doPayment("123 456 7890", 123)
		.generateOrderId()
		.logout();
		
		// 2nd day search
		u1.logIn("meghna", "meghna123")
		.search("shoes", "Red")
		.selectProduct("nike Airmax")
		.logout();
		
		// 3rd day search
		
		u1.logIn("meghna", "meghna123")
		.search("Mobile", "black")
		.selectProduct("iphone15")
		.addToCart("iphone15")
		.logout();
		
		
		//4th day
		u1.logIn("meghna", "meghna123")
		.logout();
		//5th day
		u1.logIn("meghna", "meghna123");
		//6th day
		
		u1.logIn("meghna", "meghna123")
		
		.search("laptop")
		.selectProduct("MACbook")
		.addToCart("MACbook")
		.doPayment("123 456 7890", 123)
		.generateOrderId()
		.logout();
	}

}

// Note : this is kind of workflow. what is the advantage?
// again we can search and logout and log in


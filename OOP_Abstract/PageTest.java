package OOP_Abstract;


public class PageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

LoginPage lp = new LoginPage();
		
		lp.title();//overriden
		lp.doLogin("admin", "admin123");//
		lp.logo();
		lp.url();
		lp.pageload();
		
		//Page p = new Page(); can not institiate 
		
		//Can we do Top casting?
		
		
		Page P = new LoginPage();// Yes, Top casting is possible. 
		
		//Note:TopCasting:  whateverever common 
		
		// Down cast is not allowed becasue we can not create object for abstract class
		// can we create the constructor of a abstruct class?
		//yes, we can create constructor of log in page. But it will be called when we create the object of child class
	}

}

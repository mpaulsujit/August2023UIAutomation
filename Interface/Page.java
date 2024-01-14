package Interface;

public abstract class Page {

	
	// abstract class can not have object
	// abstract class can have abs method and non abstract method
	// interfaces method are abstract by nature but abstract class method need to mention 
	
	public abstract void title();
	public abstract void url();
	public void pageload() {
		
		System.out.println("Page load time out = 10 sec");
		}
	// use final so no one can override logo method
	
	public final void logo() {
		
		System.out.println("App logo");
	}
		


//	public void doLogin() {
//		
//		System.out.println("Logged in user with: " + un+ " " + pwd +);
//	
//	}
}

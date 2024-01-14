package SuperKeyward;

public class BMW extends Car{
	
	int speed = 100;
	public BMW() {
		super(20,30);
	//	super(10);// you can not call 2 constructor together. 2 super keyword is not allowed. 
		// Super keyword is always first statement in the child class constructor
		System.out.println("BMW construc..... ");
		
	}
	
	@Override
	public void displayInfo() {
		System.out.println("BMW ---- info");
		super.displayInfo();//Car
	}
public void displayBMWInfo() {
	System.out.println(" BMW - System info");
	System.out.println(speed);
	
	//If you use super for variable speed it will call parent class speed
	
	System.out.println(super.speed);
	
	
	//displayInfo();// BMW
	
	//Super: pointing to the parent class object
	//1. in the child class const... but it should be the 1st statement in the child class constructor..
	//2. when you have same properties ( method overriding/same var) in parent and child 
	//but you want to call/access parent class properties --- use super keyword
	
	
	
	
	
}
}

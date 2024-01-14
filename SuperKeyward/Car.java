package SuperKeyward;

public class Car {
	
	
	int speed =10;
	
	//create constructor
	public Car() {
		
		System.out.println("car constructor");
		//Create another method overloading
	}
		public Car(int a) {
			// this key word is use for current class constructor.
			//constructor call must be the first statement in a constructor
			this(10, 20);
			System.out.println("car constructor"+ a);	

}
public Car(int a, int b) {
			
			
			System.out.println("car constructor"+ (a+b));	

}	
	public void displayInfo() {
		
		System.out.println("Car ---- info");
		
	}
		
	
	
	
	
}


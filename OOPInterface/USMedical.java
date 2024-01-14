package OOPInterface;

public interface USMedical extends WHO {
	
	int min_fee =10; // by default variable are static and final.
//No method body. Only method declaration; abstract method. By default all method are abstract in m=nature
	
	//Can not create the object of interface. 
	// All abstract method are non-static
	// Interface is not 100% abstruction since you can create method body
	//can have also default method body
	
	
	public void physioService();
	
	public void pediaService();
	public void gynoService();
	
	public void emerServices();
	
	// after JDK 1.8: two major changes:
	//1. can have static method but with method body.
	
	
	public static void billing() {
		//Business logic:
		
		System.out.println("USM -- billing");
		
	}
	
	// can have default method with method body
	
	default void RnD() {
	
		System.out.println("USM -- Rnd");
	}
	
}

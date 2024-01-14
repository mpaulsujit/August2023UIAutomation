package inheritage;

public class BMW extends Car {
//Method Overriding:Poly Morphism: Dynamic Runtime / Late binding 
//when we have parent and child class:
//1. with same method name
//2. with the same number of parameters/with the same sequence
//3. with same return type
//
//	
@Override
public void start(){
	
	System.out.println("BMW can start");
}
 

	public void stop() {
		
		System.out.println("BMW can stop");
	}
	
	
public void autoParking() {
		
		System.out.println("BMW can AutoParking");
	}

@Override
public void engine(){
	
	System.out.println("BMW can engine ");
}
	

	
}

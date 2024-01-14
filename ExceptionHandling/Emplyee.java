package ExceptionHandling;

public class Emplyee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		try {
		int i= 9/3;//AE
		
		}
		
		catch(ArithmeticException  e) {
			
			System.out.println("AE is coming");
			e.printStackTrace();
		}
		
		
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		
		
		
	}

}


public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Print A");
		
		System.out.println("Print A");
		System.out.println("Print A");
		try  {
			int j =9/0;		
		}
		catch(ArithmeticException e) {
			
			System.out.println(" print error AE");
			e.printStackTrace();
		}
		
		
System.out.println("Print b");
		
		System.out.println("Print b");
		System.out.println("Print b");
	}

}

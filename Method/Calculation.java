package Method;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calculation add =new Calculation();
		
	int jog=add.sum();
	System.out.println("Sum of A & B is:" +jog);
	
	int sub=add.sub();
	System.out.println(" Substruction A & B is:" +sub);
	int mult=add.mult();
	System.out.println(" multiplication A & B is:" +mult);
	
	int div=add.div();
	System.out.println(" Division A & B is:" +div);
	}

	public int sum() {
	int b = 20;
	int a = 10; 
	int c = a+b;
	return c;
	
}
	public int sub() {
		int b = 20;
		int a = 10; 
		int c = b-a;
		return c;	
	}
	public int mult() {
		int b = 20;
		int a = 10; 
		int c = b*a;
		return c;	
	}
	
		public int div() {
	
		int b = 20;
		int a = 10; 
		int c = b/a;
		return c;
		
		}	
}
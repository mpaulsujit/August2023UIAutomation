package DataTypeAssignment;

public class AddStringAndChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Try to concat "Hello Selenium" with a character 't'.
		
		String s= "Hello Selenium  " ;
		char t= 't';
		
		System.out.println(s + t);
		
//		6. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
//
//		"Your Total  amount is. 3700".
		
		
		int a= 100;
		int b= 200;
		int c= 3400;
		
		System.out.println("Sum of a,b and c =" + (a+b+c));
		
		
		//Print ASCHII word of h
		int z= 'h';
		
		
		System.out.println(z);
		
		
		//Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.
	
	
	int y = 'd';
	
	System.out.println("Adding 3 with ASCHI letter d ="+ (3+y));
	System.out.println("The vale of d in ASCHII="+y);
	
	
	//Write a program to find the square of the number 3.9.
	
	double w=3.9;
	System.out.println(w*w);
	
	}

}

package incrementaldecrementalTypeAssignment;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 
 * 2) Guess the output of the following program?

public class IncrementDecrementQuiz 
{
	public static void main(String[] args) 
	{
		int a=11, b=22, c;
		
		c = a + b + a++ + b++ + ++a + ++b;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}
}


 */

		int a=11, b=22, c;
		
		c = a + b + a++ + b++ + ++a + ++b;
		//c = 11+22+11+22+13+24

		System.out.println("a="+a);//13
		System.out.println("b="+b);//24
		System.out.println("c="+c);//103
		
		
	}

}

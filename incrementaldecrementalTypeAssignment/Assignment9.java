package incrementaldecrementalTypeAssignment;

public class Assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		9) Guess the value of p in the below program?

				public class IncrementDecrementQuiz

				{

				    public static void main(String[] args)

				    {

				        int m = 0, n = 0;

				         

				        int p = --m * --n * n-- * m--;

				         

				        System.out.println(p);

				    }

				}
*/
int m = 0;
int n = 0;
int p= --m * --n * n-- * m--;	
//  p= -1*-1*-1*-1=1
System.out.println(p);
	}

}

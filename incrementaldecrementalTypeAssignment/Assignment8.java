package incrementaldecrementalTypeAssignment;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		8) What is wrong with the below program? Why it is showing compilation error?

				public class IncrementDecrementQuiz

				{

				    public static void main(String[] args)

				    {

				        int i = 11;

				         

				        int j = --(i++);//10

				    }

				}
*/
		
int i = 11;
int j = --(i++);// can not do - - and ++ at the same time


		
	}

}

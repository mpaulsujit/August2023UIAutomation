package loopconcept;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//print all even number
		int i = 5;
		while(i<=100){
			
			System.out.println(i);
			i= i+1;
			// when is break then program will stop just print 1
			//when enter break before print will get compile time error
			//print hi when modular is 0
			if(i%5==0) {
				System.out.println("hi");
				break;
			}
			
		}
	}

}

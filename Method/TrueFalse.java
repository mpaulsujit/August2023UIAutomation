package Method;

public class TrueFalse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrueFalse obj = new TrueFalse();
		
	boolean flag =	obj.oddEven();
		

	}

	
	public boolean oddEven() {
	boolean flag = true;
	int a = 6;
	if(a%2==0) {
		
		System.out.println("a is evennumber" +a);
	}
	else {
		System.out.println("a is Oddnumber" +a);
	}
	return flag;
	}
	
}

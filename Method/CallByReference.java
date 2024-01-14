package Method;

public class CallByReference {

	
	
public void readMail() {
		System.out.println("Read mail");
	
	}
	
public static void sendMail(CallByReference) {
	System.out.println("send mail");
	//jodu.sendMail();
	
}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByReference obj= new CallByReference();
		obj.readMail();
		CallByReference.sendMail();
		
		
	}

}

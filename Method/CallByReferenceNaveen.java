package Method;

public class CallByReferenceNaveen {
	
	
	public static void sendMail(CallByReferenceNaveen a) {
		System.out.println("send mail");
		
		a.readMail();
	}

	public void readMail() {
		System.out.println("read mail");
		
	}

	public static void main(String[] args) {

		CallByReferenceNaveen obj = new CallByReferenceNaveen();
		
obj.readMail();
CallByReferenceNaveen.sendMail(obj);

	}




	}

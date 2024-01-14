package collectionConcept;
import java.util.HashMap;
public class UserRole {
	
	
	public static String getUserCredential(String role) {
		
		
		HashMap<String,String> userMap = new HashMap<String,String>();
		userMap.put("admin", "admin;admin@123");
		userMap.put("seller", "seller;seller@123");
		userMap.put("vendor", "vendor;vendor@123");
		userMap.put("manager", "manager;manager@123");
		
		return userMap.get(role);
		
	}
	
	public static void doLogin(String un, String pwd) {
	
		System.out.println("login with:"+ un + ":"+pwd);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String credsdata= getUserCredential("admin");
		System.out.println(credsdata);
		String userName= credsdata.split(";")[0];
		String passWord= credsdata.split(";")[1];
		
		doLogin(userName, passWord);

	}

}

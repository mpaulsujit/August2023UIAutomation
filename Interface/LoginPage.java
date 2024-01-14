package Interface;

public class LoginPage extends Page{

	@Override
	public void title() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void url() {
		// TODO Auto-generated method stub
		
	}

	@Override
public void pageload() {
		
		System.out.println("Page load time out = 2 sec");
		}
	
	public void doLogin(String un, String pwd) {
	
System.out.println("Logged in user with: " + un + " " + pwd);

}
	
	
}

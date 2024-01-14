package SwitchCase;

public class BrowserSwitch {

public boolean launhBrowser(String browserName) {
	//boolean flag = 	true;
	
	System.out.println("Browser name is :"+ browserName);
	System.out.println("enter url");
	
		switch(browserName) {
		case "chrome":
			
			System.out.println("Lunch Chrome");
			break;
			
		case "firefox":
			
			System.out.println("Lunch FireFox");
			break;
			case "edge":
				System.out.println("Lunch Edge");
				break;
				
			case "safari":
				System.out.println("Lunch safari");
				break;
				default:
					System.out.println("Please pass the right browser"+ browserName);
				
		
		
	}
}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BrowserSwitch br = new BrowserSwitch();
		
		boolean flag = br.launhBrowser("chrome");
		
		if flag() {
			
			System.out.println("enter url");
		}
		else {
			
			System.out.println("NO browser is there");
		}
		
	}

}

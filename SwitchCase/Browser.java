package SwitchCase;

public class Browser {

	
	//WAF: to launch the browser
	//name: launchBrowser: chrome/ff/safari/edge
	//param: browser name
	//return: boolean
	// First create method with parameter. so parameter is not hard coded
	//print out browser
	//After Switch case we need to give confirmation to the user which browser is launch
	
	
	public boolean launchBrowser(String browserName) {
		
		System.out.println("browser name is :"+browserName );
		
		boolean flag= true;
		
		switch(browserName.trim().toLowerCase()) {
		
		
		case "chrome":
			
			System.out.println("chrome is launched");
		break;
		
		case " firefox":
			System.out.println("firefox is launched");
			break;
			
		case " edge":
			System.out.println("edge is launched");
			break;
			
		case "safari":
			System.out.println("safari is launched");
			break;
			default:
			System.out.println(" Please pass right browser");
			break;
					
		}
		
		return flag;
		}
		
		
		
			
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Browser br = new Browser();

//br.launchBrowser("chrom");
boolean flag = br.launchBrowser("edge"); 

if (flag) {
	System.out.println("enter url");
}
	
else {
	
	System.out.println("error - no browser is there");
}
}
	}



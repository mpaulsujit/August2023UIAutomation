package incapsulation;

public class Browser {

	
	public void lunchBrowser() {
		
	System.out.println("Lunching Browser");	
		checkRAM();
		checkCPUUtilization();
		checkBrowserVersion();
		checkBrowserUpgrade();
		System.out.println("Browser is lunch");	
		
	}
	
	private void checkRAM() {
		System.out.println("Check Ram");
		
	}
	
	private void checkCPUUtilization() {
		
		System.out.println("checkCPU Utilization");
		
		
	}
	
	private void checkBrowserVersion() {
	
		
		System.out.println("checkBrowserVersion");
	}

	private void checkBrowserUpgrade() {
		System.out.println("checkBrowserUpgrade");
	}
	
	
}

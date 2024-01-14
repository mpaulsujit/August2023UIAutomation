package Language;

public class Language1
 {

	public static void useLan(Language1 obj) {
		System.out.println("use this lang"); 
		
		obj.readLang();
		
	}
	
	public void readLang() {
		System.out.println("read lang");
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Language1 lg = new Language1();
		
		lg.readLang();
		Language1.useLan(lg);
	}

}

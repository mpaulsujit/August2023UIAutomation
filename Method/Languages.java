package Method;

public class Languages {
	public static void useLang(Languages meg) {
		System.out.println("use this lang");
		//obj=null;
		meg.readLang();
	}

	public void readLang() {
		System.out.println("read lang");		
	}

	public static void main(String[] args) {
		Languages lg = new Languages();
		lg.readLang();		
		Languages.useLang(lg);
	}
	

}

package Method;

public class FileConcept {
	static String Name;//Static string variable
	int filesize;// instance variable
	public static void readFile() {
		
		System.out.println("Read file");
	
		
	}
	
	public void writeFile() {
		System.out.println("Write file");
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FileConcept obj = new FileConcept();
		
		obj.readFile();// static method no need call by object
		
		readFile();// since it is static method can call directly
		FileConcept.readFile();// static method you can call with class
		
		//Non-static method
		
		obj.writeFile();// non-static method is call by object reference variable
		
		
		
		

	}

}

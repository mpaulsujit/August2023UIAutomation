package StringConcept;

public class reverseString1 {
//reverse string selenium
	
	public static String stringReverse(String str) {
		//null check
		
		if (str==null) {
			
			System.out.println(" String is null, can not reverse, please pass the right value");
			return null;
			
		}
		if (str.isBlank()) {
			
			System.out.println("HIIIII");
			return str;
		}
		
		
		//length check
		int len = str.length();//8 length
		
		if(len==1|| len==0) {
			return str;
		}
		
		String rev = "";
		
		for(int i= len -1; i>=0; i--) {
			rev= rev+str.charAt(i);//
			
			
		}
		return rev;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(stringReverse("selenium"));
//System.out.println(stringReverse("selenium Automation"));
//System.out.println(stringReverse("T"));
//System.out.println(stringReverse("null"));
//System.out.println(stringReverse(null));
System.out.println(stringReverse(""));
//System.out.println(stringReverse("   87"));

	System.out.println(stringReverse("Selenium is good"));

	System.out.println("I love \"java\"coding");// print java with ""
}
}

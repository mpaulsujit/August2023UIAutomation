package ArrayConcept;
import java.util.Arrays;
public class Arraygeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int k[] = new int[2];
//		 k[0]= 10;
//		k[1]=14;
//		k[2]=18;
//	
////		System.out.println(k.length);
//		//Print literal array number from greatest to lowest
//		int number[] = {1,2,3,4,5,6,7,8,9,10};//0-9==>10
//		for(int r = number.length-1;  r>=0 ; r--) {
//			System.out.println(number[r]);//10
//			
	
	// String litteral array		
String st[]= {"Meghna", "Paul", "Sujit"};
String stNames[] = {"Sudheer", "RAvi", "Naveen", "Tom"};
System.out.println(st[2]);

	System.out.println(st.length);
	System.out.println(stNames.length);
	//print from back to front
	
	for(int r=st.length-1; r>=0; r-- ) {
		System.out.println(st[r]);
//System.out.println(***********);
		for(int s= stNames.length-1; s>=0; s--) {
			System.out.println(stNames[s]);	
		}
	}
	
	
} 
}

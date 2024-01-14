package ArrayConcept;

import java.util.Arrays;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Disadvantage o array: Size is fixed. Similar data type
		// To overcome similar datatype we use Object 
		
		Object obj[]=new Object[5];
		
		obj[0]= "Paul";
		obj[1]= 58;
		obj[3]= true;
		obj[4]='f';
		obj[2]=12000.60;
		
		//System.out.println(Arrays.toString(obj));
		
		//System.out.println(obj[2]);
		int count = 0;
		for(Object e: obj) {
			
			System.out.println(count + "=" +e);
			//if(e.equals('Paul')) {
				
				System.out.println(" Paul is unemplyed");
			}
			count++;
		}
		
		
		
	}

}

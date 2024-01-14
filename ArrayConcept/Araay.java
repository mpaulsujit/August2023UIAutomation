package ArrayConcept;

import java.util.Arrays;

public class Araay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Array is the collection of similar datatype variable 	
		
		int i[] = new int[4];  // here length = 4, lowest index=0, highestindex = 3
		//if we print just i it will give the memomry location.
		
		//System.out.print(i);//[I@5acf9800
		
		//Declare the value of the variable
		
		i[0]= 10;
		i[1]= 15;
		i[2]= 20;
		i[3]= 24;
		
		//Print all the value of the variable
		
		//System.out.print(Arrays.toString(i));//[10, 15, 20, 24]
		//If I want to print them by index
		
		//for(int j=0; j<i.length; j++) {
			
			//System.out.println(i[j]);
			
			// if i want to print according to index
			

			//System.out.println(j +"="+ i[j]);//0,1,2,3
		
		//for each loop
		
		//int count =0 ;
		
		//for(int e: i) {
			
			//System.out.println(count + "="+e);
			//count++;
		
		//Foreach loop reverse print
		
		//int count =4;
		
				//for(int e: i) {
					
					//System.out.println(count + "="+e);
					//count--;
				// Reverse print with index
		
		for( int j=3; j>=0; j--) {
			System.out.println(j + "="+ i[j]);//3,2,1,
			
				
		}
		
		 
		
		
		
	}

}

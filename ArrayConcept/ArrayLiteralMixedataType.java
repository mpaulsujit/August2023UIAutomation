package ArrayConcept;

import java.util.Arrays;

public class ArrayLiteralMixedataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object empInfo[][] = {
				{"Neha", 25, "SDET1", true},
				{"Vijay", 27, "SDET2", false},
				{"Rahul", 28, "SDET Manager", true}
		};
		
		System.out.println(Arrays.deepToString(empInfo));
		
		
		
		for(int row=0; row<empInfo.length; row++) {
			for(int col=0; col<empInfo[0].length; col++) {
				System.out.print(empInfo[row][col] + " ");
			}
			
			
	}
		
		}

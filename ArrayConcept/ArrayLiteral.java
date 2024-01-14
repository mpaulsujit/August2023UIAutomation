package ArrayConcept;

import java.util.Arrays;

public class ArrayLiteral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num[][]= {
		{1, 2, 3},
		{2, 3, 4},
		{4, 5, 6},
		{7, 8, 9}
		
};

System.out.println(num.length);// size of the row
System.out.println(Arrays.deepToString(num));

//System.out.println(Arrays.toString(num));// it will give just un-necessary space

for (int row=0; row<num.length; row++) {
	for (int col=0; col<num[0].length; col++) {
		
		System.out.println(num[row][col]);
		//break;//only print ist row and column
		
	}
	System.out.println();
	
}
	}

}

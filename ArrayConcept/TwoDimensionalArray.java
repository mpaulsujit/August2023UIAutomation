package ArrayConcept;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[][] = new int[2][3];
		ar[0][0] = 10;
		ar[0][1] = 13;
		ar[0][2] = 12;
		ar[1][0] = 10;
		ar[1][1] =20;		
		ar[1][2] =30;
	System.out.println(ar[0][2]);
		//print all values
		
for (int row =0; row<ar.length; row ++) {
						
			for(int col=0; col<ar[0].length; col++){
			System.out.println(ar[row][col]);
			}
	}
}
}
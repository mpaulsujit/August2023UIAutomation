package ArrayConcept;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i[] = new int[4];

//here 4 is length of the array
//lawest index of this array is 0
// highest index of ths array is 3( length -1)
// Array is the collection of similar data type. Array is non-primitive data type
//Static: Size is fixed 
//Similar datatype  values only


i[0]=10;
i[1] = 20;
i[2]= 30;
i[3]=34;
for(int j=0; j<i.length;j++ ) {

//System.out.println(Arrays.toString(i)); print all the value of i

	System.out.println(i[j]);
	}
}
}
package ArrayConcept;
import java.util.ArrayList;

public class ArrayAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  Write a Java program to create a new array list, which contains all color names.
//        --add some colors (string) 
 //      ---and print out the colorslist using loops.

ArrayList<String> color = new ArrayList<String>(3);
color.add("red");
color.add("blue");
color.add("purple");
color.add("Green");

for(int j=0;j<color.size(); j++) {
System.out.println(color(j));
	
}
		
		
	}

} 

package ArrayConcept;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayListR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//ArrayList are build up class in Java
	//In array list no need to declare the size of the array	
	// internaly it is VC(virtual capacity) = 10	
		
		
ArrayList ar = new ArrayList();// vc = 10 and PC = 0
	System.out.println(ar.size());	//size is 0 since it is integer
	
	ar.add(100); // 0 index
	ar.add(50); //1 index
	System.out.println(ar.size());// size should be 2
	// VC = 8, PC = 2
	
	System.out.println(ar);
	System.out.println(ar.get(1));
ar.add(20);// 3rd index

ar.set(0, 400);

System.out.println(ar);
ar.remove(0);
System.out.println(ar);	

ar.add(0, 700);
System.out.println(ar);

System.out.println(ar.size());

//when all the 10 VC are loaded it will add another10/2= 5 

	}

}

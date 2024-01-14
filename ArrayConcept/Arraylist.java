package ArrayConcept;
import java.util.Arrays;
import java.util.ArrayList;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arlist = new ArrayList<Integer>();
		arlist.add(100);//0 index
		arlist.add(200);//1 index
//		
//		System.out.println(arlist.size());
//		
//		System.out.println(arlist.get(0));
//		for (int i=0;i<arlist.size(); i++ ) {
//			System.out.println(arlist.get(i));
//			//Add 2 value of arraylist during print
//			//System.out.println(arlist.get(0)+arlist.get(1));
//			//break;// if you give break here 
			
			//For each loop
			for(Integer e : arlist) {
				System.out.println(e);
			
		}
	}

}

package ArrayConcept;
import java.util.Arrays;
import java.util.ArrayList;

public class ArListString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
ArrayList<String>  arliststring = new ArrayList<String>();

arliststring.add("Meghna");
arliststring.add("paul");
arliststring.add(null);
for (String e: arliststring) {
//System.out.println(arliststring.get(0)+ " " +arliststring.get(1));
System.out.println(e);
}
	}

}

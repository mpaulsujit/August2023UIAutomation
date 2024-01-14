package collectionConcept;
import java.util.HashMap;
public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How to create hash map. Top casting
		
HashMap<Integer, String> userMap = new HashMap<Integer, String>();

userMap.put(1, "Tom");
userMap.put(2, "Naveen");
userMap.put(3, "Ravi");
userMap.put(4, "Pooja");

HashMap<String, String> empMap = new HashMap<String, String>();

empMap.put("Ravi", "SDET");
empMap.put("TOM", "SDET MANAGER");
empMap.put("Naveen", "QA");

//empMap.put("Lisa", "null");
//empMap.put("Lipi", "Null");
//empMap.put("null", "QA");
//empMap.put("null", "QA Manager");
// only one null is allowed in keys
//duplicates will allowed but always will take the latest value

System.out.println(userMap.get(3));
System.out.println(empMap.get("Naveen"));

System.out.println(userMap);

System.out.println(empMap);

	}

}

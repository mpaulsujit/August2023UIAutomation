package ExceptionalHandling;

public class Student {
	
	public int getMarks(String studentName) {
		
		System.out.println("getting marks for student: " + studentName);
		
		if(studentName.equals("Ravi")) {
			
			return 100;
		}
		
		else if(studentName.equals("Kiran")) {
			return 90;
		}
		
		else if(studentName.equals("Kirishma")) {
			return 80;
	}
		else{
			
		System.out.println("Plz pass the right Student name"); {
			throw newb AppException(" student not found")
	
		}
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student st = new Student();
int mk = st.getMarks("Ravi");

System.out.println(mk );
	}

}

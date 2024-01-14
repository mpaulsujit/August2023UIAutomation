package constructorconcept;
import java.util.Arrays;

public class RectangleCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r= new Rectangle();
		
		Rectangle r1= new Rectangle(12.2, 12.3);
		
		double area = r1.length*r1.height;
		
		System.out.println(r.length + " "+ r.height);
		System.out.println(r1.length + " "+ r1.height);
		System.out.println("Area of Rectangle="+ area);
		
		
		
		
	}

}

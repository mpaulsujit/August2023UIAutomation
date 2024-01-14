package constructorconcept;

public class Rectangle {
	
	double length;
	double height;
	
public Rectangle(double length, double height) {
		
	this.length = length;
	this.height = height;
	}
		
public Rectangle() {		
		//this.length = length;
		//this.height = height;
	}

		
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

package constructorconcept;

public class Employee {
//Class variables
	String name;
	int id;
	double salary;
	//Create constructor
//	public Employee() {
//		System.out.println("default const......");
//		
//	}
//	//overload constructor. Duplicate constructor is not allowed
//	public Employee(int a) {
//		System.out.println("one parameter const......");
//	}
	
	public Employee(String name) {
		
		this.name=name;
System.out.println("Employee Name......"+name);

//Constructor Overloading
	}
public Employee(String name, int id) {
	this.name=name;
	this.id=id;
		
	}
public Employee(String name, int id, double salary ) {
	this.name=name;
	this.id=id;
	this.salary=salary;
		
	}
	
public void test() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Object created
		Employee e1= new Employee("Meghna");
		
		System.out.println(e1.name);
		
		Employee e2= new Employee("tom", 200);
		
		//If requirement change for salary tom then we can write
		
		e2.salary=215;
		e2.id = 400;
		System.out.println(e2.name+" "+e2.id+" "+e2.salary);
Employee e3= new Employee("toni", 300, 13400);
		
		System.out.println(e3.name+" "+e3.id+" "+e3.salary);
		
		
		
	}

}

package constructorconcept;

public class Person {
 

String name;
int age;
char gen;
double height;

public Person(String name, int age) {
	// this.name = name make global variable and local variable equal. In this case we will get 
	this.name= name;
	this.age=age;
}


public Person(String name, char gen) {
	// this.name = name make global variable and local variable equal. In this case we will get 
	this.name= name;
	this.gen=gen;
}
	
	// TODO Auto-generated constructor stub

public Person(String name, double height) {
	// this.name = name make global variable and local variable equal. In this case we will get 
	this.name= name;
	this.height=height;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Here Meghna is defined as local variable. p1.name-> name here is global variable. So, global variable is not declare here yestthat is the reason we are getting null as a default value 	
Person p1 = new Person("meghna", 13);

Person p2 = new Person("meghna",'F' );

Person p3 = new Person("meghna", 5.5 );

//Person p4 = new Person();// undefined object will be restricted 


System.out.println(p1.name+ " " + p1.age);
		
System.out.println(p2.name+ " " + p2.gen);

System.out.println(p3.name+ " " + p3.height);


		
		
		

	}

}

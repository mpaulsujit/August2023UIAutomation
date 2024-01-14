package DataType;

public class DataTypeRangeSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//DataType: type of data:
	//	1. Primitive: Declare directly. no need to refer object
		//2. Non-Primitive: Need to declare by reference
		//Array, class, influence, objects
		
//		primitive: Has 2 types
//		1. Boolean:true/false
//		2. Numeric: 
//		Numeric value has 1. character, 2. Integral
//		integral value: 1.Integar: byte, short, int, long
//		Floating Point: float, double
		
		//byte
		//size = 1,1 byte=8 bits
		//Range: -128 to 127
		//byte a =300;//error because out of range
		byte a =10;//in Java location will be assign for the variable a 8 bits
		a=20;// What is going to a value now? ans is 20
		//byte a =40  // Compile time error since duplicates variable name is nt allowed
		byte b = 20;
		
		
		System.out.println(a);// 20
		
		System.out.println(a+b); //40
		
		
		//short
		//size= 2 byte, 2 byte = 8*2=16 bits
		//range = -32768 to 32767
		
		short s = 3000;
		short s1 = -3000;
		short s2= 30000;
		short s3 =100;
		int s4 = s2 + s3;// anytime need calculation of short result needs to declare as int
		//short s3 = s1+s;// error type mismatch can not convert int to short
		//int s3 = s1+s; // The reason above showing type mismatch because after calculation may be it will not any more short
		
		System.out.println(s4);
		
		
		//int
		//size = 4, 4byte = 4*8 = 32 bits
		//Range -2147483648 t0 2147483647
		
		int i= 10;
		
		int j = 60000;
		
		//long 
		
		//size =8 byte, 8 byte = 8*8=64 bits
		
		//Range : -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		//-2^63 to 2^63-1
		long l = 10;
		
		long l1 = 100998877665l;// if you enter l at end error will go away. 
		System.out.println(l1);
		
		
		//Char: whenever arrithmatic calculation it will take ASCHII value
		//size= 2 byte, 2 bytes = 16 bits
		// no range since this is only one character
		// Unicode -> special +long char + ASCHII
		char c = 'a';//a to z
		char c1 = '0';// 0 to 9
		char c2 = 'G'; // A to G
		char c3 = '$';//
		System.out.println(c+c2)	;// here c= a = 97, c2 = G = 71	expect =168
		
		System.out.println(c3);//expect $
		
		//float
		//size =4 byte = 4*8 = 32 bits
		//range: after decimal about 7 digit
		
		
		//float f = 10.2// will get error
				
				float f = (float)10.2;
				float f1 = (float)10.209876998764;
				System.out.println(f1);// It will print 6 digit after decimal point even thought you declare more digit
		
				float f2 = 10.209876998764f;// if you decale float you can add f at the end		
		//Double
				
		//size =4 byte = 4*8 = 32 bits		
				//range: after decimal about 15 digit		
				
				double d = 12.09876543d;// you can add d or not 
				
				System.out.println(d);
				
				
	}

}

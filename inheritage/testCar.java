package inheritage;

public class testCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMW b = new BMW();
		
		b.start();// Method Overriding:start has both classes it will take from the child class. 
		b.stop();//inheritance from car
		b.autoParking();// own method
		b.refil();//inheritance
		b.engine();
		//b.color();
		System.out.println();
		
		
		Car c = new Car();
		
		AUDI a = new AUDI();
		//a.color();
		c.start();
		c.stop();
		//c.autoparking();// this is clicd class parent can not take this
		
	}

}

package chap08.examples.sec080502;

public class CarExample {
	public static void main(String[] args) {
		Car myCar =  new Car();
		
		myCar.run();
		
		myCar.frontLeftTire =  new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		System.out.println();
		
		myCar.run();
	}

}

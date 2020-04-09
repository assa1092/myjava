package chap07.examples.sec070502;

public class Car {
	// field
	public int speed;
	
	// method
	public void speedUp() {
		speed +=1;
	}

	// final method
	public final void stop() {
		System.out.println("차를 멈춤");
		speed=0;
	}
	
}

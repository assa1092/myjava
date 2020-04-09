package chap07.examples.sec070502;

public class SportsCar extends Car {
	
	@Override
	public void speedUp() {speed +=10;}
	
	
	// Overriding 을 할수가 없다 final때문에
//	@Override
//	public void stop() {
//		System.out.println("스포츠카를 멈춤");
//		speed=0;
//	}
	

}

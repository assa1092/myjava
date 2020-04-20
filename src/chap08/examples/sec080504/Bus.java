package chap08.examples.sec080504;

public class Bus implements Vehicle {
	
	Bus() {
		System.out.println("버스가 생성됨");
		
	}
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
		
	}

}

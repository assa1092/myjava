package chap08.examples.sec080504;

public class Taxi implements Vehicle {
	Taxi(){
		System.out.println("택시가 생성됨");
	}
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
		
	}
}

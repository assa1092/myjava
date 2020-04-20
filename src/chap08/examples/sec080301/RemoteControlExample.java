package chap08.examples.sec080301;

import chap08.examples.sec080201.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc ;
		rc = new Television();
	
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(3);

		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(3);
		
		
		
		// 인터페이스로는 인스턴스로 만들수 없다
		// 그러나 몸톰까지 다 작성하면 가능하다.
		RemoteControl r1 = new RemoteControl() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
			
		};	
		
	}

}

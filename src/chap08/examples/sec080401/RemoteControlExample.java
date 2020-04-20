package chap08.examples.sec080401;

import chap08.examples.sec080201.RemoteControl;
import chap08.examples.sec080301.Audio;
import chap08.examples.sec080301.Television;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;		// 인터페이스 변수 선언
		
		rc =  new Television();			// Television객체를 인터페이스 타입에 대입
		rc.turnOn();					// 인터페이스의 turnOn(), turnOff() 호출
		rc.turnOff();
		rc.setVolume(3);
		rc.setMute(false);				// 인터페이스의 setMute()호출
		
		System.out.println();
		
		rc =  new Audio();				// Audio객체를 인터페이스 타입에 대입
		rc.turnOn();					// 인터페이스의 turnOn(), turnOff() 호출
		rc.turnOff();
		rc.setVolume(6);
		rc.setMute(true);				// Audio의 재정의된 SetMute()호출  
		
		
		// static method 이기 때문에 인터페이스명 으로 접근가능하다... 
		RemoteControl.changeBettery();
		
		
		
		
	}
}

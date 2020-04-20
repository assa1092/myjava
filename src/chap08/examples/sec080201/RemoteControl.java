package chap08.examples.sec080201;

public interface RemoteControl {
	
	// Constant field
	
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	
	// Abstract method
	
		// 메소드 선언부만 작성
	public void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	
	
	// Default method
	
		// 객체 생성없이 실행가능
		// 메소드 선언과 동시에 내용까지 작성가능하다
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	
	
	
	
	// Static method
	
		// 객체 생성없이 실행가능
		// 메소드 선언과 동시에 내용까지 작성가능하다
	static void changeBettery() {
		System.out.println("건전지를 교환합니다.");
	}

}

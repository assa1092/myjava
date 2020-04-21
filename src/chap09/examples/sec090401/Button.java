package chap09.examples.sec090401;

public class Button {
	// 인터페이스 타입 필드
	OnClickListener listener;
	
	// 매개변수의 다형성 
	void setOnClickListener(OnClickListener listener) {
		this.listener =  listener;
		
	}
	
	void touch() {
		listener.onClick();		// 구현객체의 onClick()메소드 호출
	}
	
	
	// 중첩 인터페이스
	interface OnClickListener{
		void onClick();
	}

}

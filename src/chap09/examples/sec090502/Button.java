package chap09.examples.sec090502;

public class Button {
	// 인터페이스 타입 필드
	OnClickListener listener;
	
	
	// 매개변수의 다형성
	void setOnClickListener(OnClickListener listener) {
		this.listener= listener;
	}
	
	
	
	void touch() {
		// 구현 객체의 onClick() 호출
		listener.onClick();
	}
	
	
	// 중첩 인터페이스
	interface OnClickListener{
		void onClick();
	}

}

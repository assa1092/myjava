package chap07.examples.sec070803;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone();		//추상 클래스이므로 객체생성이 안된다
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
	}

}

package chap07.examples.sec070803;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone();		//추상 클래스이므로 객체생성이 안된다
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();			// 상속받은 Phone 클래스의 메소드
		smartPhone.internetSearch();
		smartPhone.turnOff();			// 상속받은 Phone 클래스의 메소드
		
		Phone phone = smartPhone;		//	인스턴스만 못만들고 형변환은 가능(?)
		
	}

}

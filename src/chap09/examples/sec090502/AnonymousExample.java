package chap09.examples.sec090502;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		//익명 객체를 필드로 사용
		anony.field.turnOn();
		
		// 익명 객체를 로컬변수로 사용
		anony.method1();
		
		
		// 익명 객체를 매개값로 사용
		anony.method2( new RemoteControl() {

					@Override
					public void turnOn() {
						System.out.println("SmartTV를 켭니다");
						
					}

					@Override
					public void turnOff() {
						System.out.println("SmartTV를 끕니다");
						
					}
					
				
				}
		);
	}

}

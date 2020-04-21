package chap09.examples.sec090203;

public class Main {
	public static void main(String[] args) {
		
		// static class 외에는
		// static field, static method 를 사용할 수 없다...
		
		A a =new A();
		
		// 인스턴스 멤버 클래스 객체 생성
		// 인스턴스 클래스이므로 B클래스 안으로 바로 접근불가
		// 바깥클래스인 A클래스먼저 만들고 그 객체로 B클래스로 접근한다.
		A.B b = a.new B();
		b.field1=3;
		b.method1();
		
		// 정적 멤버 클래스 객체 생성
		A.C c = new A.C();
		c.field1=3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		// 로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
	}

}

package chap09.examples.sec090301;

public class A {
	// 인스턴스필드
	B field1 = new B();
	C field2 = new C();
	
	// 인스턴스 메소드
	void method1() {
		B var1 =  new B();
		C var2 = new C();
	}

	
	
	// 정적 필드 초기화
//	static B field3 = new B();		// 스태틱이라 인스턴스 멤버로 접근불가
	static C field4 = new C();
	
	
	
	// 정적 메소드
	static void method2() {
//		B var1 = new B();			// 스태틱이라 인스턴스 멤버로 접근불가
		C var2 = new C();
	}
	
	// 인스턴스 멤버 클래스
	class B{}
	// 스태틱 멤버 클래스
	static class C{}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

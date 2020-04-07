package chap06.lecture.staticKeyword;

public class MyClass {
	
	static int j;	// static field, class field
	
	int i;	// instance field
	
	static {
		j = 98765;
	}
	
	MyClass(){
		// 인스턴스 초기화 하는 코드들 작성.
	}
	
	
	
	
	
	
	
	
	
	
	
	void method() {
		System.out.println(this.i);
		System.out.println("인스턴스 메소드");
	}
	// static method, class method
	// static method 에서는 this 를 쓸수가 없다... 어느것인지 모른다.
	static void method2() {
//		method(); // 스태틱 멤버에서 인스턴스 멤버로 접근이 안된다.
		
//		System.out.println(this.i);
//		System.out.println(this.j);
		System.out.println("스태틱 메소드");
			
	}
	
}

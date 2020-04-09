package chap07.lecture.override;

public class SubClass extends SuperClass {
	
	// 슈퍼 클래스의 메소드와 똑같은 상태로 재정의 할수 있다...override...
	// method overriding
	public void method1(){
		System.out.println("서브클래스의 메소드1");
	}
	
	public void method1(int i) {
		System.out.println("서브클래스의 메소드1(int)");
	}

}

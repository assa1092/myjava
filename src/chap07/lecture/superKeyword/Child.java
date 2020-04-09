package chap07.lecture.superKeyword;

public class Child extends Parent {
	public int j;
	
	@Override
	public void method() {
		super.method();	// 부모클래스의 메소드를 사용할때 super
		System.out.println("재정의된 자식 클래스의 메소드");
	}
	
	
	public void method2() {
		System.out.println("자식 클래스 메소드2");
		// super 는 부모 클래스의 필드 메소드 에 접근할때 사용
		System.out.println(super.i);
		super.method();
		System.out.println(this.i);
		this.method3();
	}

	
	public void method3() {
		
	}
	
}

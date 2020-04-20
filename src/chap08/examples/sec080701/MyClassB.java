package chap08.examples.sec080701;

public class MyClassB implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassB - method 1() 실행");
		
	}

	@Override
	// method2()는 디폴트 메소드라 재정의 안해도 상관은 없다....
	public void method2() {
		System.out.println("MyClassB - method 2() 실행");
		
	}
	

}

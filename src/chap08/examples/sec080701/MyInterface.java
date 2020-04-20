package chap08.examples.sec080701;

public interface MyInterface {
	public void method1();
	
	public default void method2() {
		System.out.println("MyInterface - method 2 () 실행");
	}
}

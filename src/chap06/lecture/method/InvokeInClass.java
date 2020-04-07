package chap06.lecture.method;

public class InvokeInClass {
	void method1() {
		System.out.println("method1 실행");
	}
	void method2() {
		method1();
		System.out.println("method2 실행");
	}

}

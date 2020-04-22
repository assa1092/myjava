package chap10.lecture.runtimeException.classCastException;

public class ClassCastExceptionSample {
	static class A{}
	static class B extends A{}
	
	public static void main(String[] args) {
		A a = new A();
		if(a instanceof B) {
			B b = (B) a;
		}
		System.out.println("프로그램 실행 종료");
	}

}

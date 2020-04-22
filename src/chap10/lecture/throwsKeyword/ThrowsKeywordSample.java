package chap10.lecture.throwsKeyword;

public class ThrowsKeywordSample {
	public static void main(String[] args)  throws ClassNotFoundException{
		method2();
	}
	
	
	public static void method2() throws ClassNotFoundException {
		method1();
	}
	
	public static void method1() throws ClassNotFoundException {
		Class.forName("java.lang.SString");
		
	}

}

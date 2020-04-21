package chap09.examples.sec090303;

public class Outter {
	// 자바 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
//		arg = 100;					//	(X) final변수이므로 변동불가
//		localVariable = 100;		//	(X) final변수이므로 변동불가
		
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	
	
	
	// 자바 8 이후
	public void method2(int arg) {
		int localVariable =1;
//		arg =100;					//	(X)final이 없어도 final변수이므로 변동불가
//		localVariable = 100;
		
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}

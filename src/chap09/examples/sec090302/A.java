package chap09.examples.sec090302;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	
	class B{
		void method() {
			field1=10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	
	
	
	// static 멤버에서는 인스턴스 멤버를 접근할수 없다..
	static class C{
		void method() {
//			field1=10;
//			method1();
			
			field2 = 10;
			method2();
		}
		
	}

}

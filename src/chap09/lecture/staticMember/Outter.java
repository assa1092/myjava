package chap09.lecture.staticMember;

public class Outter {
	NonStatic ns =  new NonStatic();
	Static st = new Static();
	
//	static NonStatic sns = new NonStatic();	// (X)
	static Static sst =  new Static();
	
	int instanceF;
	static int staticF;
	
	class NonStatic{
		void method() {
			staticF=5;
			instanceF = 7;
		}
	}
	
	static class Static{
		void method() {
//			instanceF = 99;		// (X) 어떤 객체의 필드가 될지 모르기때문 
			staticF = 9;
		}
	}
	
	
	
	void instanceMethod() {
		instanceF = 5;
		staticF = 3;
	}
	static void staticMethod() {
//		intstanceF =99;		// (X) 어떤 객체의 필드가 될지 모르기때문 
		staticF = 9;
	}

}

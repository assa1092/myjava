package chap09.lecture.nestedClass;

public class NestedClass {
	
	static int staticM;		// static 멤버는	객체 생성없이 접근가능
	int instanceM;			// instance멤버는객체 생성후 접근가능
	
	
	
	
	
	// static class
	static class StaticClass{
		
	}
	
	
	
	// instance class
	class OtherClass{
		
		int field;
//		static int staticField;		// 스태틱 필드를 가질수없다.
		
		OtherClass(){
			
		}
		void method() {
			
		}
		
		
		
	}
	
	
	void method() {
		class LocalClass{
			
			int field;
//			static int staticField;		// 스태틱 필드를 가질수없다.	
			
			// 로컬 클래스라....이 메소드안에서만 사용가능하다
		}
		
		LocalClass lc = new LocalClass();
	}
}

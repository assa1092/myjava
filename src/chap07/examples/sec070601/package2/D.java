package chap07.examples.sec070601.package2;

import chap07.examples.sec070601.package1.A;

public class D extends A {
	public D(){
		// protected 때문에 new 연산자로 생성할수가 없다.		
//		A a = new A();
		
		// A 클래스를 상속 받았기때문에 부모 클래스를 통한 접근은 가능....
		super();
		this.field = "value";
		this.method();
		
	}
}

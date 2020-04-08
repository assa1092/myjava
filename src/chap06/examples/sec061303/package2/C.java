package chap06.examples.sec061303.package2;

import chap06.examples.sec061303.package1.A;

public class C {
	public C () {
		A a = new A();
		
		a.field1 = 1;
//		a.field2 = 1;	// import 하였어도 default여서 사용불가
//		a.field3 = 1;	// import 하였어도 private여서 사용불가
		
		a.method1();
//		a.method2();	// default
//		a.method3();	// private
		
	}
}

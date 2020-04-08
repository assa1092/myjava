package chap06.examples.sec061303.package1;

public class B {
	public B() {
		A a =new A();
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1;	// private
		
		a.method1();
		a.method2();
//		a.method3();	// private
	}

}

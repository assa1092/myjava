package chap09.lecture.anonymous;

public class MyApp2 {
	public static void main(String[] args) {
		MyInterface m1 = new MyInterfaceImpl();
		MyInterface m2 = new MyInterface() {
			@Override
			public void method() {
				System.out.println("anonymous method");
				
			}
		};
		
		
		m1.method();
		m2.method();
	}

}

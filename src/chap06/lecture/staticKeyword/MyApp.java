package chap06.lecture.staticKeyword;

public class MyApp {
	public static void main(String[] args) {
		
		// MyClass가 로딩되는 순간 static block이 실행된다...
		System.out.println(MyClass.j);
		
		
		
		MyClass c1 = new MyClass();
		MyClass c2 = new MyClass();
		
		c1.i = 30;
		c2.i = 99;
		
		System.out.println(c1.i);
		System.out.println(c2.i);
		
		System.out.println();
		
		c1.j = 77 ;
		c2.j=100;
		System.out.println(c1.j);
		System.out.println(c2.j);
		
		// 인스턴스를  생성하지 않아도 사용가능하다...
		MyClass.j =900;
		System.out.println(c1.j);
		System.out.println(c2.j);
		
		System.out.println(MyClass.j);
		
		System.out.println();
		c1.method();
		c2.method();
		c1.method2();
		c2.method2();
		
		
		// 인스턴스가 없어도 클래스이름으로 사용가능하다
		MyClass.method2();
	}

}

package chap06.lecture.myclass;

public class MyApp {
	public static void main(String[] args) {
		
		MyClass c1; 		// MyClass라는 Class c1를 만들어서 stack에 저장
		c1= new MyClass();	// MyClass 객체 c1을  heap영역에 저장.
		
		MyClass c2 = new MyClass();
		
		System.out.println(c1 == c2);
		
//		System.out.println(c1.field1);
//		System.out.println(c1.method1());
		}

}

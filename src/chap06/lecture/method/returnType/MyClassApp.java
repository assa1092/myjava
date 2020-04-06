package chap06.lecture.method.returnType;

public class MyClassApp {
	public static void main(String[] args) {
		MyClass c1 =  new MyClass();
		c1.method2(3);
		c1.method2(2);	//if문 안에서 return을 만났기때문에 바로 종료...
		c1.method3();
		int c =  c1.method3();
		System.out.println(c);
		System.out.println(c1.method3());
		
		long d= c1.method4(9); // method4의 리턴값이 long 이였으므로 long 으로 받아야함
		System.out.println(d);
		System.out.println(c1.method4(9));
		
		
	}

}

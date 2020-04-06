package chap06.lecture.field;

public class MyApp1 {
	public static void main(String[] args) {
		MyField f1 = new MyField();

		// MyField에 변수를 선언해 놓았기때문에
		// 그 변수에 값을 넣을수 있다.
		f1.a = 30;
		f1.n="값";
		f1.d=3.14;
		f1.b=false;
		
		System.out.println(f1.a);
		System.out.println(f1.n);
		System.out.println(f1.d);
		System.out.println(f1.b);
		
		
		MyField f2 =  new MyField();
		
		// 초기값이 지정되지 않은 필드들은 
		// 객체 생성시 자동으로 기본 초기값으로 설정된다.
		// 보통은 0, false, null로
		System.out.println(f2.a);	// 0
		System.out.println(f2.n);	// null
		System.out.println(f2.b);	// false
		
		f2.a = 99;
		
		System.out.println(f2.a);
		System.out.println(f1.a);
		
	}

}

package chap03.unary;

public class BitwiseNot {
	public static void main(String[] args) {
		// 0 ↔1
		// 십진법 10
		// 이진법 00..0001010
		
		// ~연산이후
		// 이진법 11..1110101
		
		int a =10 ;
		int b = ~a ;
		System.out.println(a);
		System.out.println(b);
		
		byte b1 =  10;
//		byte b2 = ~b1;
		
		
		//정수를 비트(문자열 String)로 표현하는 메소드
		
		String s = Integer.toBinaryString(a);
		System.out.println(s);
		s = Integer.toBinaryString(b);
		System.out.println(s);
			
		
	}
	
	// 자바 스크립트 에서의 함수 개념
	public static String toBinaryString(int value) {
		String str =  Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0"+str;
		}
		return str;
	}

}

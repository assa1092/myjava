package chap03.binary.arithmetic;

public class Arithmetic {
	
	public static void main(String[] args) {
		// 산술 연산자
		// + - * / %
		// 정수(byte, short, char, int) →결과가 모두 int
		// 두 항의 타입이 다를 경우 큰 타입으로 결과 나옴
		
		int i1= 10;
		int i2 = 20;
		int i3 =  i1 + i2;
		int i4 =  i1 - i2;
		int i5 =  i1 * i2;
		int i6 =  i1 / i2;
		int i7 =  i1 % i2;
		
		byte b1 = 10;
		byte b2 = 20;
//		byte b3 =  b1 +  b2;	// int b3 면 가능
		
		int i8 = 30;
		long l1 = 100000;
//		int i9 =  i8 + l1;		//long i9= 는 가능
		long i9 = i8 +l1;
		
		long l2 = 20000000;
		float f1 =  3.14F;
		float l3 =  l2 +  f1;
		
		float f2 =  3.14F;
		double d1 =  2.22;
		
//		float f3 =  f2 + d1;
		double f3 =  f2 + d1;
		
		char c1 = 'A';
//		char c2 =  c1 + 1;
		char c2 =  (char)(c1 + 1);
	}

}

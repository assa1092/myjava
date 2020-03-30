package chap02.typecasting;

public class Explitcit {
	public static void main(String[] args) {
		//byte→ short→ int→ long→ float→ double
		//       char↗
		
		int i = 103029770;
		byte b = (byte) i;
		
		System.out.println(i);
		
		// 4byte의 int가 1byte의 byte로 변환시 앞의 3byte는 0으로 채워진다
		System.out.println(b); 
		
		long l=300;
		i = (int)l ;
		System.out.println(l);
		System.out.println(i);
		
		int intValue  = 'A';
		char charValue =  (char)intValue;
		System.out.println(charValue);
		
		double d = 3.14;
		int i3 = (int) d;	//소수점 이하는 버리고 정수로 
		
		System.out.println(i3);
		
		
	}

}

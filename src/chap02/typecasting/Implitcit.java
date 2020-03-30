package chap02.typecasting;

public class Implitcit {
	public static void main(String[] args) {
		//자동(묵시적) 형 변환
		// 작은 크기 타입 → 큰 크기 타입
		//byte→ short→ int→ long→ float→ double
		//       char↗
		//boolean
		
		byte b= 10;
		short s =  b;
//		 b = s;
		int  i = s;
//		s =  i;
		long l = i;
		
		float f =  l;
//		l = f;
		double d = f;
//		f = d;
		
		char c = 'a';
		i = c;
//		c=  i;
		
	}

}

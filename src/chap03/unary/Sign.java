package chap03.unary;

public class Sign {
	
	public static void main(String[] args) {
		int i1= +100;
		int i2= -100;
		double d1 =  +3.14;
		double d2 = -10.5;
		
		int r1 = -i2;
		System.out.println(r1);
		int r2 = +i2;
		
		short s =100;
//		short r3 = -s; // 형 변환으로 -s 는 Integer로 바뀐다.
		
	}

}

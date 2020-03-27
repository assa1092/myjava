package chap02.datatype;

public class Byte1 {
	public static void main(String[] args) {
		
		// 1byte 크기 ( 8 bit)
		// -128 ~ 127 (256 가지의 수를 표현가능)
		byte b;
		
		b=127;
		System.out.println(b);
		
	//	b=127 에 1 이 더해서져 overflow 가 되어서		-128이 된다
		b++;
		System.out.println(b);
		
		b=0;
		b--;
		
		//b=-128 // underflow
		b--;
		
	}

}

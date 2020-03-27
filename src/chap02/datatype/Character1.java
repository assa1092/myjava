package chap02.datatype;

public class Character1 {
	public static void main(String[] args) {
		//2 byte 크기
		// 문자이므로 굳이 숫자로 표현 하자면  0~65535
		char c;
		c= 'A'; // 65
		System.out.println(c);
		
		c='\u0041';
		System.out.println(c);
		
		c= '\uAC00'; //대소문자 구분 x
		System.out.println(c);
		
		c= '\uac01';
		System.out.println(c);
		
		int i = c;
		System.out.println(i);
	}

}

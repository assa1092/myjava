package chap05.reftype;

public class CompareType {
	public static void main(String[] args) {
		
		// 그림 03. 참조타입 비교
		
		String s1 = new String("web");
		String s2 = new String("java");
		String s3 = new String("java");
		
		boolean b1 = s1 == s2;
		System.out.println(b1);
		
		b1 = s2 == s3;
		System.out.println(b1);
		
		//s3의  주소값을 가져온다. 
		s2 = s3;
		b1 =  s2==s3;
		System.out.println(b1);
		
		
	}

}

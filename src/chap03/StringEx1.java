package chap03;

public class StringEx1 {
	public static void main(String[] args) {
		// charAt(int index)
		String s1 = "samsung";
		String s2 = "apple";
		
		char c=s1.charAt(0);
		System.out.println(c);
		System.out.println(s1.charAt(0));
		//samsung 의 첫번째 문자 s를 불러온다
		
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(3));
		System.out.println(s1.charAt(4));
		System.out.println(s1.charAt(5));
		System.out.println(s1.charAt(6));
//		System.out.println(s1.charAt(7));
		System.out.println("출력해 주세요");
		System.out.println(s2.charAt(0));
		System.out.println(s2.charAt(4));
		
		
		
		////////            length()
		
		System.out.println("길이");
		int s1Length = s1.length();
		int s2Length = s2.length();
		System.out.println(s1Length);
		System.out.println(s2Length);
		
		
		///// 		substring(int begin, int end) 시작점은 0
		String sub1=s1.substring(1, 3);
		System.out.println(sub1);
		
		String s3 = "sdlkjk4h643hlkj54"; // 끝에서 2글자만 보이게
		//System.out.println((s3.length()-2));	//	끝에서 2번째 글자만 보이게
		int s3Length =  s3.length();
		System.out.println(s3.substring(2,9));
		//0부터 시작...3번째 글자부터 9번째 글자까지보이게...
		
		String sub3 =  s3.substring(s3Length-8, s3Length);
		// 끝에서 -n번째부터 끝까지 보이게...
		System.out.println(sub3);
		
		
		
		
		
		//substring(int begin)
		// 끝에서 2번째꺼부터 보이게
		sub3 = s3.substring(s3Length-2);
		System.out.println(sub3);
		
		
		
		
		
		
	}

}

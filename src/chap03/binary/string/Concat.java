package chap03.binary.string;

public class Concat {
	public static void main(String[] args) {
		// 연결연산자 +
		String s = "자바다";
		String t = "이것이";
		
		String u =s + t;
		System.out.println(u);
		
		u = s + 3.14;
		System.out.println(u);
		
		u=  3 + 3.14 +s;
		System.out.println(u);
		
		u =  3 + s + 3.14;
		System.out.println(u);
		
		
		
	}

}

package chap05.reftype;

public class NullValue {
	public static void main(String[] args) {
		// 그림:04. 널값
		String s1;
		s1=null;
		
		
		String s2="java";
		s2 =  null;
		
		System.out.println(s2 ==null);
		System.out.println(s2!=null);
		if(s2 !=null) {
			System.out.println(s2.length());
		}
		if (s1!=null) {
			System.out.println(s1.length());			
		}
	}

}

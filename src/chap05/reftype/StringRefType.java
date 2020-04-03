package chap05.reftype;

public class StringRefType {
	public static void main(String[] args) {
		// 그림:05. String
		
		String a = new String("java");
		String b =new String("java");
		
		// 객체의 값은 같으나 주소가 다르기때문에 false
		System.out.println(a==b);		// false
		
		// a.equals(b) 
		// a 와 b 객체의 값을 비교하므로  true
		System.out.println(a.equals(b));	//true
		
		String c="java";
		
		System.out.println(a==c);		//false
		System.out.println(b==c);		//false
		System.out.println(a.equals(c));	//true
		System.out.println(b.equals(c));	//true
		
		
		// new 연산자를 쓰지않으면 기본타입처럼 된다.
		// new 연산자를 쓰면 객체가 생성되고
		String d = "java";
		System.out.println(c==d);
		System.out.println(c.equals(d));
	}

}

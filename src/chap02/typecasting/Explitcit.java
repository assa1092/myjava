package chap02.typecasting;

public class Explitcit {
	public static void main(String[] args) {
		//byte→ short→ int→ long→ float→ double
		//       char↗
		
		int i = 103029770;
		byte b = (byte) i;
		System.out.println(i);
		System.out.println(b);
	}

}

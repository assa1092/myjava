package chap03.examples;

public class StringEqualsExample {
	public static void main(String[] args) {
		
		//참조 타입의 == 차이
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2)); // strVar1 과 strVar2 의 내용값이 같으면 true
		System.out.println(strVar1.equals(strVar3)); // strVar1 과 strVar3 의 내용값이 같으면 true
	}

}

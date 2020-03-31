package chap03.examples;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode= '8';
		// 연산자가 하나면 앞에꺼가 거짓이어두 뒤에것 실행하고 
		// 연산자가 두개면 앞에껏이 거짓이면 뒤에것 은 실행 하지 않는다.
		
		
		if( (charCode>=65) & (charCode<=90)) {
			System.out.println("대문자 이군요");
			
		}
		if( (charCode>=97) &&(charCode<=122)) {
			System.out.println("소문자 이군요");
			
		}
		if( !(charCode<48) && !(charCode>57)) {
			System.out.println("0~9숫자 이군요");
			
		}
		
		int value = 6;
		if((value%2==0) | (value%3==0)) {
			System.out.println("2또는 3의 배수 이군요");
		}
		if((value%2==0) || (value%3==0)) {
			System.out.println("2또는 3의 배수 이군요");
		}
	}

}

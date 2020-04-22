package chap10.lecture.tryCatch;

public class NumberFormatExceptionSample {
	public static void main(String[] args) {
		String a = "a100";
		try {
			int b = Integer.parseInt(a);
			System.out.println(b+1000);
		} catch(NumberFormatException e) {		// NumberFormatException 발생하면 실행
			System.out.println("예외 발생");
		}
		
		System.out.println("프로그램 실행 계속");
		
	}

}

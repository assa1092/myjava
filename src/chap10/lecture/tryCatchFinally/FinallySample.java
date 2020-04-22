package chap10.lecture.tryCatchFinally;

public class FinallySample {
	public static void main(String[] args) {
		
		try {
			String a = "a100";
			int b = Integer.parseInt(a);
			
			System.out.println(b + 1000);
			
		} catch(NumberFormatException e) {
			System.out.println("변환할 수 없는 수입니다.");
		} finally {
			System.out.println("무조건 실행해야하는 코드");
			
		}
		
		System.out.println("프로그램 종료");
	}

}

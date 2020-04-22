package chap10.lecture.tryCatch;

public class ClassNotFoundExceptionSample {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.SString");
			System.out.println("프로그램 실행중");
			
		}catch(ClassNotFoundException e) {
			System.out.println("클래스를 찾지 못함");
		}
		
		System.out.println("프로그램 종료");
	}

}

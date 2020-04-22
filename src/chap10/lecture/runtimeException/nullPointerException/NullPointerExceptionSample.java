package chap10.lecture.runtimeException.nullPointerException;

public class NullPointerExceptionSample {
	public static void main(String[] args) {
		System.out.println("프로그램 실행중1");
		
		String s = null;
		if(s!=null) {
			System.out.println(s.substring(3));
		}
		
		System.out.println("프로그램 실행중2");
	}

}

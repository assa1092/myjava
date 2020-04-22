package chap10.lecture.multipleCatch;

public class SuperExceptionSample {
	public static void main(String[] args) {
		try {
//			String a = "a100";
//			int b =  Integer.parseInt(a);
			
			String[] arr = {"100", "10"};
			int sum = 0;
			for(int i=0; i<=arr.length;i++) {
				sum += Integer.parseInt(arr[i]);
			}
			System.out.println(sum);
		}catch(Exception e) {
			System.out.println("오류 발생");
		}
		
		System.out.println("프로그램 종료");
	}

}

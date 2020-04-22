package chap10.lecture.multipleCatch;

public class OrderSample {
	public static void main(String[] args) {
		try {
			String[] arr = {"3", "a"};
			int sum=0;
			for(int i = 0; i <=arr.length; i++) {
				sum +=Integer.parseInt(arr[i]);
			}
			System.out.println(sum);
		} catch(NumberFormatException e ) {
			System.out.println("숫자 형식이 맞지 않음");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 참조 오류");
		}
		
		System.out.println("종료...");
	}

}

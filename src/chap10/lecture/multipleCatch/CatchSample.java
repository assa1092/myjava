package chap10.lecture.multipleCatch;

public class CatchSample {
	public static void main(String[] args) {
		String[] strs = {"100", "20", "3", "1"};
		
		int sum=0;
		
		try {
			for(int i=0; i<=strs.length;i++) {
				sum += Integer.parseInt(strs[i]);
			}
			
			System.out.println(sum);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 참조 오류");
		}catch(NumberFormatException e) {
			System.out.println("넘버 포맷 오류");
		}
	}

}

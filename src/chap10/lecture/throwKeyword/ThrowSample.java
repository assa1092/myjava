package chap10.lecture.throwKeyword;

public class ThrowSample {
	public static void main(String[] args) throws Exception {

		if(args.length<1) {
			
			throw new Exception("배열의 길이가 부족합니다.");
		}
			

	}

}

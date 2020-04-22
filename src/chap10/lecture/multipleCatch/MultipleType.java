package chap10.lecture.multipleCatch;

public class MultipleType {
	public static void main(String[] args) {
		try {
			System.out.println("");
		} catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("오류 발생");
		}
	}

}

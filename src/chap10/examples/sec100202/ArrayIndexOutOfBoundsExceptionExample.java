package chap10.examples.sec100202;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		
		if(args.length>=2) {
			
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0]:" + args[0]);
			System.out.println("args[1]:" + args[1]);
		} else {
			System.out.println("두 개의 값을 넣어주세요.");
		}
		
	}

}

package chap04.whileloop;

public class DoWhileLoop {
	public static void main(String[] args) {
		int i = 0;
		
		while(i !=0) {
			System.out.println("while 반복");
		}
		
		
		//do while 반복문은 일단은 한번은 실행
		//true, false 상관없이
		do {
			System.out.println("do while 반복");
		}while (i!=0);
		
		System.out.println("종료");
	}

}

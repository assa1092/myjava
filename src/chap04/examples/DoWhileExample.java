package chap04.examples;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		
		
		// do while문은 조건에 상관없이 무조건 한번은 실행....
		do {
			System.out.print(">");

			//키보드로부터 입력받는다...
			inputString = scanner.nextLine();
			System.out.println((inputString));
		}while(! inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
	}

}

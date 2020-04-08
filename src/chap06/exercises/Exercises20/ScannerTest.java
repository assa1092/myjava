package chap06.exercises.Exercises20;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자>");
		int i = scanner.nextInt();
		System.out.println("받은수 : "+ i);
		
		scanner.nextLine();
		
		
		System.out.print("문자열>");
		String s = scanner.nextLine();
		System.out.println("받은 문자열:"+s);
	}

}

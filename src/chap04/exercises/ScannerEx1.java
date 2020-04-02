package chap04.exercises;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("입력 > ");
		
		//입력 받을 준비상태...
		String n = scanner.nextLine();
		
		System.out.println("입력값 : " + n);
		
		// n 으로 입력받은 값을 정수값으로 받는다. 
		int i = Integer.parseInt(n);
		
		//n 으로 입력받은 값을 실수값으로 받는다.
		double d=Double.parseDouble(n);
		
		System.out.println("정수값: " +i);
		System.out.println("실수값: "+d);
		
		
	}

}

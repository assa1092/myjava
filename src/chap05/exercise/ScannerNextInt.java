package chap05.exercise;

import java.util.Scanner;

public class ScannerNextInt {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("입력 : ");
		int i =scanner.nextInt();
		
		System.out.println(i*i);
	}

}

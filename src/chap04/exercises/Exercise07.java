package chap04.exercises;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run= true;
	
		int balance = 0;
		Scanner scanner =  new Scanner(System.in);
	
		
		
		while(run) {
			System.out.println("-----------------------------------");
			System.out.println("1. 예금  | 2.출금  | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------");
			System.out.print(" 선택> :");
		
			
			String n = scanner.nextLine(); 
			int i = Integer.parseInt(n);
			
			
			
			switch (i) {			
	
			case 1:
				System.out.println("예금액>");
				String moneyStr =scanner.nextLine(); 
				int money = Integer.parseInt(moneyStr);
				balance+=money;
				break;
			case 2:
				System.out.println("출금액>");
				String moneyStr2 =scanner.nextLine(); 
				int money2 = Integer.parseInt(moneyStr2);
				balance-=money2;
				break;
			case 3:
				System.out.println("잔고>"+ balance);
				break;
			case 4:
				run = false;
				
				break;
		
			}
}
		
		System.out.println("프로그램 종료");
	}

}

package chap06.exercises.Ex20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int size =0;
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 |5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택 >");
			
			int selectNo = scanner.nextInt();	//문제발생 : 개행문자(엔터)가  str에 저장됨
			
			scanner.nextLine();					//개행문자(엔터)를 제거하기위해 추가
			
			if(selectNo==1) {
				createAccount();
			}else if(selectNo ==2) {
				accountList();
			}else if (selectNo==3) {
				deposit();
			}else if(selectNo==4) {
				withdraw();
			}else if(selectNo==5) {
				run =false;
				
			}
			
			
			
		}
		System.out.println("프로그램 종료");
	}

	private static void withdraw() {
		System.out.println("-----------");
		System.out.println("출금");
		System.out.println("-----------");
		System.out.print("계좌번호:");
		String ano = scanner.nextLine();
		Account account = findAccount(ano);
		System.out.println("출금액:");
		int money = scanner.nextInt();		//문제발생 : 개행문자(엔터)가  str에 저장됨
		scanner.nextLine();						//개행문자(엔터)를 제거하기위해 추가
		account.setBalance(account.getBalance()-money);
		System.out.println("결과:출금이 성공되었습니다.");
		
		
	}

	private static void deposit() {
		System.out.println("-----------");
		System.out.println("예금");
		System.out.println("-----------");
		System.out.print("계좌번호:");
		String ano = scanner.nextLine();
		Account account = findAccount(ano);
		System.out.println("예금액:");
		int money = scanner.nextInt();		//문제발생 : 개행문자(엔터)가  str에 저장됨
		scanner.nextLine();						//개행문자(엔터)를 제거하기위해 추가
		account.setBalance(account.getBalance()+money);
		System.out.println("결과:예금이 성공되었습니다.");
		
		
	}

	private static Account findAccount(String ano) {
		for(int i=0; i<size; i++) {
			accountArray[i].getAno().equals(ano);
			return accountArray[i];
			
		}
		return null;
	}

	private static void accountList() {
		System.out.println("-----------");
		System.out.println("계좌목록");
		System.out.println("-----------");
		for (int i=0;i<size;i++) {
			System.out.println(accountArray[i].getAno()+ "\t" +
								accountArray[i].getOwner() + "\t" +
								accountArray[i].getBalance());
		}
		
	}

	private static void createAccount() {
		System.out.println("-----------");
		System.out.println("계좌생성");
		System.out.println("-----------");
		System.out.print("계좌번호:");
		String ano = scanner.nextLine();
		System.out.print("계좌주:");
		String owner = scanner.nextLine();
		System.out.print("초기입금액:");
		int balance = scanner.nextInt();		//문제발생 : 개행문자(엔터)가  str에 저장됨
		scanner.nextLine();						//개행문자(엔터)를 제거하기위해 추가
		
		Account account = new Account(ano, owner, balance);
		
		accountArray[size] = account;
		
		size++;
		System.out.println("결과:계좌가 생성되었습니다.");
		
	}

}

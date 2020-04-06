package chap06.examples.sec060802;

import java.util.Scanner;

public class CarExample {
	
	public static void main(String[] args) {
		
		System.out.print("gas 량을 입력하세요  :  ");
		Car myCar =  new Car();
		Scanner scanner =  new Scanner(System.in);
		int selectNo =  scanner.nextInt();
		
		myCar.setGas(selectNo);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다");
			
		} else {
			System.out.println("gas를 주입하세요");
		}
	}

}

package chap06.examples.sec060802;

import java.util.Scanner;

public class CarExample {
	
	public static void main(String[] args) {
		
		System.out.print("gas 량을 입력하세요  :  ");
		Car myCar =  new Car();
		Scanner scanner =  new Scanner(System.in);
		int selectNo =  scanner.nextInt();
		
		// Car의 setGas() 메소드 호출
		myCar.setGas(selectNo);		
		
		boolean gasState = myCar.isLeftGas();	//Car의 isLeftGas() 메소드 호출
		if(gasState) {
			System.out.println("출발합니다");
			myCar.run();	// Car의 run() 메소드 호출
		}
		
		if(myCar.isLeftGas()) {	// Car의 isLeftGas() 메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다");
			
		} else {
			System.out.println("gas를 주입하세요");
		}
	}

}

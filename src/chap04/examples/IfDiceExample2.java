package chap04.examples;

public class IfDiceExample2 {
	public static void main(String[] args) {
		int num1 = (int)(Math.random()*6+1);
		int num2 = (int)(Math.random()*6+1);
		
		System.out.println( num1 + " ," + num2);
		if (num1==num2) {
			
			
			System.out.println("당첨되었습니다");
		} else {
			
			
			System.out.println("당첨되지 않았습니다.");
		}
	}

}

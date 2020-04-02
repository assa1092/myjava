package chap04.forloop;

public class ForLoop {
	public static void main(String[] args) {
		int sum = 0;
		sum = sum +1;
		sum = sum +2;
		sum = sum +3;
		sum = sum +4;
		sum = sum +5;
		System.out.println("1~ 5까지의 합 "+ sum);
		
		sum=0;
		
		for (int i = 0; i <=5; i++) {
			sum = sum+i;
		}
		System.out.println("1~5까지의 합 : "+sum);
	}

}

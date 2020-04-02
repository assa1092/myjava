package chap04.examples;

public class ForSumFrom1To100Example3 {
	public static void main(String[] args) {
		int sum=0;
		int i = 0;
		
		// i 를 다른 곳에서도 쓰기위해 for문 밖에 선언
		for(i=1; i<=100; i++) {
			sum +=i;
		}
		
		System.out.println("1~" + (i-1) + "합 : " + sum);
	}

}

package chap03.arithmetic;

public class Overflow {
	public static void main(String[] args) {
		int i1 = 20_0000_0000;
		int i2 = 10_0000_0000;
		
		int avg =  (i1 + i2) / 2;		//(i1 + i2) 더해지는 순간 int 범위를 넘어섰다.
		System.out.println(Integer.MAX_VALUE);
		System.out.println(avg);
		
		long l1 = 20_0000_0000;
		long l2 = 10_0000_0000;
		
		long avg2 = (l1 + l2)/ 2;
		System.out.println(avg2);
	}

}

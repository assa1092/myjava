package chap03.examples;

public class InfinityAndNanCheckExample {
	public static void main(String[] args) {
		int x=5;
		double y = 0.0;
		
//		double z = x/y;
		double z = x % y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		System.out.println(z+2);
		
		if(Double.isInfinite(z) || Double.isNaN(z) ) {
			System.out.println("값 산출 불가");
		}else {
			System.out.println(z+2);
		}
	}

}

package chap04.ifelse;

public class Random {
	public static void main(String[] args) {
		double r= Math.random(); // 0 ~ 1 사이값을 랜덤하게 호출
		System.out.println(r);
		
		//0 ~ 9
		r *= 10;
		System.out.println(r);
		
		int i =  (int) r;
		System.out.println(i);
		
		// 1 ~ 10
		i +=1;
		System.out.println(i);
		
	}

}

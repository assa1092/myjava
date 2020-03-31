package chap03.arithmetic;

public class InfinityNan {
	public static void main(String[] args) {
		int i =10;
		int j =0;		
//		int r = i / j;		//0 정수로 나누면 에러
		
		double d = 10;
		double e = 0.0;
		double f = d/e;
		
		//Infinity 무한대
		System.out.println(f);
		
		f =  d / - 0.0;
		System.out.println(f);
		
		f =  f +1;
		System.out.println(f);
		f=f-1;
		System.out.println(f);
		
		f = d % 0.0;
		System.out.println(f);		
		//NOt a Number
		f =  f +1;
		System.out.println(f);
		f= f/f;
		System.out.println(f);
		
		f= d/ 0.0;
		boolean isInf = Double.isInfinite(f);
		System.out.println(isInf);
		
		f = d % 0.0;
		boolean isNan =  Double.isNaN(f);
		System.out.println(isNan);
	}

}

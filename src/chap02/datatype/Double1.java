package chap02.datatype;

public class Double1 {
	public static void main(String[] args) {
		//8 byte 크기
		//부동소소점(floating point) (ieee 754)
		
		
		// 최대값 (1.7976931348623157E308) == (1.79 * 10^308)
		System.out.println(Double.MAX_VALUE);
		
		//최소값 (4.9E-324) == (4.9 * 10^-324)
		System.out.println(Double.MIN_VALUE);
		
		double d = 3.14;
		d = 3.14E-2;    //0.0314
		System.out.println(d);
	}

}

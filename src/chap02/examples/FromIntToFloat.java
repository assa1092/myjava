package chap02.examples;

public class FromIntToFloat {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3= num2;
		num2 = (int)num3;
		
		// 강제 형 변화시 값이 손실이 생길수 있다...
		
		// float 가수(23비트)(8비트)
		// double 가수(52비트)(11비트)
		// int  (32비트)
		
		
		int result =  num1 -  num2;
		System.out.println(result);
				
	}

}

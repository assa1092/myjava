package chap03.examples;

public class CompareOperatorExample2 {
	public static void main(String[] args) {
		int v2 =1;
		double v3 = 1.0;
		System.out.println(v2 == v3); //true
		
		double v4 = 0.1;
		float v5 = 0.1F;
		System.out.println(v4 == v5); //false 타입 변환되면서 값의 차이가 생김
		System.out.println((float)v4 == v5); //true
		System.out.println((int)(v4*10) == (int)(v5*10)); //true 연산후 정수로 변환하고나서 비교
	}

}

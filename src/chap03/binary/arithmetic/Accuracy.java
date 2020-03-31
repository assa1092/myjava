package chap03.binary.arithmetic;

public class Accuracy {
	public static void main(String[] args) {
		double d1 = 0.1;
		double d2 = 0.2;
		double d3 = d1 + d2;
		
		System.out.println(d3);
		
		double d4 = d1 *10;
		double d5 =  d2 *10;
		double d6 = (d4 + d5) /10;
		
		System.out.println(d6);
	}

}

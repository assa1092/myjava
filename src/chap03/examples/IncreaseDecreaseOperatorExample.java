package chap03.examples;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("----------------1");
		x++;		//연산 후에 먼저 1증가
		++x;		//연산 전에 먼저 1증가
		System.out.println("x = " + x);
		
		System.out.println("----------------2");
		y--;
		--y;
		System.out.println("y = " + y);
		
		System.out.println("----------------3");
		z = x++;
		System.out.println( "z =  "+ z);
		System.out.println("x = "+ x);
		
		System.out.println("----------------4");
		z= ++x;
		System.out.println("z= " +z);
		System.out.println("x= " +x);
		
		System.out.println("----------------5");
		System.out.println("연산전 z= " + z);
		System.out.println("연산전 x= " +x);
		System.out.println("연산전 y= " +y);
		z= ++x + y++;
		System.out.println("----------------6");
		System.out.println("연산후= " + z);
		System.out.println("연산후x= " +x);
		System.out.println("연산후y= " +y);
		
		
	}

}

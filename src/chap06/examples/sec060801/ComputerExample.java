package chap06.examples.sec060801;

public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int [] values =  {1, 2, 3};
		int result1 =  myCom.sum1(values);
		System.out.println("result1 : " + result1);
		
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
//		myCom.sum1(1, 2, 3, 4);  //sum1은 매개변수가 배열이기 때문에  배열이 아니면 Error
		System.out.println("result2 : " + result2);
		
		int result3 = myCom.sum2(1, 2, 3);
		System.out.println("result3 : " + result3);
		
		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4 : " + result4);
		// int...n 으로 썼기 때문에 배열로 값을 보내도 된다.
		myCom.sum2(new int[] {1, 2, 3, 4});
	}

}

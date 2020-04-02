package chap05.example;

public class ArrayCreateByNewExample {
	public static void main(String[] args) {
		
		// int 배열 3칸짜리 생성
		int[] arr1 =  new int[3];
		
		for (int i=0; i<3; i++) {
			System.out.println("arr1["+ i + "] :" + arr1[i]);
		}
		System.out.println();
		arr1[0]=10;
		arr1[1]=20;
		arr1[2]=30;
		
		for(int i=0; i<3; i++) {
			System.out.println("arr1["+ i + "]:" + arr1[i]);
		}
		System.out.println();
		
		//double배열 3칸짜리 생성
		double[] arr2 =  new double[3];
		//double은 기본 타입이라 0이 기본값으로 들어간다 더블타입인 0.0으로
		
		for(int i=0; i<3; i++) {
			System.out.println("arr2["+ i+ "]:"+ arr2[i]);
		}
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		System.out.println();
		for(int i=0; i<3;i++) {
			System.out.println("arr2["+i+"]: " + arr2[i]);
		}
		
		System.out.println();
		
		// String배열 3칸짜리 생성
		String[] arr3 =  new String[3];
		
		// String이 참조변수라 기본값이 null 로 들어감.
		for (int i =0; i<3; i++) {
			System.out.println("arr3["+ i+ "]: "+ arr3[i]);
		}
		arr3[0]= "1월";
		arr3[1]= "2월";
		arr3[2]= "3월";
		System.out.println();
		for (int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "]: " + arr3[i]);
		}
	}

}

package chap05.array;

public class Array {
	public static void main(String[] args) {
		int age1;
		int age2;
		int age3;
		;;;
		
		int age100;
		
		// 배열 
		int[] ageArray;
		int ageArray5[];	// 가능하면 타입옆에다가 배열 표시하는게 보기 편하다
		
		//new 연산자는 새로운 참조타입의 변수를 만든다
		ageArray=  new int[100]; // 100개짜리 배열 준비...
		
		age1=10;
		System.out.println(age1);
		
		// 배열의 초기값.   교재 156 page
		System.out.println(ageArray[56]);
		
		// 배열의 초기값 할당
		int[] ageArray2;
		ageArray2 =  new int[] {3,4,1,0,-1,5,22};
		System.out.println(ageArray2[0]);
		System.out.println(ageArray2[6]);
		
		// 배열의 선언과 동시에 할당할수 있다.
		int[] ageArray3= {9, 10, 11, -9, 33};
		System.out.println(ageArray3[0]);
		System.out.println(ageArray3[4]);
		
		
		//배열의 인덱스는 0~  (길이-1)
		
		//배열의 길이
		System.out.println(ageArray.length);
		System.out.println(ageArray2.length);
		System.out.println(ageArray3.length);
		
		//ArrayIndexOutofBoundException
//		System.out.println(ageArray[100]);
		
		// 배열과 for문
		for (int i=0;i<ageArray3.length;i++) {
			System.out.println(ageArray3[i]);
		}
		
		//배열의 값 변경
		ageArray3[3]= 99999;
		System.out.println(ageArray3[3]);
		
		System.out.println();

		// 향상된 for 문
		// 오른쪽의 값을 왼쪽으로 받는다.
		for(int value :ageArray3 ) {
			System.out.println(value);
			
		}
		
		
		
		
	}

}

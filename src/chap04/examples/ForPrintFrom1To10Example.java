package chap04.examples;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		for (int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		//무한루프 발생시 
		//Console 창 옆에 빨간 버튼 Terminate 누르면 정지...
		for (int i=10;i>=1;i--) {
			System.out.println(i);
		}
		
		int i =10;
		for ( ;i>=1;) {
			System.out.println(i);
			
			i--;
		}
		
		for (int j=0, k=10; j<10&&k>0; j++, k--) {
			System.out.println(j + "," + k);
		}
		
		//for 안쪽에 선언된 변수는 for문 밖에서는 쓸수없다..
//		System.out.println(j);
//		System.out.println(k);
	}

}

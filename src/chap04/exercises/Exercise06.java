package chap04.exercises;

public class Exercise06 {
	public static void main(String[] args) {
		
//		String str = "";
//		for(int i=0; i <5; i++) {
//			str +="*"; 
//			System.out.println(str);
//			
//			for(int j=0; j<i-1; j++) {
//			//	System.out.println();
//			}
//		}
		
		
		
		
		
		
		
		
		
		//트리
		for(int i=0;i<5;i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 반대로
		for(int i=0;i<5;i++) {
			for(int j=0; j<=4-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

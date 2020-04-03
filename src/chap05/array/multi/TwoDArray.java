package chap05.array.multi;

public class TwoDArray {
	public static void main(String[] args) {
		//그림:06. 2차원 배열
		
	int[] a1 = {1,2,3};
	int[] a2 = {4,5,6};
	

	
	// int[]배열type의  배열을  생성
	//a3는 {1,2}객체의 주소값과
	// 	   {3,4}객체의 주소값을 가진다.
	
	int[][] a3= { {1,2} ,{3,4} };
	
	System.out.println(a1[2]);
	System.out.println(a3[0][1]);
	System.out.println(a3[1][1]);

	
	//공간만 마련
	int[] a4 =  new int[3];
	int[][] a5 = new int[3][4];
	// {{0,0,0,0},{0,0,0,0},{0,0,0,0}}
	
	a5[2][3]= 99;
	for(int i =0; i <a5.length;i++) {
		for(int j=0;j<a5[i].length;j++) {
			System.out.println(i + " ,"+ j +" : " + a5[i][j]);
		}
	}
	
	int[][] a6 =  new int[2][];
	//{null, null}
	System.out.println(a6[0]);
	System.out.println(a6[1]);
//	System.out.println(a6[2]);
	
	a6[0]=  new int[] {3, 4, 5, 6};
	a6[1] =  new int[] {99, 100, 101, 102};
	
	for(int i =0; i <a6.length;i++) {
		for(int j=0;j<a6[i].length;j++) {
			System.out.println("["+ i + " ,"+ j +"]"+" : " + a6[i][j]);
		}
	}
	
	
	
	}
}

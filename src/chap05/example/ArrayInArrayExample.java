package chap05.example;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		//다차원 배열 생성 방법
		
		
		int[][] mathScores =  new int[2][3];
		for(int i =0 ; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("mathScores[" + i + "][" + k +"]=" + mathScores[i][k] );
			}
		}
		System.out.println();
		//2개의 원소가 있는 배열준비
		int[][] englishScores =  new int[2][];
		englishScores[0] =  new int[2];
		englishScores[1] = new int[3];
		
		for(int i =0 ; i<englishScores.length; i++) {
			for(int k=0; k<englishScores[i].length; k++) {
				System.out.println("englishScores[" + i + "][" + k +"]=" + englishScores[i][k] );
			}
		}
		System.out.println();
		
		int[][] javaScores = {{95, 80}, {92, 96, 80}};
		
		for(int i =0 ; i<javaScores.length; i++) {
			for(int k=0; k<javaScores[i].length; k++) {
				System.out.println("javaScores[" + i + "][" + k +"]=" + javaScores[i][k] );
			}
		}
		
		
	}

}

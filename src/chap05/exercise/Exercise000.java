package chap05.exercise;

import java.util.Scanner;

public class Exercise000 {
	public static void main(String[] args) {
		boolean run =  true;
		int studentNum = 0;
		int[] scores = null;
				
		Scanner scanner =  new Scanner(System.in);
		
		
		while(run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수 입력 | 3. 점수리스트 | 4.분 석 |5. 종 료");
			System.out.println("--------------------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo= scanner.nextInt();
			if(selectNo==1) {
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				
				
			} else if(selectNo==2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i +"]>");
					scores[i]= scanner.nextInt();
				}
				
			}else if(selectNo==3) {
				for(int i =0; i<scores.length;i++) {

					System.out.println("scores[" + i +"]>"+scores[i]);
				}
				
			}else if(selectNo==4) {
				double avg = 0;
				int sum = 0;
				int max=0;
				
				for(int i=0; i<scores.length;i++) {
					sum +=scores[i];
				}
				avg= (double)sum / scores.length;
				
				
				// 각  항목의 점수를 비교해서 최고점수를 max값으로
				for (int v : scores) {
					max = max < v ? v : max;
					sum += v;
				}
				
				System.out.println("최고 점수 : " +max);
				System.out.println("평균 점수 : " +avg);
				
			}else if(selectNo==5) {
				run = false;
			}
			
		}
		
		System.out.println("프로그램 종료");
	}

}

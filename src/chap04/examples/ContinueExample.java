package chap04.examples;

public class ContinueExample {
	public static void main(String[] args) {
		for (int i=0; i<=10; i++) {
			
			if(i%2 !=0) {
				// 홀수면 출력하지말고 다음꺼 진행...
				// 짝수면 출력...
				continue;
			// continue 를 만나면 그 이후에 문장을 실행하지 않고
			// 다음 반복으로 넘어간다..
			// break 를 만나면 바로 반복문 스톱...
			}
			System.out.println(i);
		}
	}

}

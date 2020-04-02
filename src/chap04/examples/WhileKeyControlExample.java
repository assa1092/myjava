package chap04.examples;

public class WhileKeyControlExample {
	public static void main(String[] args) throws Exception {
		boolean run =  true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			
			//Enter 키가 입력되면 캐리지리턴(13)과 라인피드(10)이 입력되므로 이값을 제외시킴...
			// Enter키가 누르면 
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("-----------------------------");
				System.out.println("1. 증속 |  2. 감속  | 3. 중지");
				System.out.println("-----------------------------");
				System.out.print(" 선택  :");
				// System.out.print 출력만하고 줄바꿈하지 않는다 
			}
			
			// 키보드로 입력을 받는다. 키 코드를 읽음..
			keyCode =  System.in.read();
			
			if (keyCode ==49) { // 1 을 읽었을 경우 
				speed++;
				System.out.println("현재 속도 = " + speed);
			} else if (keyCode ==50) {	// 2 를 읽었을 경우
				speed--;
				System.out.println("현재 속도 = " + speed);
			} else if(keyCode ==51) {	// 3 을 읽었을경우...
				run= false;
			}
		}
		
		System.out.println("프로그램 종료");
	}

}

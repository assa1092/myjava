package chap08.exercises.Ex05;

public class ActionExample {
	
	public static void main(String[] args) {
		
		// 보통 클래스객체를 만들고 그 객체에서 접근을 하지만
		
		// 일회용으로 한번만 실행할 시에는  익명구현 객체를 만든다.
		Action action = new Action(){
			@Override
			public void work() {
				System.out.println("복사를  합니다..");				
			}
		};		
		action.work();
	}

}

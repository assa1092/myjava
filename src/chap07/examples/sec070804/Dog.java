package chap07.examples.sec070804;

public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}
	
	@Override			// 추상 메소드 재정의
	public void sound() {
	System.out.println("멍 멍");
		
	}

}
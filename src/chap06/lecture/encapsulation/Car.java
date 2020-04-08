package chap06.lecture.encapsulation;

public class Car {
	// 캡슐화... 필요한 것만 노출시키는 방법으로 메서드를 만들어서 노출
	private int speed;
	private String airbag;
	
	public Car() {
		this.airbag="전면";
	}
	public String getAirbag() {
		return this.airbag;
	}
	
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed=0;
		}else {
			this.speed= speed;
		}
		
	}
	public int getSpeed() {
		return this.speed;
	}
	

}

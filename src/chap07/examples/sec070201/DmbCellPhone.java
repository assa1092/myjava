package chap07.examples.sec070201;

public class DmbCellPhone extends CellPhone{		// CellPhone 클래스를 상속 받는다 (extends)
	// field
	int channel;
	
	// constructor
	DmbCellPhone(String model, String color, int channel){
		
		this.model = model;			// CellPhone 으로부터 상속받은 필드 model, color
		this.color = color;			// CellPhone 으로부터 상속받은 필드 model, color
		
		this.channel = channel;
	}
	
	// method
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널"+ channel + "번으로 바꿉니다.");
		
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}

}

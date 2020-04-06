package chap06.examples.sec060704;

public class Car {
	//필드
	
	// 생성자는 파라미터의 타입의 조합과 순서에 따라 다른 생성자로 나뉜다.
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자의 타입과 순서가 중요하다
	
	// 생성자 1
	Car(){
		System.out.println("에이라는 일을 한다");
		
	}
	// 생성자 2
	Car(String model){
		
			
		this.model =  model;
	}

	// 생성자의 파라미터가 같은 타입이 되버리면 
	// 어떤것으로 써야할지 모르기때문에 에러가 난다.
	
//	Car(String color){
//		
//	}
	
	
	// 생성자 3
	Car(String model, String color){
		this();		// 파라미터가 없는 생성자를 호출	
		System.out.println("에이라는 일을 한다");
		this.model = model;
		this.color = color;
	}
	// 생성자 4
	Car(String model, String color, int maxSpeed){
		this();
		System.out.println("에이라는 일을 한다");
		this.model = model;
		this.color = color;
		this.maxSpeed =  maxSpeed;
	}
	
	// 생성자 5 
	// 파라미터가 다르기 때문에 다른 생성자로 분류가 된다.
	Car(String model, int maxSpeed, String color){
		System.out.println("에이라는 일을 한다");
		
	}

}

package chap04.ifelse;

public class If {
	public static void main(String[] args) {
		// if 조건에 따라 실행할 블럭이 결정됨..
		int a = 2;
		if (a > 10) {
			System.out.println("실행할까? 말까?");
		}
		System.out.println("실행할까?2");
		
		
		// if else
		if (a>10) {
			System.out.println("조건이 true일때 실행");
		}else {
			System.out.println("조건이 false이때 실행");
		}
		
		//else if () :이전의 if 나 else if의 조건이 false일때
		//            현재 블럭의 조건을 확인하고 true이면 실행
		
		a=70;
		if(a>90) {
			System.out.println("90보다 큽니다");
		} else if(a>80) {
			System.out.println("80보다 큽니다.");
		} else if(a>70) {
			System.out.println("70보다 큽니다");
		} else {
			System.out.println("70미만 입니다.");
		}
		

	}

}

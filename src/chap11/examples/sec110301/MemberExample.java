package chap11.examples.sec110301;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		// 매개값이 Member 타입이고 id 필드값도 동일 하므로 true
		if(obj1.equals(obj2)) {
			System.out.println("obj1 과 obj2 는 동등합니다.");
		}else {
			System.out.println("obj1 과 obj2 는 동등하지 않습니다.");
		}
		
		
		// 매개값이 Member 타입이고 id 필드값이 다르므로 false
		if(obj1.equals(obj3)) {
			System.out.println("obj1 과 obj3 는 동등합니다.");
		}else {
			System.out.println("obj1 과 obj3 는 동등하지 않습니다.");
		}
	}

}

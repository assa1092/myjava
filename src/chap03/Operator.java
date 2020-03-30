package chap03;

public class Operator {
	public static void main(String[] args) {
		// 연산자의 종류
		//책 64페이지의 표 참고
		
		//단항연산자 : ++x
		//이항연산자 : x + y
		//삼항연산자 : (sum>90) ? "A" : "B"
		
		
		//연산의 결과 사용
		int result =  3+2;
		
		boolean r =  (2 + 7) <5;
		
		//연산의 방향과 우선순위
		//책 67페이지
		boolean e =  3 >0 && 2<0 ;
		System.out.println(e);
		
		
		int a =  100*2/3%5;
		System.out.println(a);
		
		int b, c;
		a=b=c=5;
		
		int re = (a + b)*c;
		
		
	}

}

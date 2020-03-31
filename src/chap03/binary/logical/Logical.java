package chap03.binary.logical;

public class Logical {
	public static void main(String[] args) {
		// AND	&&, &
		// true && true →true
		// true && false → false
		// false && true → false
		// false && false →false
		
		// true & true →true
		// true & false → false
		// false & true → false
		// false & false →false

		
		
		// OR	||, |
		// true || true →true
		// true || false → true
		// false || true → true
		// false || false →false
		
		// true | true →true
		// true | false → true
		// false | true → true
		// false | false →false
		
		/////////////////////////////////////////////////
		// XOR	^
		// true ^true → false
		// false ^true →true
		// true ^false→ true
		// false ^false→ false

		// NOT	!
		
///////////////////////////////////////////////////////
		int i = 0;
		int j = 3;
		if (i==0 && (j++)>0) {
			System.out.println("결과 True");
		}else {
			System.out.println("결과 False");
		}
		System.out.println("j: " +j);
		
		if (i!=0 && (j++)>0) {		//앞에껏이 거짓이면 뒤에껏 실행 하지 않음
			System.out.println("결과 True");
		}else {
			System.out.println("결과 False");
		}
		System.out.println("j: " +j);
		if (i==0 && (j++)>0) {
			System.out.println("결과 True");
		}else {
			System.out.println("결과 False");
		}
		System.out.println("j: " +j);
		
		if (i!=0 & (j++)>0) { //& 하나면 앞에껏이 거짓이어두 뒤에껏 실행
			System.out.println("결과 True");
		}else {
			System.out.println("결과 False");
		}
		System.out.println("j: " +j);
		
		
		
		i = 0;
		j =3;
		if(i!=0 &&(j/i)>0) {
			System.out.println("j를 i로 나눈 값은 양수");
		}
		
		String s =  null;
		if(s !=null && s.length()>0) {
			System.out.println("s는 빈 스트링이 아니다");
		}
		
		i = 0;
		j =3;
		if(i==0 || j >0) {
			System.out.println("값은 True");
		}
		else {
			System.out.println("값은 False");
		}
		System.out.println(j);
		
	}

}

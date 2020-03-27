package chap02.datatype;

public class Long1 {
	public static void main(String[] args) {
		// 8byte 크기
		//-9,223,372,036,854,775,808 ~ -9,223,372,036,854,775,807
		
		long l;
		l = 2147483647;
		l = 2147483648L; //integer 범위을 넘어설때는 선언을 해 줘야한다.
		l = 2147483648l; // L소문자도 되지만 숫자에 햇갈리기 때문에 대문자로
		l = 3000000000L; //o
		l = 3000000000l; // x
		System.out.println(l);
		
	}

}

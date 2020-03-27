package chap02.datatype;

public class Integer1 {
	
	public static void main(String[] args) {
		//4byte 크기
		// -2147483648 ~ 2147483647
		
		int i;
		i=2147483647;
		// i=2147483648;
		System.out.println(i);
		
		i++;
		System.out.println(i);
		
		//
		i = 2_147_483_647; // i = 2147483647;
		i=21_4748_3647;   // 쓰기 편하게 해놓은것 
		i=2_147_483647;   // 다 같은 수.
		
		System.out.println(i);
		
		i = 0765;
		System.out.println(i);
		
		i = 0xACCF;
		System.out.println(i);
	}
	
	

}

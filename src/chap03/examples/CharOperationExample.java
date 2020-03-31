package chap03.examples;

public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A'+1;
		char c2 = 'A';
//		char c3 =  c2 + 1;	//컴파일 에러 
//		char type과 int type 을 더하면 int 형으로 변형되서 char c3는 안됨 
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
//		System.out.println("c3 : " + c3); 
	}

}

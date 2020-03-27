package chap02.datatype;

public class Float1 {
	public static void main(String[] args) {
		//4byte 크기
		
		//최대값
		System.out.println(Float.MAX_VALUE);
		
		//최소값
		System.out.println(Float.MIN_VALUE);
		
		float f;
		f = 3.14F; //o  자바는 기본적으로 double로 인지하기 때문에 float로 변경
		f = 3.14f; //x
		System.out.println(f);
		
	}

}

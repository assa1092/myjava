package chap05.array;

public class CopyUtil {
	public static void main(String[] args) {
		int[] a = {9, 8, 7};
		int[] b = new int[5];
		//원본배열 ,  원본배열 시작위치,대상 배열  ,카피대상배열의 시작위치   ,  길이
		System.arraycopy(a, 0, b,0, a.length);
		
		for (int v : b) {
			System.out.println(v);
		}
	}

}

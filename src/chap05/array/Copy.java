package chap05.array;

public class Copy {
	public static void main(String[] args) {
		int[] a = {9, 8, 7, 6};
		int[] b= new int[10];
		
		
		b[0] =a[0];
		b[1]=a[1];
		b[2]=a[2];
		b[3]=a[3];
		
		for(int i=0; i<a.length; i++) {
			b[i]= a[i];
		}
		
		for(int v : b) {
			System.out.println(v);
		}
		
	}

}

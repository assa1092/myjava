package chap11.lecture.objectClass.equals;

class TV{
	int type;
	@Override
	public boolean equals(Object obj) {
		TV tv =  (TV) obj;
		return this.type == tv.type;
	}
}

public class EqualsSample {
	public static void main(String[] args) {
		TV tv1 =  new TV();
		TV tv2 =  new TV();
		
		tv1.type = 3;
		tv2.type = 3;
		
		
		System.out.println(tv1 == tv2);
		System.out.println(tv1.equals(tv2));
	}

}

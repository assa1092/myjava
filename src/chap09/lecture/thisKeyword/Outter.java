package chap09.lecture.thisKeyword;

public class Outter {
	int outterF;
	int sameF;
	
	class Nested{
		int nestedF;
		int sameF;
		
		void method() {
			System.out.println(this.nestedF);
			System.out.println(nestedF);
			System.out.println(outterF);
			
			System.out.println(this.sameF);		//	이름이 같으면 가장가까운 이름으로간다
			System.out.println(sameF);
			System.out.println(Outter.this.sameF);
		}
	}

}

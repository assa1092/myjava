package chap11.lecture.objectClass.clone;

class Book implements Cloneable{
	int isbn;
	String[] authors; 
	
	@Override
	public Object clone() throws CloneNotSupportedException {
//		Book n = new Book();
//		n.isbn = this.isbn;
//		n.authors = this.authors;
		return super.clone();
	}
	
}


public class CloneSample {
	public static void main(String[] args) throws Exception {
		
		// 그림 14. 객체 복사 참고...
		
		Book b1 =  new Book();
		b1.isbn =3;
		b1.authors = new String[] {"a", "b"};
		
		Object o = b1.clone();
		System.out.println(o instanceof Book);
		Book b2 = (Book) o;
		System.out.println(b2.isbn);
		System.out.println(b2.authors);
		
		System.out.println();
		System.out.println(b1.isbn);
		System.out.println(b1.authors);
		
		b1.authors[0] = "c";
		System.out.println(b2.authors[0]);
		
	}

}

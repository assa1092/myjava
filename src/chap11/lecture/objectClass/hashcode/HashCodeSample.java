package chap11.lecture.objectClass.hashcode;

class Book{
	int isbn;
	
	@Override
	public int hashCode() {
		return this.isbn;
	}
	
	@Override
	public boolean equals(Object obj) {
		Book o = (Book) obj;
		return this.isbn ==  o.isbn;
	}
	
}

public class HashCodeSample {
	public static void main(String[] args) {
		Book b1 =  new Book();
		Book b2 =  new Book();
		
		b1.isbn = 3;
		b2.isbn = 3;
		System.out.println(b1.equals(b2));
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
	}

}

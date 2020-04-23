package chap11.lecture.objectClass.toString;

class Book{
	int isbn;
	String title;
	
	Book(int isbn, String title){
		this.isbn = isbn;
		this.title = title;
	}
	@Override
	public String toString() {
		String info = "isbn:" + isbn + ", title: " + title;
		return info;
	}
	
	
}

public class ToStringSample {
	
	public static void main(String[] args) {
		 Book b1 = new Book(3, "이것이 자바다");
		 Book b2 = new Book(3, "저것이 파이썬다");
		 
		 System.out.println(b1.toString());
		 System.out.println(b2.toString());
		 
		 System.out.println(b1);
		 System.out.println(b2);
	}

}


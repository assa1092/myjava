package chap11.lecture.objectClass.deepCopy;

class Book implements Cloneable{
	int isbn;
	String[] authors;
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Book b =  new Book();
		b.isbn = this.isbn;
		String[] authors = new String[this.authors.length];
		for(int i=0; i< authors.length;i++) {
			authors[i]= this.authors[i];
		}
		
		b.authors = authors;
		return b;
	}
	
}


public class CloneSample {
	public static void main(String[] args) throws Exception {
		Book b1=  new Book();
		b1.isbn = 3;
		b1.authors = new String[] {"a", "b"};
		
		Object o = b1.clone();
		Book b2 = (Book) o;
		
		b1.authors[0] = "C";
		System.out.println(b2.authors[0]);
		
	}

}

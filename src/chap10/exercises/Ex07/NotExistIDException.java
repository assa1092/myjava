package chap10.exercises.Ex07;

public class NotExistIDException extends Exception {
	public NotExistIDException() {}
	public NotExistIDException(String message) {
		super(message);
	}
}

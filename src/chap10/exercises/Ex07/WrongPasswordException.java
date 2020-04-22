package chap10.exercises.Ex07;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {}
	public WrongPasswordException(String message) {
		super(message);
	}
}

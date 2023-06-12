package exception;

// 주민번호가 중복될 때 발생하는 예외 클래스

public class DuplicateSsnException extends Exception {
	public DuplicateSsnException (String message) {
		super (message);
	}
	
}

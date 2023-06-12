package exception;

// 사용자를 찾을 수 없을 때 발생하는 예외 클래스

public class PersonNotFoundException extends Exception {
	public PersonNotFoundException (String message) {
		super (message);
	}

}

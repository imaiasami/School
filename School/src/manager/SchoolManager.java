package manager;

import exception.DuplicateSsnException;
import exception.PersonNotFoundException;
import vo.*;

public class SchoolManager {
	private Person[] persons;				// 리스트로 바꾸기
	private int count;
	
	public SchoolManager() {
		persons = new Person[100];
	}
	
	public Person addPerson(Person p) throws DuplicateSsnException {
		// 동일한 주민번호가 있으면 등록하지 않게 처리
		try {
			findPerson(p.getSsn());
			// 동일한 주민번호가 있으면 DuplicateSsnException 예외를 발생시킨다.
			// 중복되는 주민번호가 없으면 배열에 저장한다.
			throw new DuplicateSsnException (p.getSsn()
					+ "과 동일한 주민번호가 있습니다.");
			
		} catch (PersonNotFoundException e1) {
			persons[count++] = p;
			return p;
		}
}
	
	public Person findPerson(String ssn) throws PersonNotFoundException {
		for (int i = 0; i < count; i++) {			// 들어있는 갯수만큼만 돌아야한다. 아니면 null point capsule 오류가 남
			if (persons[i].getSsn().equals(ssn)) {		// 레퍼런스 비교는 .equals를 써야한다. ==를 쓰면 스트링 타입은 오류가 난다.
				return persons[i];
			}
		}
		// 만약 주민번호에 해당하는 사람이 없으면 PersonNotFoundException을 발생시킨다.
		throw new PersonNotFoundException(ssn + "주민번호가 없습니다.");
	}
	
	public boolean removePerson(String ssn) {
			try {
					if (findPerson(ssn) != null) {
						for (int i = 0; i < count; i++) {
							if (persons[i].getSsn().equals(ssn))	{		// 데이터 유무와 상관없이 배열 전체를 도는 반복문까지 이다.
								for (int j = i; j < count; j++)	{
									if (j == count - 1) {
										persons[j] = null;
									} else {
										persons[j] = persons[j + 1];
									}
								}
								count--;
								return true;
							}
						}
					}
					return false;
				} catch (PersonNotFoundException e) {
					return false;
				}
		}

	public Person[] getAllPersons() {
		Person[] result = new Person[count];
		for (int i = 0; i < result.length; i++)	{
			result[i] = persons[i];
		}
		return result;
	}

}

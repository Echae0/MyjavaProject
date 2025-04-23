package workshop.person.control;

import workshop.person.entity.PersonEntity;

public class PersonManager {
	public static void main(String[] args) {
		/*
		 * persons는 PersonEntity[] 타입
		 * persons[0]는 PersonEntity 타입
		 */
		//PersonEntity 타입인 배열을 선언 및 생성
		PersonEntity[] persons = new PersonEntity[3];
		//Person 객체생성
		//PersonEntity person = new PersonEntity();
		persons[0] = new PersonEntity("이성호","7212121028102", "인천 계양구", "032-392-2932");
		
	}
}

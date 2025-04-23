package workshop.account.test;

//ctrl + shift + o 오류 있을 땐 잘 작동 안 함.
import workshop.account.entity.Account;

public class AccountTest {
	public static void main(String[] args) {
		//Account 객체
		Account account = new Account("A1100", "221-22-3477", 100000);
		System.out.println(account); //account.toString()
	}
	
}

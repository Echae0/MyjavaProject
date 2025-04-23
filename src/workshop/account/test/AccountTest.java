package workshop.account.test;

//ctrl + shift + o 오류 있을 땐 잘 작동 안 함.
import workshop.account.entity.Account;
import workshop.account.exception.InsufficientBalanceException;

public class AccountTest {
	public static void main(String[] args) {
		//Account 객체
		Account account = new Account("A1100", "221-22-3477", 100000);
		System.out.println(account); //account.toString()
		System.out.println("고객번호: " + account.getCustId());
		System.out.println("계좌번호: " + account.getAcctId());
		System.out.println("잔액: " + account.getBalance());
		
		System.out.println("10000원 입금");
		account.deposit(10000);
		System.out.println("잔액: " + account.getBalance());
		
		System.out.println("20000원 출금");
		try {
			account.withdraw(20000);
			System.out.println("잔액: " + account.getBalance());
			
			account.withdraw(100000);
			System.out.println("잔액: " + account.getBalance());
			
		}catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
}

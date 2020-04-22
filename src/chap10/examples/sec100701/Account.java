package chap10.examples.sec100701;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money; 
	}
	
	public void withdraw(int money) throws BalanceInsufficientException{
		if (balance <money) {
			// exception 객체를 생성해서 던져준다...
			// 보여줄 메세지를 작성해서 보낼수있다.
			throw new BalanceInsufficientException("잔고부족:" + (money-balance)+ "모자람");
		}
		balance -= money;
	}

}

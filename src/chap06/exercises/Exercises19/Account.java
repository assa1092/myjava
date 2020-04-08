package chap06.exercises.Exercises19;

public class Account {
	private static final int MIN_BALANCE= 0;
	private static final int MAX_BALANCE= 1000000;
	private int balance;
	
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance>=0 && balance <=1000000) {
			this.balance=balance;
		
		}else {
			this.balance = balance;
			
		}
		return ;
		}
		
		
		
	}

	
	


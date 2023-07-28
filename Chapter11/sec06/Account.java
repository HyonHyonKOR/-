package ch11.sec06;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(long money) {
		balance += money;
	}
	
	public void withdraw(long money) throws InsufficientException{
		if(balance < money) {
			throw new InsufficientException("残高が" + (money-balance)+"円不足");
		}
		balance -= money;
	}
}

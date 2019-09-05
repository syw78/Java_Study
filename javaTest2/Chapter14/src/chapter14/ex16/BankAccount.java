package chapter14.ex16;

public class BankAccount   {
	private int balance;
	
	
	
	public BankAccount(int balance) {
		super();
		this.balance = balance;
	}
	public void deposit(int money) { //입금
		
		this.balance=this.balance+money;
		System.out.println(money+"입금되었습니다");
		
	}
	public void withdraw(int mom)throws NegativeBalanceException { //출금
		if(balance<mom) {
		throw new NegativeBalanceException(-mom+"금액 부족");
		}
		this.balance=this.balance-mom;
		System.out.println(mom+"출금되었습니다");
		
	}
	
}

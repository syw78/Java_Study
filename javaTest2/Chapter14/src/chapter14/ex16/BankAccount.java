package chapter14.ex16;

public class BankAccount   {
	private int balance;
	
	
	
	public BankAccount(int balance) {
		super();
		this.balance = balance;
	}
	public void deposit(int money) { //�Ա�
		
		this.balance=this.balance+money;
		System.out.println(money+"�ԱݵǾ����ϴ�");
		
	}
	public void withdraw(int mom)throws NegativeBalanceException { //���
		if(balance<mom) {
		throw new NegativeBalanceException(-mom+"�ݾ� ����");
		}
		this.balance=this.balance-mom;
		System.out.println(mom+"��ݵǾ����ϴ�");
		
	}
	
}

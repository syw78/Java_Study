package chapter06.ex33;

public class BankAccount {
	private String name;
	private String accountNum;
	private int balance;
	private int interestRate;
	
	public BankAccount() {
		this(null,null,0,0);
	}
	public BankAccount(String name , String accountNum , int balance , int inter) {
		
		this.name=name;
		this.accountNum=accountNum;
		this.balance=balance;
		this.interestRate=inter;
	}
	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", accountNum=" + accountNum + ", balance=" + balance + ", interestRate="
				+ interestRate + "]";
	}
	
	
}

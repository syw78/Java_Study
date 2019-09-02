package chapter06.ex33;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		BankAccount bank2= new BankAccount("ȫ�浿","287702-04-111732", 10000000, 3);
		
		System.out.println(bank.toString());
		System.out.println(bank2.toString());
	}

}

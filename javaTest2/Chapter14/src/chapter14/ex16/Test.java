package chapter14.ex16;

public class Test {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount(10_000);
		try {
			ba.withdraw(20_000);
		}catch(NegativeBalanceException e) {
			System.out.println(e.getMessage());
		}
	}

}

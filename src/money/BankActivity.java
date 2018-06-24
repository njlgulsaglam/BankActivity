package money;

public class BankActivity {
	public static void main (String[] args) {
	
	
BankAccount account = new BankAccount();
account.name="Nejla";
account.accountNumber=123456L;
account.balance=1250000;

account.displayCardInfo();
account.deposit(500000);
   System.out.println(account.balance);
   account.withdraw(50000);
   account.getBalance();







	}
}
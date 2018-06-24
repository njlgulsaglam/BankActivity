package money;

public class BankAccount {
	String name;
	long accountNumber;
	double balance;
	
	public void displayCardInfo() {
		System.out.println("Account holder name is: " +name+
				" | Account number is:" +accountNumber);
	}
	public void deposit(double addedMoney) {
		balance = balance + addedMoney;
		return;
	}
	public void withdraw(int moneyTakenAway) {
		if(balance< moneyTakenAway) {
			System.out.println("you dont have enough money");
		return;
		}
		balance= balance - moneyTakenAway;
		System.out.println("you have less than 1000$ please deposit another million");
	}
	public double getBalance() {
		return balance;
	}
	
	
	
	}
	
	
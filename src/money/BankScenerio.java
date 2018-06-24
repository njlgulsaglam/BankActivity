package money;
import java.util.Scanner;
public class BankScenerio {

	public static void main(String[] args) {
	System.out.println("Welcom to our bank !!") ;
	System.out.println("*If you want to deposit please press 1 \n"
		 + "*If you want to withdraw please press 2");
	
	BankAccount account = new BankAccount();
	account.name="Adam";
			account.accountNumber=123456L;
	account.balance=2500000;
	
	Scanner input = new Scanner(System.in);
	int opinion= input.nextInt();
	if(opinion ==1) {
		System.out.println("Enter the deposit amount in double");
		double deposit= input.nextDouble();
	}else if(opinion==2) {
		System.out.println("Enter the withraw amount in int");
		int deposit = input.nextInt();
	}else {
		System.out.println("Invalid input");
		
	}
	account.displayCardInfo();
	System.out.println("Final balance is " +account.getBalance());
	
	
	
	
	
	
	
	}
}
	
	


package money;
import java.util.Scanner;
public class ProcessMoreData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fullName;
		double amount;
		double total;
		boolean taxable;
		
		System.out.print("customor's Fullname:  ");
		fullName= sc.nextLine();
		
		System.out.print("Amount: ");
		amount = sc.nextDouble();
		
		System.out.print("Taxable: (true/false ) ");
        taxable = sc.nextBoolean();
		
		if(taxable) {
			total = amount*1.05;
		}else {
			total = amount;
		}
			System.out.println();
			System.out.print(" the total for  " +fullName+ " is: " +total+ ".");
		
			sc.close();
	
			
			}
		}


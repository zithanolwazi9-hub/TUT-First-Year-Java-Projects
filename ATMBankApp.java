import java.util.Scanner;
import java.text.DecimalFormat;


public class ATMBank
{
	public static void main(String[] args)
	{
		
	Scanner input = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("R#.00");
	
	
	// variables
	int atmOption = 0;
	double balance = 2500.00, depositAmount = 0.00, withdrawAmount = 0.00;
	
	
	do{
	
	System.out.println("\nWelcome To Capitec Bank!");
	System.out.println("==============ATM MENU====================");
	System.out.println("1. Deposit");
	System.out.println("2. Withdraw");
	System.out.println("3. Check Balance");
	System.out.println("4. Exit");
	
	System.out.print("Enter your menu option: ");
	atmOption = input.nextInt();
	
	if(atmOption == 1 ){
		
		System.out.println("You are depositing money.");
		System.out.print("\nEnter the amount you want to deposit: R");
		depositAmount = input.nextDouble();
		
		//calculation
		balance += depositAmount;
		System.out.println("Your Current Balance is: " + df.format(balance));
	
	
	}else if(atmOption == 2){
		
		System.out.println("You are withdrawing money.");
		System.out.print("\nEnter the amount you want to withdraw: R");
		withdrawAmount = input.nextDouble();
		
			if(withdrawAmount <= balance){
			balance -= withdrawAmount;
			}else{
			System.out.println("Insufficient Funds");
			}
			
		System.out.println("Your Current Balance is: " + df.format(balance));
		
		
	}else if(atmOption == 3){
		
		System.out.println("Viewing Your Balance.");
		System.out.print("Your Current Balance is: " + df.format(balance));
		
	}else if(atmOption == 4){
		
		System.out.println("\nThank You For Banking With Us.");
	
	}else{
		System.out.println("\nInvalid Option.Try Again");
	}
		
		
	}while(atmOption != 4);
	
	
	
	
	
	}
	
}

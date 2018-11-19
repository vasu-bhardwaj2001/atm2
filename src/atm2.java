import java.util.Scanner;

public class atm2{
	
	Scanner input = new Scanner(System.in);
	public void menu(account test, user test2) {
		System.out.println("Input your account number");
		int accountnum = input.nextInt();
		String eat = input.nextLine();
		if(accountnum == test.getaccountNumber()) {
			System.out.println("Input your pin");
			int pin = input.nextInt();
			input.nextLine();
			if (pin == test.getPin()) {
				int i = 0;
				do {
					System.out.println("you have $" + test.getbalance() + " in your account \n 1: deposit\n 2: withdraw\n 3: show balance\n 0: exit terminal");
					int use = input.nextInt();
					input.nextLine();
					
						switch(use) {
							case (0):
								i = 1;
								break;
							case (1):
								deposit(test);
								break;
							case (2):
								withdraw(test);
								break;
							case (3):
								showBalance(test);
								break;
							case (4):
								break;
							default:
								System.out.println("Invalid");
								break;
						}
					}while (i != 1);
			}
			
		}
	}
		
	
	public void deposit(account test) {
		System.out.println("How much do you want to deposit?");
		Long depositAmount = input.nextLong();
		System.out.println(depositAmount);
		String eat = input.nextLine();
		if(depositAmount == 0) {
			System.out.println("Please deposit a value");
		}
		else {
			test.deposit(depositAmount);
		}
		
		
	}
	public void withdraw(account test) {
		System.out.println("How much do you want to withdraw?");
		Long withdrawAmount = input.nextLong();
		input.nextLine();
		if(withdrawAmount == 0) {
			System.out.println("Please withdraw a value");
		}
		if (withdrawAmount > test.getbalance()) {
			System.out.println("insufficient funds");
		}
		else {
			test.withdraw(withdrawAmount);
		}
		
	}
	public void showBalance(account test) {
		System.out.println("You currently have $" + test.getbalance() +" dollars in your account");
		
	}
	
	public static void main (String[] args) {
		user test = new user("12345", "123-456-7890", "Name Name", "123445234534", "123 street rd, town city, state");
		account valtest = new account (12345.67, 1234, test ,12345);
		atm2 current = new atm2();
		current.menu(valtest, test);
	}
	
}
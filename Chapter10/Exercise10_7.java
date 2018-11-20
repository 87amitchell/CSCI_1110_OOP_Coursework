import java.util.Scanner;

public class Exercise10_7 {

	public static void main(String[] args) {
		Account[] accounts = new Account[10];
		Scanner input = new Scanner(System.in);
		
		//create accounts 0-9
		for (int i = 0; i <10; i++) {
			accounts[i] = new Account(i, 100.00);
		}
		//enter id loop
		while(true) {
			System.out.print("Enter an id: ");
			int accountNumber = input.nextInt();
			
			if((accountNumber >= 0) && (accountNumber <= 9)) {
				int menuNumber = 0;
				
				//main menu loop for accounts
				while (menuNumber != 4) {
				System.out.println();
				System.out.println("Main account menu, account #" + accountNumber);
				System.out.println("1: check balance");
				System.out.println("2; withdraw");
				System.out.println("3: deposit");
				System.out.println("4: exit");
				menuNumber = input.nextInt();
				
				if((menuNumber >= 1) && (menuNumber <= 4)) {
					if(menuNumber == 1) {
						System.out.println("account balance is $" + String.format("%.02f", accounts[accountNumber].getBalance()));
					}
					else if(menuNumber == 2) {
						System.out.print("Enter withdraw ammount (ie 100.00): ");
						double i = input.nextDouble();
						System.out.println();
						accounts[accountNumber].withdraw(i);
					}
					else if(menuNumber == 3) {
						System.out.print("Enter deposit ammount (ie 100.00): ");
						double j = input.nextDouble();
						System.out.println();
						accounts[accountNumber].deposit(j);
					}
				}
				else {
					System.out.println("Please enter a valid menu number, you entered: " + menuNumber);
				}
				}//end while(menuNumber)
			}
			else {
				System.out.println("Please enter a valid account number, you entered: " + accountNumber);
			}
		}//end while(true)
	}//end main
}//end class
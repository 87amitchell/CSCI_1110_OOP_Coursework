
public class Exercise9_7Test {

	public static void main(String[] args) {
		Account Account1 = new Account(1122, 20000.00);
		Account1.setAnnualInterestRate(4.5);
		Account1.withdraw(2500.00);
		Account1.deposit(3000.00);
		System.out.println("Balance is " + Account1.getBalance());
		System.out.println("Monthly interest " + Account1.getMonthlyInterest());
		System.out.println("Date account was created is " + Account1.getDateCreated());
	}
}
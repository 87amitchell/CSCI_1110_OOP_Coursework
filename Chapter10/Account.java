
import java.util.*;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	public Account() {
		id = 0;
		dateCreated = new Date();
	}
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public double getMonthlyInterestRate() {
		return ((annualInterestRate/12)/100);
	}
	public double getMonthlyInterest() {
		return (balance * getMonthlyInterestRate());
	}
	public void withdraw(double balance) {
		if (balance > this.balance) {
			System.out.println("Error, the withdrawal amount you entered ($" + balance + ") exceeds account total ($" + this.balance + ")");
		}
		else {
		this.balance -= Math.abs(balance);
		}
	}
	public void deposit(double balance) {
		this.balance += Math.abs(balance);
	}
}
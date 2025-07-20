package exercicioFixacaoLpoo.entities;

public class Account {

	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	public Account(int accountNumber, String accountHolder, double deposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public Account(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	
	public String toString() {
		return "Account " + accountNumber + ", Holder: " + accountHolder 
				+ ", Balance: $" + balance;
	}
	
	public double deposit(double amount) {
		return balance += amount;
	}
	
	public double withdraw(double amount) {
		return balance -= amount;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getDeposit() {
		return balance;
	}

	public void setDeposit(double balance) {
		this.balance = balance;
	}
	
	
}

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Account> listAccount = new ArrayList<>();
		
		System.out.println("=== ACCOUNT DATA ===");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withdrawLimit);
		listAccount.add(account);
		
		System.out.print("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		
		try {
			account.withdraw(amount);
			System.out.println("New balance: $" + String.format("%.2f", account.getBalance()));
		} catch (IllegalArgumentException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		sc.close();
	}
}

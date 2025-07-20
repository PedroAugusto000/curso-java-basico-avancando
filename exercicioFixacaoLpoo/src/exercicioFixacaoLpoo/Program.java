package exercicioFixacaoLpoo;

import java.util.Scanner;

import exercicioFixacaoLpoo.entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double balance = 0;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accountHolder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n): ");
		char initialDeposit = sc.next().charAt(0);
		Account account = new Account(accountNumber, accountHolder);
		
		if(initialDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			balance = sc.nextDouble();
			account.deposit(balance);
		} 
		
		System.out.print("");
		System.out.print("===ACCOUNT DATA===");
		System.out.println(account);
		System.out.print("");
		
		System.out.print("Enter a deposit value: ");
		balance = sc.nextDouble();
		account.deposit(balance);
		
		System.out.println("");
		System.out.println("===UPDATED DATA===");
		System.out.println(account);
		System.out.println("");
		
		System.out.print("Enter withdraw value: ");
		balance = sc.nextDouble();
		account.withdraw(balance);
		
		System.out.println("");
		System.out.println("===UPDATED DATA===");
		System.out.println(account);
		System.out.println("");
	}
}

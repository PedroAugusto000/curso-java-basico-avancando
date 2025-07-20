package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import service.ContractService;
import service.PayPalService;

public class Program {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("===CONTRACT DATA===");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Contract value: ");
		double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);
		
		System.out.print("Number of installments: ");
		int n = sc.nextInt();
		
		ContractService contractService = new ContractService(new PayPalService());

		contractService.processContract(contract, n);
		
		System.out.println("===INSTALLMENTS DATA===");
		for (Installment installment : contract.getListInstallment()) {
			System.out.println(installment.toString());
		}
		
		sc.close();
	}
}

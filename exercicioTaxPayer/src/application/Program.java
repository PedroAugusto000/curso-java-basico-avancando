package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.CompanyTaxPayer;
import entities.IndividualTaxPayer;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<TaxPayer> listTaxPayer = new ArrayList<>();
		
		System.out.println("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("");
			System.out.println("===TAX PAYER #" + (i + 1) + " DATA");
			
			System.out.print("Individual or company (i/c): ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if(ch == 'c') {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				listTaxPayer.add(new CompanyTaxPayer(name, anualIncome, numberEmployees));
			} 
			else if (ch == 'i') {
				System.out.print("Health expenditures");
				double healthExpenditures = sc.nextDouble();
				listTaxPayer.add(new IndividualTaxPayer(name, anualIncome, healthExpenditures));
			}
		}
		
		System.out.println("");
		System.out.println("===TAXES PAID===");
		for(TaxPayer t : listTaxPayer) {
			System.err.println(t);
		}
		
		System.out.println("");
		System.out.println("===TOTAL TAXES===");
	}
}

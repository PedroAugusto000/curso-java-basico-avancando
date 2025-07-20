package exercicioFixacaoProduct.application;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import exercicioFixacaoProduct.model.entities.ImportedProduct;
import exercicioFixacaoProduct.model.entities.Product;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		List<Product> productList = new ArrayList<>();
		
		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1) + " data===");
			System.out.print("Common, used or imported (c/u/i): ");
			char ch = sc.next().charAt(0);
			
			System.out.println("");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(ch == 'c') {
				productList.add(new Product(name, price));
			} 
			else if (ch == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				productList.add(new ImportedProduct(name, price, customsFee));
			} else if (ch = 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate manufactureDate = sdf.format();
			}
		}
	}
}

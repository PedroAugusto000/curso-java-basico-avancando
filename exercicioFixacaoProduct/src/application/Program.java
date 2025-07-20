package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.ImportedProduct;
import model.entities.Product;
import model.entities.UsedProduct;

public class Program {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<Product> listProduct = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		System.out.println("");
		for(int i = 0; i < n; i++) {
			System.out.println("===PRODUCT #" + (i + 1) + " DATA===");
			System.out.print("Common, used or imported (c/u/i): ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				listProduct.add(new ImportedProduct(name, price, customsFee));
			} 
			else if(ch == 'u') {
				System.out.print("Manufacture Date (DD/MM/YYYY): ");
				LocalDate manufactureDate = LocalDate.parse(sc.next(), fmt);
				listProduct.add(new UsedProduct(name, price, manufactureDate));
			} else {
				listProduct.add(new Product(name, price));
			}
		}
		
		System.out.println("");
		System.out.println("===PRICE TAGS===");
		for(Product p : listProduct) {
			System.out.println(p.priceTag());
		}
	}
}

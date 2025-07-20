package exercicioLista.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main (String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employes will be registered: ");
		int n = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for(int i = 0; i < n;i++) {
			System.out.println("===EMPLOYEE #" + (i + 1) + "===");
			System.out.println("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Salary");
			double salary = sc.nextDouble();
			
			Employee employee = new Employee(id, name, salary);
			list.add(employee);
		}
		
		System.out.println("List of employes: ");
		for(Employee emp : list) {
			System.out.println(emp);
		}
	}
}

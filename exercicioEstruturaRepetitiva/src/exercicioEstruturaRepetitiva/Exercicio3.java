package exercicioEstruturaRepetitiva;

import java.util.Scanner;

public class Exercicio3 {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===Escolha o combustível===");
		System.out.println("1. Álcool");
		System.out.println("2. Gasolina");
		System.out.println("3. Diesel");
		System.out.println("4. Fim");
		
		int opcao = 0;
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while(opcao != 4) {
			
			System.out.print("Informe o combustível: ");
			opcao = sc.nextInt();
			
		if (opcao == 1) {
			System.out.println("Combustível escolhido: Álcool");
			alcool++;
			} else if (opcao == 2) {
				System.out.println("Combustível escolhido: Gasolina");
				gasolina++;
			} else if (opcao == 3) {
				System.out.println("Combustível escolhido: Diesel");
				diesel++;
			} else if (opcao == 4) {
				System.out.println("MUITO OBRIGADO!");
			} else {
				System.out.println("Código inválido, tente novamente!");
			}
		}
		
		System.out.println("===RESULTADO===");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
	}
}

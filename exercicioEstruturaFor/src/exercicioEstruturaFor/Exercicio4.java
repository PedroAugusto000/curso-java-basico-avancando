package exercicioEstruturaFor;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		double valorA = 0;
		double valorB = 0;
		for(int i = 0; i <= numero; i++) {
			System.out.print("Informe o primeiro número: ");
			valorA = sc.nextDouble();
			System.out.print("Informe o segundo número: ");
			valorB = sc.nextDouble();
			
			if(valorB == 0) {
				System.out.println("Divisão impossível!");
			}else {
				double dividido = valorA / valorB;
				System.out.println("Resulatdo: " + dividido);
			}
		}
	sc.close();
	}
}

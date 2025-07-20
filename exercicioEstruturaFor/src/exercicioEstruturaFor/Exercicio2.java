package exercicioEstruturaFor;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o número: ");
		int numero = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for(int i = 1; i <= numero; i++) {
			System.out.print("Informe o valor: ");
			int valor = sc.nextInt();
			
			if(valor >= 10 && valor <= 20) {
				in++;
			} else {
				out++;
			}
		}
		
		System.out.println("===RESULTADO===");
		System.out.println("Dentro do intervalo: " + in);
		System.out.println("Dentro do intervalo: " + out);
	}
}

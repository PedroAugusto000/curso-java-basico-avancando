package exerciciosLpoo.exercicio1;

import java.util.Locale;
import java.util.Scanner;

import exerciciosLpoo.exercicio1.entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a altura do retângulo: ");
		double altura = sc.nextDouble();
		System.out.print("Informe a largura do retângulo: ");
		double largura = sc.nextDouble();
		Retangulo retangulo = new Retangulo(altura, largura);
		
		System.out.println("");
		System.out.println("===RESULTADO===");
		System.out.println("AREA: " + retangulo.calculaArea());
		System.out.println("PERIMETER: " + retangulo.calculaPerimetro());
		System.out.println("DIAGONAL: " + retangulo.calculaDiagonal());
	}
}

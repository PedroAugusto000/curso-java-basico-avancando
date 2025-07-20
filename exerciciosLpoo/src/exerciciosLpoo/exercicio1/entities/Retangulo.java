package exerciciosLpoo.exercicio1.entities;

public class Retangulo {

	private Double largura;
	private Double altura;
	
	public Retangulo(Double largura, Double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	public double calculaArea() {
		return largura * altura;
	}
	
	public double calculaPerimetro() {
		return 2* (largura + altura); 
	}
	
	public double calculaDiagonal() {
		return Math.sqrt(largura * largura + altura * altura);
	}
	
}

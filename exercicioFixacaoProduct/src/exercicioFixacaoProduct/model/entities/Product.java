package exercicioFixacaoProduct.model.entities;

public class Product {

	protected String name;
	protected Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	protected String priceTag() {
		return name + " $" + price;
	}
}

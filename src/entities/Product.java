package entities;

public class Product {
	
	//objetos
	public String name;
	public double price;
	public int quantity; 
	
	
	
	//Construtores == antes dos métodos
	
	public Product(String name, double price, int quantity) {
		
		// this.name serve para referenciar a var publica 
		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}
	
	public Product(String name, double price) {
		
		// this.name serve para referenciar a var publica 
		
		this.name = name;
		this.price = price;
		
	}
	
	
	
	public double TotalValueInStock() {

		return price * quantity;

	}

	public void AddProduct(int quantity) {
		// this e para chamar o atributo da classe
		this.quantity += quantity;
	}

	public void RemoveProduct(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {

		return name + " , $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", TotalValueInStock());

	}

}

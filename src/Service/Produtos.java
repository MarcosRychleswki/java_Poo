package Service;

public class Produtos {
	
	
	public String name;
	public double price;
	public int quantity; 
	
	
	public double TotalValueInStock() {
		
		return price * quantity;
		
	}
	
	
	public void AddProduct(int quantity) {
		//this e para chamar o atributo da classe
		this.quantity += quantity;
	}
	
	public void RemoveProduct(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		
		return name
			+ " , $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f",TotalValueInStock() );
		
	}
	
	
	

}

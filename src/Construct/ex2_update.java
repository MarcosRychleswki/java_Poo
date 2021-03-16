package Construct;

import java.util.Scanner;

import entities.Product;



public class ex2_update {

	public static void main(String[] args) {
		
		
Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		// essa var name, price e quantity é uma var temporaria apenas para reveber o valor
		System.out.println("Enter with price: ");
		double price = sc.nextDouble();
		
		
		Product product = new Product (name, price);
		
		
		// alterar o valor da entrada set == alterar
		product.setName("Radio");
		product.setPrice(2000);
		
		System.out.println(product.getName());
		System.out.println();
		System.out.println(product.getPrice());
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println("");
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.AddProduct(quantity);
		System.out.println("Updated data:" + product);
		System.out.println("Enter the number of products to be removed from stock: ");
		int quantity1 = sc.nextInt();
		product.RemoveProduct(quantity1);
		System.out.println("Updated data:" + product);
		
		

	}

}

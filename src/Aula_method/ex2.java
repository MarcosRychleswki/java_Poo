package Aula_method;

import java.util.Scanner;

import Service.Produtos;

public class ex2 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Produtos product = new Produtos();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.println("Enter with price: ");
		product.price = sc.nextDouble();
		System.out.println("Enter with quantity: ");
		product.quantity = sc.nextInt();
		
		System.out.println(product.name + ", " + product.price + ", " + product.quantity);
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

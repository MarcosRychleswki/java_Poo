package Aula_method;
import java.util.Scanner;

import Service.Rectangle;




//Fazer um programa para ler os valores da largura e altura
//de um retângulo. Em seguida, mostrar na tela o valor de
//sua área, perímetro e diagonal. Usar uma classe como
//mostrado no projeto ao lado.


public class ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Rectangle rectangle = new Rectangle();
		
		
		System.out.println("Largura");
		rectangle.largura = sc.nextDouble();
		System.out.println("Altura");
		rectangle.altura = sc.nextDouble();
		
		
		
		System.out.println("Teste:"+rectangle.largura+", "+rectangle.altura);
		
		System.out.println(rectangle.area());
		
		System.out.println(rectangle.perimetro());
		
		System.out.println(rectangle.diagonal());
		
		sc.close();

	}

}

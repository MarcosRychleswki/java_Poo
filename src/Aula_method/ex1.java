package Aula_method;

import java.util.Scanner;

import Service.Triangle;


public class ex1 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		String curDir = System.getProperty("user.dir");
		
		System.out.println(curDir);

		
		System.out.println("Digite o valor de a: ");
		x.a = sc.nextDouble();
		System.out.println("Digite o valor de b: ");
		x.b = sc.nextDouble();
		
		
		System.out.println("Digite o valor de a: ");
		y.a = sc.nextDouble();
		System.out.println("Digite o valor de b: ");
		y.b = sc.nextDouble();
		
		
		double f = y.sub();
		double d = x.soma();
		
		System.out.println("Soma: " + d );
		System.out.println("Soma: " + f );

	}

}

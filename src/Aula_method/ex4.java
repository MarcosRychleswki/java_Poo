package Aula_method;
import java.util.Scanner;

import Service.Funcionario;



//Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
//seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
//salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
//afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
//projetada abaixo.



public class ex4 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		Funcionario funcionario = new Funcionario();
		
		
		
		System.out.println("Digite seu nome: ");
		funcionario.name = sc.nextLine();
		System.out.println("Digite seu salario: ");
		funcionario.gross_salary = sc.nextDouble();
		System.out.println("Digite o imposto: ");
		funcionario.tax = sc.nextDouble();
		
	
		
		
		Double result = funcionario.NetSalary();
		String nome = funcionario.name;
		double result_final = funcionario.gross_salary;
		
		System.out.println(result);
		System.out.println(nome);
		
		System.out.println("Digite a porcentagem: ");
		double percentage = sc.nextDouble();
		funcionario.IncreaseSalary(percentage);
		System.out.println("Update data: "+ result_final);
		
		
		

	}

}

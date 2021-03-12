package Aula_method;
import java.util.Scanner;

import Service.Aluno;



//Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
//(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
//ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
//para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
//resolver este problema.




public class ex5 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		
		
		
		
		System.out.println("Digite seu nome: ");
		aluno.aluno = sc.nextLine();
		System.out.println("Digite a nota 1");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Digite a nota 2: ");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Digite a nota 3: ");
		aluno.nota3 = sc.nextDouble();
		
		
		double nota_final = aluno.nota();
		
		System.out.println(nota_final);
		
		if (nota_final < 60.0) {
			
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", aluno.Final());
	
		}
		
		else {
			
			System.out.println("PASS");

			
			
		}
		
		
	}

}

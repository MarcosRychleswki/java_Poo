package Service;




//Fazer um programa para ler os dados de um funcion�rio (nome, sal�rio bruto e imposto). Em
//seguida, mostrar os dados do funcion�rio (nome e sal�rio l�quido). Em seguida, aumentar o
//sal�rio do funcion�rio com base em uma porcentagem dada (somente o sal�rio bruto �
//afetado pela porcentagem) e mostrar novamente os dados do funcion�rio. Use a classe
//projetada abaixo.





public class Funcionario {
	
	
	public String name;
	public double gross_salary;
	public double tax;
	
	
	
	
	
	public double NetSalary() {
		
		return gross_salary - tax;
		
		
		
	}
	
	public void IncreaseSalary(double percentage ) {
		
		gross_salary +=  gross_salary * percentage/100.0;
		
		
		
	}
	
	
	
	
	
	
	

}

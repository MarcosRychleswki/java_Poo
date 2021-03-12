package Service;




//Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
//seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
//salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
//afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
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

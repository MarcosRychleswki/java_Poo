package Service;





//Fazer um programa para ler o nome de um aluno e as tr�s notas que ele obteve nos tr�s trimestres do ano
//(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
//ano. Dizer tamb�m se o aluno est� aprovado (PASS) ou n�o (FAILED) e, em caso negativo, quantos pontos faltam
//para o aluno obter o m�nimo para ser aprovado (que � 60% da nota). Voc� deve criar uma classe Student para
//resolver este problema.




public class Aluno {
	
	
	public String aluno;
	public double nota1;
	public double nota2;
	public double nota3;
	
	
	
	
	public double nota() {
		
		
		
		return  nota1 + nota2 + nota3;
		
		
	}
	
	public double Final() {
		
		
		if (nota()<60.0) {
			
			
			return 60.0 - nota();
			
		}
		
		else {
			
			return 0.0;
		}
		
		
	}
	
	
	

}

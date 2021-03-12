package Service;



//Fazer um programa para ler os valores da largura e altura
//de um retângulo. Em seguida, mostrar na tela o valor de
//sua área, perímetro e diagonal. Usar uma classe como
//mostrado no projeto ao lado.



public class Rectangle {
	
	
	public double largura;
	public double altura;
	
	
	
	
	public double area() {
		
		double t = largura * altura;
		
		return t;
		
	}
	
	
	public double perimetro() {
		
		double p = (largura * 2) + (altura * 2);
		return p;
		
		
	}
	
	
	public double diagonal() {
		
		
		return  Math.sqrt(largura*largura + altura*altura);
		
	}
	
	
	

}

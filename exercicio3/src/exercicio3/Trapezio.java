package exercicio3;

public class Trapezio {
	
	double baseMenor;
	double baseMaior;
	double altura ;
	
	public double calcularArea() {
		
		double area = ((baseMaior + baseMenor)/2)*altura;
		
		return area;
	}
	
}

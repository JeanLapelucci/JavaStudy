package exercicio3;

public class Application {
	
	public static void main(String[] args) {
		
		Circunferencia c1 = new Circunferencia() ;
		c1.raio = 90;
		double area = c1.calcularArea();
		System.out.println("a área é: " + area);
	
		Quadrado q1 = new Quadrado();
		q1.lado = 8;
		area = q1.calcularArea();
		System.out.println("a área é: " + area);
		
		Trapezio t1 = new Trapezio();
		t1.altura = 1.80;
		t1.baseMaior = 3;
		t1.baseMenor =2;
		area = t1.calcularArea();
		System.out.println("a área é: " + area);
	
		Triangulo tri1 = new Triangulo();
		tri1.altura = 9.6;
		tri1.base = 14;
		area = tri1.calcularArea();
		System.out.println("a área é: " + area);
		
	}
}

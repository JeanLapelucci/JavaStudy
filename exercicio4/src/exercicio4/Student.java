package exercicio4;

public class Student {
	
	Test test1;
	Test test2;
	
	public double calcularMedia() {
		
		double media = test1.calcularNotaTotal() + test2.calcularNotaTotal();
		
		return media/2;
		
	}

}

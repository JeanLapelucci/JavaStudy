package exercicio7;

public class exec7 {
	
	public static void main(String[] args) {
		
		int qtdNotas = 0 ;
		double somaNotas = 0.0;
		
		int i = 1;
		
		while(true) {
			System.out.println("Nota " + (i++) + ":");
			
			double nota = Console.readDouble();
			
			if (nota == -1) {
				break;
			}
			
			else if (nota < 0 || nota > 10) {
				System.out.println("Nota Inv�lida");
				continue;
			}
			
			somaNotas += nota;
			
			qtdNotas++;
			
			double media = somaNotas/qtdNotas ;
			
			System.out.println("A m�dia �:" + media);
		}
	}
}

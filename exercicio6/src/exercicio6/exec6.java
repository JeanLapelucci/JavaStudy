package exercicio6;

public class exec6 {	
	
	public static void main(String args[]) {
		
		int dia = 31;
		int mes = 01;
		int ano = 2020;
		
		if((mes == 4 || mes == 6 || mes == 9 || mes == 11)  && dia > 30 ){
			System.out.println("esses meses não possuem 31 dias");
		}else if(mes == 2 && dia >= 29 || dia <= 0) {
			System.out.println("mês de fevereiro tem no máximo 28 dias");
		}else if(dia >= 1 && dia <= 31) {
			System.out.println("dia válido");
		}else {
			System.out.println("dia inválido");
		}
				
		
		
		if(mes >= 1 && mes <= 12){
			System.out.println("mês válido");
		}else {
			System.out.println("mês inválido");
		}
		
		
		if (ano >= 1900 && ano <= 2020) {
			System.out.println("ano válido");
		}else {
			System.out.println("ano inválido para o cadastro");
		}
	
	}
		
}
	

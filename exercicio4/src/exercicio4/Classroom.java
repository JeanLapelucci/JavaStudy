package exercicio4;

public class Classroom {
	
	Student studantA;
	Student studantB;
	Student studantC;
	
	public double calcularMediaTurma() {
		
		double media=
		studantA.calcularMedia() +
		studantB.calcularMedia() +
		studantC.calcularMedia();
		
		return media/3;
		
	} 

}

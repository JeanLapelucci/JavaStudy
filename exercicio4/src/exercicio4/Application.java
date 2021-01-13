package exercicio4;

public class Application {
	
	public static void main(String[] args) {
		
		Classroom classroom = new Classroom();
		
		Student studantA = new Student();
		Student studantB = new Student();
		Student studantC = new Student();
		
		classroom.studantA = studantA;
		classroom.studantB = studantB;
		classroom.studantC = studantC;
		
		Test studantA_NotePart1 = new Test();
		studantA_NotePart1.notePart1 = 4.0;
		studantA_NotePart1.notePart2 = 2.5;
		studantA.test1 = studantA_NotePart1; 
		
		Test studantA_NotePart2 = new Test();
		studantA_NotePart2.notePart1 = 1.0;
		studantA_NotePart2.notePart2 = 7.5;
		studantA.test2 = studantA_NotePart2; 
		
		Test studantB_NotePart1 = new Test();
		studantB_NotePart1.notePart1 = 6.5;
		studantB_NotePart1.notePart2 = 3.5;
		studantB.test1 = studantB_NotePart1; 
	
		Test studantB_NotePart2 = new Test();
		studantB_NotePart2.notePart1 = 0.0;
		studantB_NotePart2.notePart2 = 3.0;
		studantB.test2 = studantB_NotePart2;
		
		Test studantC_NotePart1 = new Test();
		studantC_NotePart1.notePart1 = 5.0;
		studantC_NotePart1.notePart2 = 4.0;
		studantC.test1 = studantC_NotePart1;
		
		Test studantC_NotePart2 = new Test();
		studantC_NotePart2.notePart1 = 6.0;
		studantC_NotePart2.notePart2 = 1.5;
		studantC.test2 = studantC_NotePart2; 
		
		System.out.println("a média do Estudante A: " + classroom.studantA.calcularMedia());
		System.out.println("a média do Estudante B: " + classroom.studantB.calcularMedia());
		System.out.println("a média do Estudante C: " + classroom.studantC.calcularMedia());
		
		System.out.println("a média da Sala é: " + classroom.calcularMediaTurma());
	}

}

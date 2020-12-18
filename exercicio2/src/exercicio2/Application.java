package exercicio2;

public class Application {
	
	public static void main(String[] args) {
		
		Fraction f1 = new Fraction();
		f1.valuesFraction(7, 8);
		
		Fraction f2 = new Fraction();
		f2.valuesFraction(9, 12);
		
		Fraction f3 = new Fraction();
		f3 = f1.Multiplicator(f2);
		
		System.out.println(f3.obtainFraction());
		System.out.println("The multiplication is: " + f3.calculationValue());
	}

}

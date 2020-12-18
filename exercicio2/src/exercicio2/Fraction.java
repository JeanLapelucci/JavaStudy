package exercicio2;

public class Fraction {
	
	
	double denominator;
	double numerator;
	
	public double calculationValue() {
		
		if(denominator == 0) {
			return 0;
		}
		
		return numerator/denominator;
	}
	
		Fraction Multiplicator(Fraction f) {
		
		Fraction fraction2 = new Fraction();
		
		fraction2.numerator = f.numerator * this.numerator;
		fraction2.denominator = f.denominator * this.denominator;
		
		return fraction2 ;
	}
		
		void valuesFraction(double denominator, double numerator) {
			this.numerator = numerator;
			this.denominator = denominator;
		}
		
		String obtainFraction() {
			return numerator   + "/" +  denominator;
		}

}

package exercicio5;

public class exe5_2 {
	
	public static void main(String args[]) {
		int x = 1;
		
		while(x < 1000) {
			
			switch (x % 2) {
			
				case 0: x+= 5;
					System.out.println(x);
					break;
					
				default: x*=2;
				System.out.println(x);
			
			}
		}
	}

}

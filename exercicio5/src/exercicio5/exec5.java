package exercicio5;

public class exec5 {
	
	public static void main(String args[]) {		
		
		int x = 16 ;
		
		while(x < 1000) {

			if(x % 2 ==0) {
				x += 5;
				System.out.println(x);
			}else{
				x *= 2;
				System.out.println(x);
			}
			
		}
	
		
	}

}

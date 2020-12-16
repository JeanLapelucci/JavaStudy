package exercicio1;

public class Aplication{
	
	public static void main(String[] args) {
		
		
		Clock clock = new Clock();
		
		clock.configureClock (10, 24, 37);
		
		System.out.println("indique onde cada ponteiro deve estar.");
		
		System.out.println("Ponteiro de hora: " + clock.pointerHour.position);
		System.out.println("Ponteiro de minuto: " + clock.pointerMinute.position);
		System.out.println("Ponteiro de segundo: " + clock.pointerMinute.position);
		
		int hour = clock.readHour();
		int minute = clock.readMinute();
		int second = clock.readSecond();
		
		
		System.out.println("Hora: " + hour);
		System.out.println("Minuto: " + minute);
		System.out.println("Segundo: " + second);
		
		
		Clock timer = new Clock();
		
		timer.configureClock(13, 45, 28);
		
		System.out.println("hora do segundo relógio é: " + timer.readHour());
	}
}

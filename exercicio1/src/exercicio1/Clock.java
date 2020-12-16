package exercicio1;

public class Clock {
	
	Pointer pointerHour = new Pointer();
	Pointer pointerMinute = new Pointer();	
	Pointer pointerSecond = new Pointer();
	
	public void configureClock(int hour, int minute, int second){
		
		hour = hour % 12;
		
		pointerHour.position = hour;
		pointerMinute.position = minute / 5;
		pointerSecond.position = second / 5;
	}
	
	public int readHour() {
		return pointerHour.position;
	}
	
	public int readMinute() {
		return pointerMinute.position * 5;
	}
	
	public int readSecond() {
		return pointerSecond.position * 5;
	}
}

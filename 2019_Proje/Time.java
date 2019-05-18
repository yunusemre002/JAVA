package v5;


public class Time {
	private int hour;
	private int minute;
	
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	
	public int getDifference(Time other) {
		return (this.hour * 60) + this.minute - (other.hour * 60) - other.minute;
		
	}
	
	
}

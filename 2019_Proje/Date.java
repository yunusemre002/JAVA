package v5;

import java.time.LocalDate;

public class Date {
	private int day;
	private int month;
	private int year;
	
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public boolean isAfterThan(Date other) {
		if(other.year > year) 
			return true;
		if(other.year == year && other.month > month)
			return true;
		if(other.year == year && other.month == month && other.day > day) 
			return true;
		return false;
	}
	
	public boolean isBeforeThan(Date other) {
		if(other.year < year) 
			return true;
		if(other.year == year && other.month < month)
			return true;
		if(other.year == year && other.month == month && other.day < day) 
			return true;
		return false;
	}
	
	
	public boolean isEqualsWith(Date other) {
		if(other.year == year) {
			if(other.month == month) {
				if(other.day == day)
					return true;
			}
		}
			return false;
	}
	
	
	public static Date getToday() {
		LocalDate localDate = LocalDate.now();
		Date today = new Date(localDate.getDayOfMonth(), localDate.getMonthValue(), localDate.getYear());
		return today;
	}
	

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
}

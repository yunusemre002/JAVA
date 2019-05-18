package v5;


public class ParkRecord {
	private Time enterTime;
	private Time exitTime;
	private Vehicle vehicle;
	
	
	
	public ParkRecord(Vehicle vehicle, Time enterTime, Time exitTime){
		this.enterTime = enterTime;
		this.exitTime = exitTime;
		this.vehicle = vehicle;
	}

	public int getParkingDuration() {
		return exitTime.getDifference(enterTime);
		
	}

	public Time getEnterTime() {
		return enterTime;
	}

	public void setEnterTime(Time enterTime) {
		this.enterTime = enterTime;
	}

	public Time getExitTime() {
		return exitTime;
	}

	public void setExitTime(Time exitTime) {
		this.exitTime = exitTime;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	

}

package v5;


public class RegularVehicle implements Vehicle {
	private String plate;
	
	public RegularVehicle(String plate) {
		isSpecial();
		this.plate = plate;
	}
	
	public boolean isSpecial() {
		return false;
	}

	@Override
	public String getPlate() {
		// TODO Auto-generated method stub
		return plate;
	}

	@Override
	public Subscription getSubscription() {
		return null;
	}
	
	
	
}

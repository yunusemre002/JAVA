package v5;


public class OfficialVehicle implements Vehicle {
	private String plate;

	public OfficialVehicle(String plate) {
		isSpecial();
		this.setPlate(plate);
	}

	@Override
	public String getPlate() {
		return plate;
	}

	@Override
	public Subscription getSubscription() {
		return null;
	}

	public boolean isSpecial() {
		return true;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}
	
}

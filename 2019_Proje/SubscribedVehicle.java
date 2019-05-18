package v5;


public class SubscribedVehicle implements Vehicle {
	private String plate;
	private Date begin;
	private Date end;
	private Subscription subscription;

	
	
	public SubscribedVehicle(String plate, Date begin, Date end) {
		this.plate = plate;
		subscription = new Subscription(begin, end, plate);
		isSpecial();
	}
	
	public boolean isValid() {
		Date d = new Date(Date.getToday().getDay(), Date.getToday().getMonth(), Date.getToday().getYear());
		if(d.isBeforeThan(begin) || d.isEqualsWith(begin)) {
			if(d.isAfterThan(end) || d.isEqualsWith(end))
				return true;
		}
		return false;
	}
	

	public boolean isSpecial() {
		return false;
	}

	@Override
	public Subscription getSubscription() {
		return subscription;
	}
	
	
	
	
	
	public String getPlate() {
		return this.plate;
	}
	
	public void setSubscription(Subscription sub) {
		this.subscription = sub;
	}

	
	public void setPlate(String plate) {
		this.plate = plate;
	}

}

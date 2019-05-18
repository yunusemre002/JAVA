package v5;

public class Subscription {
	private Date begin;
	private Date end;
	private SubscribedVehicle vehicle;
	
	public Subscription(Date begin, Date end, String plate) {
		this.begin = begin;
		this.end = end;
		//vehicle = new SubscribedVehicle(plate);
		//vehicle.setSubscription(new Subscription);
	}
	
	public boolean isValid() {
		Date d = new Date(Date.getToday().getDay(), Date.getToday().getMonth(), Date.getToday().getYear());
		if(d.isBeforeThan(begin) || d.isEqualsWith(begin)) {
			if(d.isAfterThan(end) || d.isEqualsWith(end))
				return true;
		}
		return false;
	}

	public Date getBegin() {
		return begin;
	}

	public void setBegin(Date begin) {
		this.begin = begin;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public SubscribedVehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(SubscribedVehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	

}

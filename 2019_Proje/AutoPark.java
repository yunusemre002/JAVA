package v5;

import java.util.ArrayList;

public class AutoPark {
	private ArrayList<SubscribedVehicle> subscribedVehicles;
	private double hourlyFee;
	private double incomeDaily;
	private int capacity;
	private ArrayList<ParkRecord> parkRecords;
	private int carCount;
	
	public AutoPark(double hourlyFee, int capacity) {
		this.hourlyFee = hourlyFee;
		this.capacity = capacity;
		subscribedVehicles = new ArrayList<SubscribedVehicle>();
		parkRecords = new ArrayList<ParkRecord>();
		carCount = 0;
	}
	
	public SubscribedVehicle searchVehicle(String plate) {
		for(SubscribedVehicle a : subscribedVehicles) {
			if(a.getPlate().compareTo(plate) == 0) {
				//System.out.println(a.getPlate() + " is in the subscription list");
				return a;
			}
		
		}
		//System.err.println(plate + " is not in the subscription list");
		return null;
	}
	
	public int getCarCount() {
		return carCount;
	}

	public boolean isParked(String plate) {
		for(ParkRecord pr : parkRecords) {
			if(pr.getVehicle().getPlate().compareTo(plate) == 0) {
				System.out.println(plate + " is parked");
				return true;
			}
		}
		//System.out.println(plate + " is not parked");
		return false;
	}
	
	@SuppressWarnings("unused")
	private void enlargeVehicleArray() {
		// Yunus Emre hoca ArrayList kullanmamiza izin vermistir. 
		// ArrayList dinamik oldugu icin bu metoda ihtiyac kalmamistir.
	}
	
	public boolean addVehicle(SubscribedVehicle v) {
		if(subscribedVehicles.isEmpty()) {
			subscribedVehicles.add(v);
			System.out.println(v.getPlate() + " added to the Subscribed Vehicles ArrayList");
			return true;
		}
		for(SubscribedVehicle a : subscribedVehicles) {
			if(v.getPlate().compareTo(a.getPlate()) == 0) {
				System.out.println(v.getPlate() + " is in the list");
				return false;
				
			}else{
				subscribedVehicles.add(v);
				System.out.println(v.getPlate() + " added to the Subscribed Vehicles ArrayList");
				return true;
			}
		}
		return false;
	}
	
	public boolean vehicleEnters(String plate, Time enter, boolean isSpecial) {
		if(carCount < capacity) {
			if(!isParked(plate)) {
				SubscribedVehicle v = searchVehicle(plate);
				if(v != null) {
					ParkRecord recordV = new ParkRecord(v, enter, null);
					parkRecords.add(recordV);	
				}else if(isSpecial) {
					OfficialVehicle ov = new OfficialVehicle(plate);
					ParkRecord recordV = new ParkRecord(ov, enter, null);
					parkRecords.add(recordV);		
				}else {
					RegularVehicle rv = new RegularVehicle(plate);
					ParkRecord recordV = new ParkRecord(rv, enter, null);
					parkRecords.add(recordV);
				}
				System.out.println(plate + " enters to the autopark");
				carCount++;
				return true;
			}
			System.out.println("There is a parked car with that plate.");
			return false;
		}
		System.out.println("There is no empty parking space, " + plate + " can't enter.");
		return false;
	}
	
	public boolean vehicleExits(String plate, Time exit) {
		for(ParkRecord pr : parkRecords) {
			if(pr.getVehicle().getPlate().compareTo(plate) == 0) {
				pr.setExitTime(exit);
				if(pr.getVehicle().isSpecial() == true) {
					System.out.println(pr.getVehicle().getPlate() + " is official, not paying.");
				}else if(pr.getVehicle().getSubscription() != null) {
					if(pr.getVehicle().getSubscription().isValid()) {
						System.out.println(pr.getVehicle().getPlate() + " is subscripted(valid), not paying.");
					}else{
						int parkdur = pr.getParkingDuration();
						if(parkdur <= 60)
							System.out.println(pr.getVehicle().getPlate() + " is subscripted(not valid), not paying(stayed less than one hour).");
						else {
							incomeDaily += (parkdur / 60) * hourlyFee;
							System.out.println(pr.getVehicle().getPlate() + " is subscripted(not valid), pays: " + (parkdur / 60) * hourlyFee);
						}
					}
				}else{
					int parkdur = pr.getParkingDuration();
					if(parkdur <= 60)
						System.out.println(pr.getVehicle().getPlate() + "is regular, not paying(stayed less than one hour).");
					else {
						incomeDaily += (parkdur / 60) * hourlyFee;
						System.out.println(pr.getVehicle().getPlate() + " is regular, pays: " + (parkdur / 60) * hourlyFee);
					}
				}
				carCount--;
				System.out.println(pr.getVehicle().getPlate() + " exits");
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		String a = null;
		String b = null;
		for(SubscribedVehicle v : subscribedVehicles) {
			a = a + ", " + v.getPlate();
		}
		
		for(ParkRecord pr : parkRecords) {
			b = b + ", " + pr.getVehicle().getPlate();
		}
		return "AutoPark \n subscribedVehicles = " + a + "\n hourlyFee = " + hourlyFee + "\n incomeDaily = "
		+ incomeDaily + "\n capacity = " + capacity + " \n parkRecords : " + b + "\n" + " carCount = " + carCount;
	}


}

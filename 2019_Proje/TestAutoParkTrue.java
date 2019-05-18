package v5;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.*;

//import junit.framework.Assert;

public class TestAutoParkTrue {

	AutoPark autopark = new AutoPark(10.5, 10);
	
	RegularVehicle r1 = new RegularVehicle("01 RE 01");
	RegularVehicle r2 = new RegularVehicle("02 RE 02");
	RegularVehicle r3 = new RegularVehicle("03 RE 03");
	
	OfficialVehicle o1 = new OfficialVehicle("01 OV 01");
	OfficialVehicle o2 = new OfficialVehicle("02 OV 02");
	OfficialVehicle o3 = new OfficialVehicle("03 OV 03");
	
	
	SubscribedVehicle s1 = new SubscribedVehicle("01 SV 01", new Date(13, 4, 2015), new Date(17, 5, 2019));
	SubscribedVehicle s2 = new SubscribedVehicle("02 SV 02", new Date(12, 4, 2023), new Date(16, 5, 2034));
	SubscribedVehicle s3 = new SubscribedVehicle("03 SV 03", new Date(13, 4, 2013), new Date(15, 5, 2015));
	
	
	@Before
	public void setUp() {
		
		autopark.addVehicle(s1);
		
		autopark.vehicleEnters(r1.getPlate(), new Time(16, 5), r1.isSpecial());
		autopark.vehicleEnters(o1.getPlate(), new Time(17, 5), o1.isSpecial());
		autopark.vehicleEnters(s1.getPlate(), new Time(16, 10), s1.isSpecial());
	}
	

	@Test
	public void testSearchVehicle() {
		
		SubscribedVehicle actual = autopark.searchVehicle("01 SV 01");
		
		assertEquals(s1, actual);
	}

	
	@Test
	public void testAddVehicle() {
	
		boolean actual = autopark.addVehicle(s2);
		
		assertEquals(true, actual);
	}

	@Test
	public void testIsParked() {

		boolean actual = autopark.isParked("01 RE 01");
		
		assertEquals(true, actual);
	}

	@Test
	public void testVehicleEnters() {
		
		boolean actual = autopark.vehicleEnters(r2.getPlate(), new Time(20, 25), r2.isSpecial());

		assertEquals(true, actual);
	}	
	
	@Test
	public void testVehicleExits() {
		
		boolean actual = autopark.vehicleExits(o1.getPlate(), new Time(18, 24));
		
		assertEquals(true, actual);
	}	
	
	@Test
	public void testGetCarCount() {
		int actual = autopark.getCarCount();
		
		assertEquals(3, actual);
	}
	
	

}


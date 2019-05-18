package v5;

//import java.util.Scanner;


public class Haz�rTestClass�DeneyIc�n {
	
	public static void main(String[] args) {
		
		AutoPark park = new AutoPark(5.5,50);
		
		RegularVehicle r1 = new RegularVehicle("01 RE 01");
		RegularVehicle r2 = new RegularVehicle("02 RE 02");
		RegularVehicle r3 = new RegularVehicle("03 RE 03");
		
		OfficialVehicle o1 = new OfficialVehicle("01 OV 01");
		OfficialVehicle o2 = new OfficialVehicle("02 OV 02");
		OfficialVehicle o3 = new OfficialVehicle("03 OV 03");
		
		
		SubscribedVehicle s1 = new SubscribedVehicle("01 SV 01", new Date(13, 4, 2015), new Date(17, 5, 2019));
		SubscribedVehicle s2 = new SubscribedVehicle("02 SV 02", new Date(12, 4, 2023), new Date(16, 5, 2034));
		SubscribedVehicle s3 = new SubscribedVehicle("03 SV 03", new Date(13, 4, 2013), new Date(15, 5, 2015));
		
		/*
		Subscription sub1 = new Subscription(new Date(13, 4, 2015), new Date(17, 5, 2019), "01 SV 01");
		Subscription sub2 = new Subscription(new Date(12, 4, 2014), new Date(16, 5, 2017), "02 SV 02");
		Subscription sub3 = new Subscription(new Date(13, 4, 2013), new Date(15, 5, 2015), "03 SV 03");

		
		park.addVehicle(sub1.getVehicle());
		park.addVehicle(sub2.getVehicle());
		park.addVehicle(sub3.getVehicle());*/
		
		park.addVehicle(s1);
		park.addVehicle(s2);
		park.addVehicle(s3);
		
		System.out.println("---------------------------------------------------------");
		
		
		park.vehicleEnters(s1.getPlate(), new Time(16, 5), s1.isSpecial());
		park.vehicleEnters(s2.getPlate(), new Time(16, 5), s2.isSpecial());
		park.vehicleEnters(s3.getPlate(), new Time(16, 5), s3.isSpecial()); 
		
		/*park.vehicleEnters(sub1.getVehicle().getPlate(), enter, false);
		park.vehicleEnters(sub2.getVehicle().getPlate(), enter, false);
		park.vehicleEnters(sub3.getVehicle().getPlate(), enter, false); */
		
		
		System.out.println("---------------------------------------------------------");
		
		park.vehicleEnters(r1.getPlate(), new Time(16, 5), r1.isSpecial());
		park.vehicleEnters(r2.getPlate(), new Time(16, 5), r2.isSpecial());
		park.vehicleEnters(r3.getPlate(), new Time(16, 5), r3.isSpecial());
		
		System.out.println("---------------------------------------------------------");
		
		park.vehicleEnters(o1.getPlate(), new Time(16, 5), o1.isSpecial());
		park.vehicleEnters(o2.getPlate(), new Time(16, 5), o2.isSpecial());
		park.vehicleEnters(o3.getPlate(), new Time(16, 5), o3.isSpecial());
		
		System.out.println("---------------------------------------------------------");

		park.isParked(s2.getPlate()); // 02 SV 02 otoparkta mi diye bakiyoruz.
		//park.isParked(sub2.getVehicle().getPlate());
		
		System.out.println("---------------------------------------------------------");
// 3 araba turu icin cýkýslar:
		park.vehicleExits(s1.getPlate(), new Time(17, 10)); // Subscripted olduðu için para ödemez
		//park.vehicleExits(sub1.getVehicle().getPlate(), exit);
		park.vehicleExits(o1.getPlate(), new Time(17, 10)); // Offical olduðu icin para odemez
		park.vehicleExits(r1.getPlate(), new Time(19, 10)); // regular oldugu icin para oder, odedigi para hesaplanýp sunulur
		
		System.out.println("---------------------------------------------------------");
		
		park.vehicleExits(s2.getPlate(), new Time(19, 10));
		//park.vehicleExits(sub2.getVehicle().getPlate(), exit2);
		park.vehicleExits(r2.getPlate(), new Time(21, 10));
		
		System.out.println("---------------------------------------------------------");
		
		park.vehicleExits(s3.getPlate(), new Time(17, 10));
		//park.vehicleExits(sub3.getVehicle().getPlate(), exit);
		park.vehicleExits(r3.getPlate(), new Time(17, 10));
		
		System.out.println("---------------------------------------------------------");
		
		System.out.println(park.toString()); 
	
		
		
		
	}

}

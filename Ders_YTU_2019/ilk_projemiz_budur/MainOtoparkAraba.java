package ilk_projemiz_budur;

public class MainOtoparkAraba {
	public static void main( String[] args) {
		
		Otopark otoparkim = new Otopark("Guven", 150, null);
		Araba arb1, arb2 = null, arb3 = null;
		
		arb1= new Araba("Mercedes", "34 AF 11");
		arb1= new Araba("Ford", "41 KK 59");
		arb1= new Araba("Mercedes", "57 PT 48");
		
		otoparkim.arabaEkle(arb1);
		otoparkim.arabaEkle(arb2);
		otoparkim.arabaEkle(arb3);

		otoparkim.otobarkTanit();
		otoparkim.arabaSil(otoparkim.otopark.indexOf(arb1));
		otoparkim.otobarkTanit();
	
	}
}
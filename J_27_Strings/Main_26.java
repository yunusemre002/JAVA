package J_27_Strings;

public class Main_26 {

	public static void main(String[] args) {
		
		String s1 = "Yunusemre";  // Boyle yazınca ana bellekte bir sabit yaratıyoruz gibi oluyor.
		String s2 = "Yunusemre";  // Ve bu sabiti s2 de gösteriyor. Yani s1 ve s2 referansı aynı yeri gösteriyor.
									// Yani java bellekte "Yunusemre" diye bir sabit oluşturdu ve bu değere sahip olan referans aynı yeri gösteren
		String s3 = new String("Yunusemre");
		String s4 = new String("Yunusemre");

		
		System.out.println("s3 un karakter sayisi : "+ s3.length());
		
		System.out.println("\n'Yunusemre' dizisinin ");
		System.out.println("  1. karakteri :"+ s3.charAt(0));
		System.out.println("  3. karakteri :"+ s3.charAt(2));
		System.out.println("  sonuncu karakteri :"+ s3.charAt(s3.length()-1));
		System.out.println("  sondan bir önceki karakteri :"+ s3.charAt(s3.length()-2));

		System.out.println("\n  Yu ile mi başlar : "+ s3.startsWith("Yu"));
		System.out.println("  re ile mi biter  : "+ s3.endsWith("mre"));
		System.out.println("  fa ile mi biter  : "+ s3.endsWith("fa"));
		
			if( s1==s2 )		// aynı yeri gösteriyor mu?  Evet aynı yeri gösteriyor, point ediyor.
				System.out.println("\ns1==s2? aynı yeri point ediyor.");
			else
				System.out.println("s1==s2? Farklı yeri point ediyor.");
			
			if( s1.equals(s2) )		//  içerik aynı mı?
				System.out.println("s1.equals(s2) aynı içerik.");
			else
				System.out.println("s1.equals(s2) Farklı içerik.");
			
		
			
		if( s1==s3 )		// içindeki değeri değil aynı yeri gösteriyor mu diye soruyoruz. evet aynı yeri gösteriyor.
			System.out.println("\ns1 ve s2 aynı yeri point ediyor.");
		else
			System.out.println("\ns1 ve s3 Farklı yeri point ediyor.");
		
		if( s1.equals(s3) )		//  içerik aynı mı?
			System.out.println("s1.equals(s3) aynı içerik.");
		else
			System.out.println("s1.equals(s3) Farklı içerik.");
		
		
			/*	Aynı yeri mi point ediyor derken == içleri eşit mi derken .equals() diyoruz*/
			if( s3==s4 )		// içindeki değeri değil aynı yeri gösteriyor mu diye soruyoruz. evet aynı yeri gösteriyor.
				System.out.println("\ns3==s4? aynı yeri point ediyor.");
			else
				System.out.println("\ns3==s4? Farklı yeri point ediyor.");
			
			if( s3.equals(s4) )		// içindeki değeri değil aynı yeri gösteriyor mu diye soruyoruz. evet aynı yeri gösteriyor.
				System.out.println("s3.equals(s4)? aynı içerik.");
			else
				System.out.println("s3.equals(s4)? Farklı içerik.");
			
	}
}

package J_22_Referances;


/* car1 adında bir refarans yaratıyorum bu referas = pointer  
 *	new Car("Blue", "Opel Astra", 1.5, 5); //Bu, bellekte obje yaratır 
 *  Car car1 = // bu ise referans=şointer yaratır ve obje pointere atanır.
 *  sonuçta car1 pointerı bellekte yaratılan astra objesini referans=point eder.
 */
public class Main_22 {

	public static void main(String[] args) {

	Car car1 = new Car("Blue", "Opel Astra", 1.5, 5);  // new car dan sonrası bellekte bir obje oluşturuyor opel markalı vs.
						// car1 ise bellekte oluşturulan objeyi referans=point ediyor.
	Car car2 = car1;
						// car2 = car1 dediğimizdede burada car2 pointer=referans buda car1 in referans ettiği yeri referans etsin diyoruz.
						// Dolayısıyla car2 de üst tarafta oluşturulan new Car astra objesini referans ediyor.
	car1.showInfos();
	car2.showInfos();
	// görüldüğü üzre ikisininde verdiği yanıt aynı
	
	/*
	Car car3;			//böyle dersem bir referans yaratmış ama bu referansın göstereceği birşey vermemiş olurum. dolayısıyla initilation arızası vermekte.
	car3.showInfos();
	
	Car car4 = null;		// Burada bu referans bellekte boş(null) biryeri gösteriyor. 
	car4.showInfos();		// Dolayısıyla buraya kadar olan programın çalışmasını engellemşyor ama sonrakini engeller null exception hatası veriyor.
							// (Exception in thread "main" java.lang.NullPointerException) 
							// Bu hata referasın gösterdiği null boş demek.
	*/
	
	//-----------------------------------------------------------------------------------------------------------------
	String s1 = new String("yunusemre");
	String s2 = new String("yunusemre");
	if( s1 == s2 )									// Böyle diyince referansların gösterdiği yere bakıyor. Referansların içeriğine bakmıyor.
		System.out.println("s1==s2? ayni");			// There are two different object and there are two different pointer. All of thet point different object so there isn't same 
	else											// This dosn't look inside of them. This just search that even if point the same location because s1 and s2 are a pointer.
		System.out.println("s1==s2? farklılar \n");
	
	if( s1.equals(s2) )								
		System.out.println("s1.equals(s2) YES");		
	else											
		System.out.println("s1.equals(s2) NO");
	
	}
}

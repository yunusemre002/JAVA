package J_31_Object_toString;
/* Bizim tum classlarımın var olan bir Object classından turemektedir.
 * Yani bizim emplooyee ve manger classımız aynı zamanda object classından türemiştir.
 */
public class Main_31 {

	public static void main(String[] args) {

		Manager mng = new Manager("Ibrahim KORKMAZ", "Computer", 7500, 100);
	
		System.out.println(mng);	// Böyle diyince Object sınıfı içindeki toString çalıstirilir 
		System.out.println(mng.toString());		// Buradaki toString metodunu Manager clasının içine gidip override edebiliriz.
												//
	}
}

package J_38_Static;
/*
 * Statik bir obje memoryde bir kez yaratılır.
 * 
 */
public class Student {

	public static int number_of_student = 0;
	
	public Student() {		//Constructure olurşturdum ki bu constructure her bir obje yaratıldığında otomatikman ogrenci sayisini bir arttiracak.
		number_of_student ++;
	}
	
	
	public static String deneme1() {
		return "studentten dondum.";
	}
	
}

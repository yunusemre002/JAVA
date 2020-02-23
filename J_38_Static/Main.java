package J_38_Static;
/*
 * Main metodumuzu static yazrız ve staticolması sebebiyle bu metod bellekte 1 kez oluşturulur. ve sabitttir.
 * Main metod içinden (yani statik bir metod ) Bu classımızın içinde static olmayan bir metoda erişim yapılamaz ancak ve ancak
 * oluşturulan değier metodda static olurs a main metodumuzdan ilgili metodlara (static) ulaşabilinir.
 * statik bir metod statik olmayan bir metodu çağıramaz. 
 */
public class Main {
	
	public static void deneme() {						//when Static keyword is deleted, main method doesn't run 
		System.out.println("This is an examlple...");
	}
	
	public static void main(String[] args) {
		deneme();
	/*	
	Student std1 = new Student();
	Student std2 = new Student();
	Student std3 = new Student();
	
	System.out.println("Number of students (top)");
	System.out.println(std1.number_of_student);
	System.out.println(std2.number_of_student);
	System.out.println(std3.number_of_student);
	*/// Bunlara gerek yok illa bir obje oluşturmama gerek yok 
		
	
	System.out.println(Student.number_of_student +" \n" + Student.deneme1());
		
	/*
	 * Eğer deneme1 metodu static olmasaydı mutlaka bir obje yaratmak zorunda olacaktım.
	 */
		
	}
}

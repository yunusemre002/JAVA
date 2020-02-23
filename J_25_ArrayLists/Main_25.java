package J_25_ArrayLists;
import java.util.ArrayList;
/* Array ile arraylist arasındaki en önemli farklardan bir tanesi arraylist dinamiktir. Array ise dinamiktir.
 * Yani oluştururken sınırları belliri 5 elemanlı 6 elemanlı gibi. Arraylistte bir sınır yok eklersen açılır 
 * silersen azalır. Ve kendine has bazı fonksiyonları vardır onları . ile ogrenirsin.
 */
public class Main_25 {

	public static void main(String[] args) {
		/*
		String[] a = {"lal", "kak", "pencere"};
		String[] b = new String[5];
		for (int i = 0; i < a.length; i++) 
			System.out.println(a[i]);
		*/
		
		ArrayList<String> lists = new ArrayList<String>(); // Buradaki lists bir referanstır. yeni bir arraylist yarattık orayı refere ediyor.
		
		lists.add("Grup Yorum");
		lists.add("Tarkan");
		lists.add("Karacoglan");
		lists.add("Yunus Emre");
		lists.add("Malatyali\n");
		
		for (int i = 0; i < lists.size() ; i++) {
			System.out.println(i +". "+ lists.get(i));
		}
		
		lists.remove("Tarkan");
		//lists.remove(1);  // da diyebilirsin remove metodu icin overloading yapılmış iki yöntemlede calisir.
		
		for (int i = 0; i < lists.size() ; i++) {
			System.out.println(i +". "+ lists.get(i));
		}
	}
}

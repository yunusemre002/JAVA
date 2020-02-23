package J_26_ForEach;
import java.util.ArrayList;
public class Main_26 {

	public static void main(String[] args) {
		
		ArrayList<String> lists = new ArrayList<String>();
		int[] arr1 = {10, 20, 30, 40, 50, 60, 70, 80,};
		
		lists.add("Grup Yorum");
		lists.add("Ali");
		lists.add("Hüseyin");
		lists.add("Metalica");
		
		for(String s:lists ) {			// list dizindeki her bir string = s olsun.
			System.out.println(s);
		}
		System.out.println();
		
		for(int a:arr1) {				// arr1 dizisindeki herbir sayı = a olsun.
			System.out.println(a);
		}
		
	}
	
}



//HAZIR STRING METODLARININ KULLANIMI str1.compareTo(str2);
package Calismalar_3;
 
public class StringOps {
	public static void main( String args[] ) { 
		String strA, strB, strC;
		
		strA = "A string!"; 
		strB = "This is another one."; 
		strC = "A string!";
	
			System.out.println(strA.compareTo(strB)); 
			System.out.println(strA.compareTo(strC));
		
		if(strC.compareTo(strA)==0) 
			System.out.println("strC = strA");
		else
			System.out.println("strC != strA");
		
		
		if(strA.compareTo(strB)==0) 
			System.out.println("strA = strB");
		else
			System.out.println("strA != strB ");
		
		} 
	}
package J_23_Arrays;

import java.util.Scanner;

public class Main_23 {

	public static double mean(int[] arr) {		// This method finds mean of given array.
		double top=0;
		for (int i = 0; i < arr.length; i++) {
			top += arr[i]; 
		}
		return (top/arr.length);
	}
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
		
	int[] arr1 = {10, 20, 30, 40, 50, 60, 70};	// Burada arr1 adlı pointer yaratıp hemen bellekte oluşturduğumuz 7 elemanlı bir diziyi point ettirdik.
	int[] arr2 = new int[5];	// Boş ve 5 field içeren bir  array yarattım. Ve arr2 pointerı ile point ettim.
	int[] arr3 = new int[5];
	
	arr2[0]=1;
	arr2[1]=2;
	arr2[2]=3;
	arr2[3]=4;
	arr2[4]=5;
	
	System.out.println("arr1 in 3. elemanı: " + arr1[2]);
	System.out.println("arr2 in 3. elemanı: " + arr2[2]);
	
	for(int i=0; i<arr1.length; i++) {
		System.out.println("arr1["+i+"] :" + arr1[i] );
	}
	
	System.out.println("\narr3 için değerleri giriniz...");
	for (int i = 0; i < arr3.length; i++) {
		arr3[i] = scan.nextInt();	
	}
	System.out.println("arr3 için değerler alınıyor...");
	
	for (int i = 0; i < arr3.length; i++) {
		System.out.println("arr3["+i+"] :" + arr3[i] );
	}

	System.out.println("arr3 dizisini ortalaması :" + mean(arr3)); // We want to calculate mean of yhe arr3 and we send arr3 to mean fonk.
	
	}
}

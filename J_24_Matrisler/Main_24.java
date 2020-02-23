package J_24_Matrisler;

import java.util.Scanner;

public class Main_24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] arr1 = {{10, 20, 30}, {40, 50, 60}};
		int[][] arr2 = new int[2][3];
		int[][] arr3 = new int [2][3];
		
		arr2[0][0] = 1;
		arr2[0][1] = 2;
		arr2[0][2] = 3;
		arr2[1][0] = 4;
		arr2[1][1] = 5;
		arr2[1][2] = 6;
	
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("arr1["+i+"]" +"["+j+"] :" +  arr1[i][j] );
			}	
		}
		
		System.out.println();
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("arr2["+i+"]" +"["+j+"] :" +  arr2[i][j] );
			}	
		}
		
		System.out.println("Arr3 matrisinin elemanlarını giriniz.");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				arr3[i][j] = scan.nextInt();
			}	
		}
		
		
		System.out.print("Arr3 matrisi:");
		for (int i = 0; i < 2; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {
				System.out.print(arr3[i][j] + " ");
			}	
		}
		
	}
}

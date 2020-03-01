package J_01_17;

public class J_12_for {
	public static void main(String[] args) {
		
		int sayi;
		for(sayi =0 ; sayi<10 ; sayi++) {
			System.out.print(sayi + " ");
		}
		System.out.println();
		
		for(int i=0 ; i<5 ; i++)
			for(int j=0 ; j<5 ; j++)
				System.out.println("i:"+i+" j:"+j);
		
		//aynı işi while ilede yaparız ama daha uzun sürer ve karışık
		
		int k=0,l=0;
		while(k<5) {
			while(l<5) {
				System.out.println("k:"+k+" l:"+l);
				l++;
			}
			l=0; // çünkü biri bunu sıfırlamalı
		k++;
		}
		
		for(int i=0 ; i<5 ; i++) {
			System.out.println();
			for(int j=0 ; j<5 ; j++) {
				System.out.print(i + " ");
			}	
		}
		
	}	
}

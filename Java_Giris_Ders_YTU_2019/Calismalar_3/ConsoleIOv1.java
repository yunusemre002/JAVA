package Calismalar_3;

import java.util.Scanner;

public class ConsoleIOv1{

	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);  //Scanner lale de diyebilirsin ama sondak system.in sabittir.
		
		System.out.print("What is your name?");
		String name = in.nextLine();
		
		System.out.print("How old are you?");
		int age = in.nextInt();				//ATTANTÝON SAYI GIRILMELI
		
		// Sayidan sonra karakter okundugunda arýza verir. Cozumude aralarýna bos bir nextLine(); yazmaktýr 
		in.nextLine(); // Ýmportant
		
		System.out.print(" What is your favoriate food ? ");
		String food = in.nextLine();
		
		System.out.println("\nHello "+ name + ". Next year you will be "+ (age + 1 ) + "." );
		System.out.println( food +" is good food bro");
		in.close();
	}
	
}

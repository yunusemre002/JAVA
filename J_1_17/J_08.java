package J_1_17;

import java.util.Scanner;

public class J_8 {
	
	static public void main(String[] args) {
		
		/* Kosullarda Baglaclar 
			! Not		|| or		&& and		*/ 
		
		System.out.println("5<6 && yazi==yazi : " + ((5<6) && ("yazi"=="yazi")));
		System.out.println("5<5 && yazi==yazi : " + ((5<5) && ("yazi"=="yazi")));
		System.out.println("5<5 || yazi==yazi : " + ((5<5) || ("yazi"=="yazi")));
		
		
		String user_name = "Jared";
		String user_password = "12345";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter  Username : ");
		String u_name = scan.nextLine();
		
		System.out.println("Password :");
		String u_pwd = scan.nextLine();
		
		if (  !(u_name.equals(user_name))  && !(u_pwd.equals(user_password)) )
			System.out.println("İncorrect username and password");
		else if(  !(u_name.equals(user_name)) && u_pwd.equals(user_password) )
			System.out.println(" İncorrect username");
		else if(  u_name.equals(user_name) && !(u_pwd.equals(user_password)) )
			System.out.println(" İncorrect password");
		else
			System.out.println("Successfully entrance Welcome...");
	}

}

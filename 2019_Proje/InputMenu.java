package v5;

/*import java.util.Scanner;

public class InputMenu{
	

	public static AutoPark park = new AutoPark(5.5,50);
	    
	public void display_menu(){
		System.out.println("1) Vehicle enters autopark");
		System.out.println("2) Vehicle exits autopark");
		System.out.println("3) Print autopark");
		System.out.println("4) Is parked");
		System.out.println("5) Search vehicle in subscription list");
		System.out.println("6) How many cars in the autopark");
		System.out.print("Selection: ");
	}
	    
	public void question(){
		System.out.println("To proceed enter [9] & to quit enter [0]");
		@SuppressWarnings("resource")
		Scanner q = new Scanner(System.in);
		
		switch (q.nextInt()) 
		{
		    case 0:
		    	System.out.println ("Thank you and godbye.");
		    	break;
		    case 9:
		    	System.out.println ("Please proceed.");
		    	new InputMenu();
		    	break;
		    default:
		    	System.err.println ( "Unrecognized option, please select recognized one \n" );
		    	question();
		    	break;
		}
	}
	 
	public InputMenu(){
		
		
		
		Scanner in = new Scanner(System.in);
	    display_menu();
	  
		switch (in.nextInt()){
		    case 1:
		    	System.out.println ( "What is the Vehicle type?  for Regular enter[1] & Official  enter[2] & Subscribe enter[3]" );
		    	//Scanner secim1 = new Scanner(System.in);
		    
			    switch (in.nextInt()) {
				    case 1:
				    	//System.out.println ( "How many car you will enter" );
				    	//int kacaraba =  in.nextInt();
				    	in.nextLine(); // Ã�mportant  sayidan sonra karaktero kumak iÃ§in
					    System.out.println ( "For Regular Vehicle, Enter the Plaka" );
					    String name = in.nextLine();
					    System.out.println ( "For Regular Vehicle, Enter the hour" );
					    int hour = in.nextInt();
					    System.out.println ( "For Regular Vehicle, Enter the minute" );
					    int minute = in.nextInt();
					    in.nextLine();
					    Time enter = new Time(hour, minute);
					    RegularVehicle ri = new RegularVehicle(name);
					    park.vehicleEnters(name, enter, ri.isSpecial());
					    System.out.println(ri.getPlate());
				    	
				    	question();
				    	break;
			  
				    case 2:
				    	in.nextLine(); 
				    	System.out.println ( "For Official Vehicle, Enter the Plaka" );
				    	String name1 = in.nextLine();
					    System.out.println ( "For Official Vehicle, Enter the hour" );
					    int hour1 = in.nextInt();
					    System.out.println ( "For Official Vehicle, Enter the minute" );
					    int minute1 = in.nextInt();
					    in.nextLine();
					    Time enter1 = new Time(hour1, minute1);
					    OfficialVehicle ov = new OfficialVehicle(name1);
					    park.vehicleEnters(name1, enter1, ov.isSpecial());
					    System.out.println(ov.getPlate());
				    	question();
				    break;
			  
				    case 3:
				    	in.nextLine(); 
				    	System.out.println ( "For Subscripted Vehicle, Enter the Plaka" );
				    	String name2 = in.nextLine();
				    	System.out.println ( "For Subscripted Vehicle, Enter the begin date" );
				    	System.out.println ( "For Subscripted Vehicle, Enter the begin day" );
				    	int day = in.nextInt();
				    	System.out.println ( "For Subscripted Vehicle, Enter the begin month" );
				    	int month = in.nextInt();
				    	System.out.println ( "For Subscripted Vehicle, Enter the begin year" );
				    	int year = in.nextInt();
				    	System.out.println ( "For Subscripted Vehicle, Enter the end date" );
				    	System.out.println ( "For Subscripted Vehicle, Enter the end day" );
				    	int day2 = in.nextInt();
				    	System.out.println ( "For Subscripted Vehicle, Enter the end month" );
				    	int month2 = in.nextInt();
				    	System.out.println ( "For Subscripted Vehicle, Enter the end year" );
				    	int year2 = in.nextInt();
					    System.out.println ( "For Subscripted Vehicle, Enter the hour" );
					    int hour2 = in.nextInt();
					    System.out.println ( "For Subscripted Vehicle, Enter the minute" );
					    int minute2 = in.nextInt();
					    in.nextLine();
					    Time enter2 = new Time(hour2, minute2);
					    Date begin = new Date(day, month, year);
					    Date end = new Date(day2, month2, year2);
					    SubscribedVehicle s = new SubscribedVehicle(name2, begin, end);
					    park.addVehicle(s);
					    park.vehicleEnters(name2, enter2, s.isSpecial());
				    	question();
				    	break;
				    	
				    default:
				    	System.err.println ( "Unrecognized option, please select recognized one \n" );
				    	new InputMenu();
				    	break;
				}
		    //question();
		    break;
	  
		    case 2:
		    	in.nextLine(); 
		    	System.out.println ( "Enter the plate" );
		    	String plate = in.nextLine();
			    System.out.println ( "Enter exit hour" );
			    int hour = in.nextInt();
			    System.out.println ( "Enter exit minute" );
			    int minute = in.nextInt();
			    in.nextLine();
			    Time exit = new Time(hour, minute);
			    park.vehicleExits(plate, exit);
		    	question();
		    	break;
	  
		    case 3:
		    	in.nextLine(); 
		    	System.out.println(park.toString());
		    	question();
		    	break;
		    
		    case 4:
		    	in.nextLine(); 
		    	System.out.println ( "Enter the plate" );
		    	String plate1 = in.nextLine();
		    	park.isParked(plate1);
		    	question();
		    	break;		
		   
		    case 5:
		    	in.nextLine(); 
		    	System.out.println ( "Enter the plate" );
		    	String plate2 = in.nextLine();
		    	park.searchVehicle(plate2);
		    	question();
		    	break;	
		    	
		    case 6:
		    	in.nextLine(); 
		    	System.out.println(park.getCarCount() + " car is in the autopark right now");
		    	question();
		    	break;
		    default:
		    	System.err.println ( "Unrecognized option, please select recognized one \n" );
		    	new InputMenu();
		    	break;
		}
		in.close();
	}
	 
	 public static void main (String[]args){
	   
		new InputMenu();
	 }
	    
}*/



import java.util.Scanner;

public class InputMenu{


	RegularVehicle[] RegularVehicledizi = new RegularVehicle[5];
	OfficialVehicle[] officialVehicles = new OfficialVehicle[5];
	SubscribedVehicle[] subscribedVehicles = new SubscribedVehicle[5];
	public static AutoPark park = new AutoPark(5.5,50);
	
	public void display_menu(){
		System.out.println("[1] Vehicle Enters Autopark");
		System.out.println("[2] Vehicle Exits Autopark");
		System.out.println("[3] List Autopark");
		System.out.println("[4] Is Parked");
		System.out.println("[5] Search Vehicle in subscription list");
		System.out.println("[6] How many cars in the autopark");
		System.out.println("[7] Exit procces");

		System.out.print("Selection: ");
	}
	
	public InputMenu(){
		
		
		Scanner in = new Scanner(System.in);
	    display_menu();
	    
		switch (in.nextInt()){
		    case 1:
		    	System.out.println ( "\nWhat is the Vehicle type?\n    [1]Regular \n    [2]Official   \n    [3]Subscribe enter" );
			    switch (in.nextInt()) {
				    case 1:
				    	System.out.println ( "How many car you will enter" );
				    	int sayi =  in.nextInt();
				    	in.nextLine(); // Ã�mportant  sayidan sonra karaktero kumak iÃ§in
				    	for(int i=0; i<sayi ; i++) {
				    		System.out.print( "For " + (i+1) + ". vechile, Enter the Plaka: " );
						    String name = in.nextLine();
						    System.out.print( "For" + (i+1) + ". Regular Vehicle, Enter the hour: " );
						    int hour = in.nextInt();
						    System.out.print( "For " + (i+1) + ". Regular Vehicle, Enter the minute: " );
						    int minute = in.nextInt();
						    in.nextLine();
						   
						    Time enter = new Time(hour, minute);
						    RegularVehicledizi[i] = new RegularVehicle(name);
						    park.vehicleEnters(name, enter, RegularVehicledizi[i].isSpecial());
						    
				    	}
				    	//System.out.println(park.toString()); 
				    	System.out.println();
				    	new InputMenu();
				    	break;
				    case 2:
				    	System.out.println ( "How many car you will enter" );
				    	int sayi1 =  in.nextInt();
				    	in.nextLine(); // Ã�mportant  sayidan sonra karaktero kumak iÃ§in
				    	for(int i=0; i<sayi1 ; i++) {
				    		in.nextLine(); 
					    	System.out.print( "For Official Vehicle, Enter the Plaka: " );
					    	String name1 = in.nextLine();
						    System.out.print( "For Official Vehicle, Enter the hour: " );
						    int hour1 = in.nextInt();
						    System.out.print( "For Official Vehicle, Enter the minute: " );
						    int minute1 = in.nextInt();
						    in.nextLine();
						    Time enter1 = new Time(hour1, minute1);
						    officialVehicles[i] = new OfficialVehicle(name1);  
						    park.vehicleEnters(name1, enter1, officialVehicles[i].isSpecial());
				    	}
				    	//System.out.println(park.toString()); 
				    	new InputMenu();
				    break;
			  
				    case 3:
				    	System.out.println ( "How many car you will enter" );
				    	int sayi2 =  in.nextInt();
				    	in.nextLine(); // Ã�mportant  sayidan sonra karaktero kumak iÃ§in
				    	for(int i=0; i<sayi2 ; i++) {
					    	in.nextLine(); 
					    	System.out.print( "For Subscripted Vehicle, Enter the Plaka: " );
					    	String name2 = in.nextLine();
					    	System.out.println( "For Subscripted Vehicle, Enter the begin date" );
						    	System.out.print( "	For Subscripted Vehicle, Enter the begin day: " );
						    	int day = in.nextInt();
						    	System.out.print ( "	For Subscripted Vehicle, Enter the begin month: " );
						    	int month = in.nextInt();
						    	System.out.print( "	For Subscripted Vehicle, Enter the begin year: " );
						    	int year = in.nextInt();
					    	System.out.println ( "For Subscripted Vehicle, Enter the end date: " );
						    	System.out.print ( "	For Subscripted Vehicle, Enter the end day: " );
						    	int day2 = in.nextInt();
						    	System.out.print( "	For Subscripted Vehicle, Enter the end month: " );
						    	int month2 = in.nextInt();
						    	System.out.println ( "For Subscripted Vehicle, Enter the end year: " );
						    	int year2 = in.nextInt();
						    System.out.print( "For Subscripted Vehicle, Enter the hour: " );
						    int hour2 = in.nextInt();
						    System.out.print( "For Subscripted Vehicle, Enter the minute: " );
						    int minute2 = in.nextInt();
						    in.nextLine();
						    Time enter2 = new Time(hour2, minute2);
						    Date begin = new Date(day, month, year);
						    Date end = new Date(day2, month2, year2); 
						    subscribedVehicles[i] = new SubscribedVehicle(name2, end, begin);
						    park.vehicleEnters(name2, enter2,  subscribedVehicles[i].isSpecial());
				    	}
				    	System.out.println();
				    	new InputMenu();
				    	break;
				    default:
				    	System.err.println ( "Unrecognized option, please select recognized one \n" );
				    	System.out.println();
				    	new InputMenu();
				    	break;
				}
			    System.out.println();
			    new InputMenu();
			    break;
	  
		    case 2:
		     	in.nextLine(); 
		    	System.out.println ( "Enter the plate" );
		    	String plate = in.nextLine();
			    System.out.println ( "Enter exit hour" );
			    int hour = in.nextInt();
			    System.out.println ( "Enter exit minute" );
			    int minute = in.nextInt();
			    in.nextLine();
			    Time exit = new Time(hour, minute);
			    park.vehicleExits(plate, exit);
			    System.out.println();
			    new InputMenu();
		    	break;
		    	
		    case 3:
		    	in.nextLine(); 
		    	System.out.println(park.toString());
		    	System.out.println();
		    	new InputMenu();
		    	break;
		    	
		    case 4:
		    	in.nextLine(); 
		    	System.out.println ( "Enter the plate" );
		    	String plate1 = in.nextLine();
		    	if (park.isParked(plate1)==false)
	    			System.err.println(" This car couldn't find here");
		    	System.out.println();
		    	new InputMenu();
		    	break;		
		   
		    case 5:
		    	in.nextLine(); 
		    	System.out.println ( "Enter the plate" );
		    	String plate2 = in.nextLine();
		    	
		    	SubscribedVehicle v = park.searchVehicle(plate2);
				if(v != null) 
					System.out.println("I found it");
		    	else
		    		System.err.println("this cannot find");
		    	System.out.println();
		    	new InputMenu();
		    	break;	
		    	
		    case 6:
		    	in.nextLine(); 
		    	System.out.println(park.getCarCount() + " car is in the autopark right now");
		    	System.out.println();
		    	new InputMenu();
		    	break;
		    	
		    case 7:
		    	System.out.println("Thank Good Bye");
		    	break;
		    	
		    default:
		    	System.err.println ( "Unrecognized option, please select recognized one \n" );
		    	System.out.println();
		    	new InputMenu();
		    	break;
		}
		in.close();
	}
	 
	 public static void main (String[]args){
	   
		new InputMenu();
	 }
	    
}




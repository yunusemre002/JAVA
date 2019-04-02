package Lab1_Yed;

import java.util.ArrayList;

public class Class_s {
	private int capasity;
	private String numberOfDoor;
	private ArrayList<Student> desk;
	
	
	public Class_s() {
	}

	public Class_s(int capasity, String numberOfDoor, ArrayList<Student> desk) {
		super();
		this.capasity = capasity;
		this.numberOfDoor = numberOfDoor;
		this.desk = desk;
	}

	public int getCapasity() {
		return capasity;
	}

	public void setCapasity(int capasity) {
		this.capasity = capasity;
	}

	public String getNumberOfDoor() {
		return numberOfDoor;
	}

	public void setNumberOfDoor(String numberOfDoor) {
		this.numberOfDoor = numberOfDoor;
	}

	public ArrayList<Student> getDesk() {
		return desk;
	}

	public void setDesk(ArrayList<Student> desk) {
		this.desk = desk;
	}
	
	public boolean isItEmty() {
		if( desk.size() < capasity)
			return true;
		else
			return false;
	}

	public String addStudent(Student student) {
		if(isItEmty()) {
			desk.add(student);
			return student.getStudentNo();
		}
		else {
			System.out.println(" The capasity of class is full, so it couldn't add! ");
			return null;
		}
	}
	
	
	public String removeStudent( String nameSurname) {
		for( Student student : desk )	// for each : burada desk arraylistimizin sonuna kadar tüm öðrencileri tek tek ele alalým denmektedir.
			if( student.getNameSurname().compareTo(nameSurname)==0) { // Burada ilk öðrencimzle metodun aldýðý string eþitse 0 döner
				desk.remove(student);
				return student.getStudentNo();
			}
		return null;  // bu null: metod illa birþey dönecek diye yazýldý. fordan ýktýktan sonra hiç return yapmadýysa diye
	}
	
	public int freeCapasityOfClass() {
		return capasity - desk.size();
	}
	
	
	public String infoClass_s() {
		String info = "Name of Class : "+ this.numberOfDoor + "      " + "Capacity of class : " + this.capasity+ " \nDesk :" + "\n";  
		for(Student student : desk ) 
			info += student.writeInfos() + "\n" ; // burada bir indo düþünki 10 satýr 9 satýrý öðrenci bilgileri oluþturuyor.
		return info;
		
	}
	
}

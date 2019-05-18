package Lab1_Yed;

public class Student {
	private String studentNo;
	private String  nameSurname;
	private int birthDay;
	
	
	
	public Student() {
	}


	public Student(String studentNo, String nameSurname, int birthDay) {
		super();
		this.studentNo = studentNo;
		this.nameSurname = nameSurname;
		this.birthDay = birthDay;
	}


	public String getStudentNo() {
		return studentNo;
	}


	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}


	public String getNameSurname() {
		return nameSurname;
	}


	public void setNameSurname(String nameSurname) {
		this.nameSurname = nameSurname;
	}


	public int getBirthDay() {
		return birthDay;
	}


	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
	
	public String writeInfos() {
		String info = studentNo + " " + nameSurname + " " + birthDay ;  // this yazmak zorunda mýsýn bir bak istersen?
		return info;
	}
	
}



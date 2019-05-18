package Lab1_Yed;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
   
        Scanner intro = new Scanner(System.in);
        
        Student std1 = new Student("123456","Yunus Emre DEMIR", 1995);
        Student std2 = new Student("789987", "Lale INTIZAR", 1994);
        Student std3 = new Student("654456", "Jhone CLOUD", 1990);
        
        Class_s class1 = new Class_s();
	        System.out.println("Give a capasity of class");
	       	class1.setCapasity(intro.nextInt());
	        System.out.println("Give Name Of Class");
	        class1.setNumberOfDoor(intro.next());
        
        ArrayList<Student> a = new ArrayList<Student>(); // bu Class_s sýnýfý içindeki desk e tekabül etmektedir.
        	a.add(std1);
        	a.add(std2);
        	a.add(std3);
        
        class1.setDesk(a); // burada desk'e eþit olan a'yý oluþturduumuz class_s cinsindeki class1 e koyduk.
        System.out.println(class1.infoClass_s());// class classýndaki info metodumuzu çaðýrdýk.
        
        Student std4 = new Student("321123","Emirhan ATABAYEV", 1995);
	    Student std5 = new Student("741147", "KAAN DURDALIYEV", 1994);
	    Student std6 = new Student("852258", "Jack TREE", 1990);
        
        class1.addStudent(std4);
        class1.addStudent(std5);
        class1.addStudent(std6);
        System.out.println(class1.infoClass_s());
      
        
        intro.close();
    }
}

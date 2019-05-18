
package Lab1_Mustafa;

import java.util.ArrayList;
import java.util.Scanner;

public class Ana {

    public static void main(String[] args) {
    	
        Scanner intro = new Scanner(System.in);
        Ogrenci ogr1 = new Ogrenci("123456","Mustafa Aydin",1998);
        Ogrenci ogr2 = new Ogrenci("234567","Aizhan Maksatbekkyzy",1998);
        Ogrenci ogr3 = new Ogrenci("345678","Furkan Cakmak",1990);
        Sinif sinif1 = new Sinif();
       
        System.out.println("Sinif kapasitesini girin");
        sinif1.SetKapasite(intro.nextInt());
        System.out.println("Sinif kapi numarasini girin");
        sinif1.SetKapiNo(intro.next());
        
        ArrayList<Ogrenci> a = new ArrayList<Ogrenci>();
        a.add(ogr1);
        a.add(ogr2);
        a.add(ogr3);
        
        sinif1.SetSandalye(a);
        System.out.println(sinif1.SinifTanit());
        
        Ogrenci ogr4 = new Ogrenci("456789","Enes Tezcan",1998);
        Ogrenci ogr5 = new Ogrenci("567890","Semih Durmaz",1998);
        Ogrenci ogr6 = new Ogrenci("678901","Arda Turan",1990);
      
        sinif1.OgrenciEkle(ogr4);
        sinif1.OgrenciEkle(ogr5);
        sinif1.OgrenciEkle(ogr6);
        System.out.println(sinif1.SinifTanit());
       
        //sinif1.OgrenciCikar("Furkan Cakmak");
        //System.out.println(sinif1.SinifTanit());
        
        intro.close();
    }
    
}

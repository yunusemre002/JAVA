
package Lab1_Mustafa;

public class Ogrenci {
    private String ogrenciNo;
    private String adSoyad;
    private int dogumYili;
    
    public Ogrenci(){
        
    }
    public Ogrenci(String ogrenciNo, String adSoyad, int dogumYili){
        this.ogrenciNo = ogrenciNo;
        this.adSoyad = adSoyad;
        this.dogumYili = dogumYili;
    }
    public void SetOgrenciNo(String ogrenciNo){
        this.ogrenciNo = ogrenciNo;
    }
    public void SetAdSoyad(String adSoyad){
        this.adSoyad = adSoyad;
    }
    public void SetDogumYili(int dogumYili){
        this.dogumYili = dogumYili;
    }
    public String GetOgrenciNo(){
        return this.ogrenciNo;
    }
    public String GetAdSoyad(){
        return this.adSoyad;
    }
    public int GetDogumYili(){
        return this.dogumYili;
    }
    public String BilgileriYazdir(){
        String info = this.ogrenciNo + " " + this.adSoyad + " " + this.dogumYili;
        return info;
    }
}

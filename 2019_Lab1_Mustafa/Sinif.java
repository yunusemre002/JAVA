
package Lab1_Mustafa;

import java.util.ArrayList;

public class Sinif {
    private int kapasite;
    private String kapiNo;
    private ArrayList<Ogrenci> sandalye;
    
    public Sinif(){
        
    }
    public Sinif(int kapasite, String kapiNo, ArrayList<Ogrenci> sandalye){
        this.kapasite = kapasite;
        this.kapiNo = kapiNo;
        this.sandalye = sandalye;
    }
    public Sinif(int kapasite, String kapiNo){
        this.kapasite = kapasite;
        this.kapiNo = kapiNo;
    }
    public void SetKapasite(int kapasite){
        this.kapasite = kapasite;
    }
    public void SetKapiNo(String kapiNo){
        this.kapiNo = kapiNo;
    }
    public void SetSandalye(ArrayList<Ogrenci> sandalye){
        this.sandalye = sandalye;
    }
    public int GetKapasite(){
        return this.kapasite;
    }
    public String GetKapiNo(){
        return this.kapiNo;
    }
    public ArrayList<Ogrenci> GetSandalye(){
        return this.sandalye;
    }
    public boolean YerVarMi(){
        if(sandalye.size()<kapasite)
            return true;
        else
            return false;
    }
    public String OgrenciEkle(Ogrenci ogrenci){
        if(YerVarMi()){
            sandalye.add(ogrenci);
            return ogrenci.GetOgrenciNo();
        }
        else{
            System.out.println("Sinif kapasitesi dolu");
            return null;
        }
    }
    public String OgrenciCikar(String adSoyad){
        for(Ogrenci ogrenci : sandalye)
            if(ogrenci.GetAdSoyad().compareTo(adSoyad)==0) {
                sandalye.remove(ogrenci);
				return ogrenci.GetOgrenciNo();
			}
        return null;
    }
    public int SinifBosKapasite(){
        return kapasite - sandalye.size();
    }
    public String SinifTanit(){
        String info = "\n" + this.sandalye.size() + "/" +this.kapasite + " kapasiteli " + this.kapiNo + " sinifi: \n\n";
        for(Ogrenci ogrenci : sandalye)
            info += ogrenci.BilgileriYazdir() + " \n";
        return info;
    }
}

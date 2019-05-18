
package Calismalar_5;

public class Insan{
	private String isim;
	private Araba5 araba;
	
	public Insan(String isim) {
		this.isim=isim;
	}
	
	public String getIsým(){ return isim; }
	public Araba5 getAraba5( ){ return araba; }
	public void setAraba5(Araba5 car) { araba=car; }
	
	public String kendiniTanit() {
		String tanitim;
		tanitim = "Ben "+ getIsým() + ".";
		if(araba != null)// BÝR ÝNSANIN ARABASI OLMAYA DA BÝLÝR EGER VARSA EKLE YPKSA SADECE ISMINI DONDUR
			tanitim += " Arabamýn plakasý :"+ araba.getPlaka() ;
		return tanitim;
	}
	
	
}

package Calismalar_5;

public class Insan{
	private String isim;
	private Araba5 araba;
	
	public Insan(String isim) {
		this.isim=isim;
	}
	
	public String getIs�m(){ return isim; }
	public Araba5 getAraba5( ){ return araba; }
	public void setAraba5(Araba5 car) { araba=car; }
	
	public String kendiniTanit() {
		String tanitim;
		tanitim = "Ben "+ getIs�m() + ".";
		if(araba != null)// B�R �NSANIN ARABASI OLMAYA DA B�L�R EGER VARSA EKLE YPKSA SADECE ISMINI DONDUR
			tanitim += " Arabam�n plakas� :"+ araba.getPlaka() ;
		return tanitim;
	}
	
	
}
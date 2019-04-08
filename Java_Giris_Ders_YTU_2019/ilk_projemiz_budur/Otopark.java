package ilk_projemiz_budur;

import java.util.LinkedList;

public class Otopark {
	private String otoparkAdi;
	private int kapasite;
	LinkedList<Araba> otopark;
	
	
	
	public Otopark() {
	}

	public Otopark(String otoparkAdi, int kapasite, LinkedList<Araba> otopark) {
		this.otopark = new LinkedList<Araba>();
		this.otoparkAdi = otoparkAdi;
		this.kapasite = kapasite;
	}
	
	public String getOtoparkAdi() {
		return otoparkAdi;
	}

	public void setOtoparkAdi(String otoparkAdi) {
		this.otoparkAdi = otoparkAdi;
	}

	
	public boolean bosMu() {
		if(kapasite == 0)
			return false;
		else
			return true;
	}
	
	public void arabaEkle(Araba araba) {
		this.otopark.add(araba);
		this.kapasite--;
	}
	
	public Araba arabaSil(int index) {
		Araba tmp;
		tmp = this.otopark.remove(index);
		this.kapasite++;
		return tmp;
	}
	
	public void otobarkTanit() {
		System.out.println("Otopark adi : " + getOtoparkAdi());
		System.out.println("Otopark Kapasitesi : " + getKapasite());
		for (int i =0 ; i<otopark.size(); i++)
			this.otopark.get(i).introduceSelf();
	}

	private int getKapasite() {
		return kapasite;
	}

}

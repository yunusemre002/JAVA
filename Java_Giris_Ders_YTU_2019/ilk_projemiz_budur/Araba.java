package ilk_projemiz_budur;

public class Araba {
	private String marka;
	private String plaka;
	
	
	public Araba() {
	}

	public Araba(String marka, String plaka) {
		this.marka = marka;
		this.plaka = plaka;
	}

	public String getMarka() {
		return marka;}

	public void setMarka(String marka) {
		this.marka = marka;}

	public String getPlaka() {
		return plaka;}

	public void setPlaka(String plaka) {
		this.plaka = plaka;}

	
	public void introduceSelf() {
		System.out.println("Arabanýn Markasi: " + getMarka());
		System.out.println("Arabanýn Plakasi: " + getPlaka());
	}

}


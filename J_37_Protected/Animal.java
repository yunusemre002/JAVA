package J_37_Protected;
/*
 * Protected denilirse aynı paekt içinde direkt olarak ulaşabiliriz setter getter olmadan .
 * ama sadece ilgili paketler içinde ulaşılabilir.
 * classlar  sadece public ve private olur metodlar hepsi olur.
 * java access modifier summer. com
 */
public class Animal {
	
	protected String name;

	public Animal(String name) {
		super();
		this.name = name;
	}
	
}

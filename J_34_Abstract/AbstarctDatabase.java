package J_34_Abstract;
/*
 * Abstrack interface ile inheritance arasında birşeydir. Daha doğrusu İçinde açıkça metod yazılabilen interface dense daha doğru olur. 
 * Nitekim Abstractlarda Bu classı extend edecek classların ortaklaşa kullanacağı metodlar açıkça yazılırlar. farklı kullanacakları metodlar ise kapalı olarak yazılırlar.
 * Class namei' abstaract olarak belirtmeliyiz.
 * Kapalı metodların başına da abstract eki getirilmelidir.
 */
public abstract class AbstarctDatabase {

	public void add() {
		System.out.println("it is adding...");
	}
	
	public void delete() {
		System.out.println("it is deleted...");
	}
	
	abstract void update();
	abstract void get();
	
}

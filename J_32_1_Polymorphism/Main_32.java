package J_32_1_Polymorphism;
/* Referanslar hayvan referansları olmasina ragmnen Objeler Farklı old. icin ilgili objeleri refere etti.
 * İlgili objelerde de speak fonk. Override edilmisti.
 */
public class Main_32 {
	
	public static void otherSpeak(Animal animal) {
		animal.speak();
	}
	
	public static void main(String[] args) {
		
		Animal anm = new Animal("Hayvan");
		Animal bird = new Bird("Kus");
		Animal horse = new At("At");
		Animal dog = new Dog("Kopek");
		
		anm.speak();
		bird.speak();
		horse.speak();
		dog.speak();
		
		System.out.println("\n------Other------------");
		// otherSpeak fonksiyonu animal alıyor ve biz ona bird horse vs gönderebiliyoruz.
		otherSpeak(new At("prens"));
		otherSpeak(new Bird("Mavis"));
		
		
	}
}

package J_18_ClassesPublic;

/*
Araba isimli bir nesne oluşturduk ve bu nesneye ait 4 adet field/proparties belirledik.
Bu şuanda ölü vaziyette bunu kullanmak istiyorsak main metodda bir adet yaratıp kullanabiliriz.

 * İlgili fieldler neden punlic? Çünkü diğer metodlardan kolayca ulşaıp kullanbilmek için ama genelde bunun private yapılması gereklidir.
 * Private yapılıp ilgili fieldlerin sadece ilgili class tarafından kullanılabilir olması beklenir. Private fieldlere başka classlardan 
 * ulaşmanın da bir yolu var dır ulaşmak isteyenlerin o yolu deneyerek ullaşmaası beklenir.

 */
public class Car {
	public String color;
	public String model;
	public double engine;
	public int doors;

}

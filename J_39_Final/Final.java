package J_39_Final;
/*
 * Final  tipi program boyunca bir kez değer atanır ve değiştirilemez. 
 * Bu değer de ya tanımlarken yada constracturede tanımlanır.
 * 
 */
public class Final {

	public final int number =10;		// oluşturulurken değer atandı.
	public final int number2;			// Constracturede değer atanacak.
		
	public Final() {
		this.number2 = 20;
	}
	
	
}

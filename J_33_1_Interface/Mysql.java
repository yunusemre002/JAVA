package J_33_1_Interface;

public class Mysql implements IDatabase{

	@Override
	public void add() {
		System.out.println(	"Mysql add..");
	}

	@Override
	public void update() {
		System.out.println(	"Mysql update..");
	}

	@Override
	public void get() {
		System.out.println(	"Mysql get..");
	}

	@Override
	public void delete() {
		System.out.println(	"Mysql delete..");

	}

}

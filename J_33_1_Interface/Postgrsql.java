package J_33_1_Interface;

public class Postgrsql implements IDatabase {

	@Override
	public void add() {
		System.out.println(	"Postgrsql add..");
	}

	@Override
	public void update() {
		System.out.println(	"Postgrsql update..");
	}

	@Override
	public void get() {
		System.out.println(	"Postgrsql get..");
	}

	@Override
	public void delete() {
		System.out.println(	"Postgrsql delete..");
	}

}

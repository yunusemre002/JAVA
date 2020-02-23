package J_33_1_Interface;

public class Oracle implements IDatabase {
	@Override
	public void add() {
		System.out.println(	"Oracle add..");
	}

	@Override
	public void update() {
		System.out.println(	"Oracle update..");
	}

	@Override
	public void get() {
		System.out.println(	"Oracle get..");
	}

	@Override
	public void delete() {
		System.out.println(	"Oracle delete..");
	}

}

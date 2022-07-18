package zoo.v1;

public class Wassergehege extends Gehege {
	
	private int waterCapacity;

	public Wassergehege(AnimalType gehegetype, int length, int width, int waterCapacity) {
		super(gehegetype, length, width);
		this.waterCapacity = waterCapacity;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int caculateCapacity() {
		// TODO Auto-generated method stub
		return 0;
	}

}

package zoo.v3;

public class Wassergehege extends Gehege {
	
	private int waterCapacity;

	public Wassergehege(String name, int length, int width, int waterCapacity) {
		super(name, GehegeType.WATER, length, width);
		this.waterCapacity = waterCapacity;
	}

	@Override
	public int caculateCapacity() {
		int capacity = (super.getLength()*super.getWidth()*this.waterCapacity)/100000;
		return capacity;
	}

}

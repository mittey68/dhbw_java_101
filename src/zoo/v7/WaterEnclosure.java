package zoo.v7;

public class WaterEnclosure extends Enclosure {
	
	private int waterCapacity;

	public WaterEnclosure(String name, int length, int width, int waterCapacity) {
		super(name, EnclosureType.WATER, length, width);
		this.waterCapacity = waterCapacity;
	}

	@Override
	public int caculateCapacity() {
		int capacity = (super.getLength()*super.getWidth()*this.waterCapacity)/100000;
		return capacity;
	}

}

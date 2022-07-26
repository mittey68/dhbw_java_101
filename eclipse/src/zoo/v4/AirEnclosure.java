package zoo.v4;

public class AirEnclosure extends Enclosure {
	
	private int height;

	public AirEnclosure(String name, int length, int width, int height) {
		super(name, EnclosureType.AIR, length, width);
		this.height = height;
	}

	public int caculateCapacity() {
		int capacity = (super.getLength()*super.getWidth()*this.height)/10000;
		return capacity;
	}

}

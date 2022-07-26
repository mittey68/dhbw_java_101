package zoo.v3;

public class LandEnclosure extends Enclosure {
	
	private boolean planting;

	public LandEnclosure(String name, int length, int width, boolean planting) {
		super(name, EnclosureType.LAND, length, width);
		this.planting = planting;
	}

	public int caculateCapacity() {
		int capacity = (super.getLength()*super.getWidth())/1000;
		if (this.planting) {
			capacity = capacity/2;
		}
		return capacity;
	}

}

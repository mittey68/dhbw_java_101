package zoo.v5;

public class Landgehege extends Gehege {
	
	private boolean bepflanzung;

	public Landgehege(String name, int length, int width, boolean bepflanzung) {
		super(name, GehegeType.LAND, length, width);
		this.bepflanzung = bepflanzung;
	}

	public int caculateCapacity() {
		int capacity = (super.getLength()*super.getWidth())/1000;
		if (this.bepflanzung) {
			capacity = capacity/2;
		}
		return capacity;
	}

}

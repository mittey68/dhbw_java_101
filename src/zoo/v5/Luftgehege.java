package zoo.v5;

public class Luftgehege extends Gehege {
	
	private int hoehe;

	public Luftgehege(String name, int length, int width, int hoehe) {
		super(name, GehegeType.AIR, length, width);
		this.hoehe = hoehe;
	}

	public int caculateCapacity() {
		int capacity = (super.getLength()*super.getWidth()*this.hoehe)/10000;
		return capacity;
	}

}

package zoo.v1;

public class Luftgehege extends Gehege {
	
	private int hoehe;

	public Luftgehege(AnimalType gehegetype, int length, int width, int hoehe) {
		super(gehegetype, length, width);
		this.hoehe = hoehe;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int caculateCapacity() {
		// TODO Auto-generated method stub
		return 0;
	}

}

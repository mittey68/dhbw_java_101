package zoo.v1;

public class Landgehege extends Gehege {
	
	private boolean bepflanzung;

	public Landgehege(AnimalType gehegetype, int length, int width, boolean bepflanzung) {
		super(gehegetype, length, width);
		this.bepflanzung = bepflanzung;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int caculateCapacity() {
		// TODO Auto-generated method stub
		return 0;
	}

}

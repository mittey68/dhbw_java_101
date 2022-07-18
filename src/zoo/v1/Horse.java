package zoo.v1;

public class Horse extends Animal {
	private String race;

	public Horse(String name, AnimalType type, int price, int age, int maxAge, FoodType foodType, String race) {
		super(name, type, price, age, maxAge, foodType);
		this.race = race;
	}

	@Override
	public int getWorth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int print() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}

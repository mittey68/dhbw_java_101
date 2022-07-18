package zoo.v1;

public class Bird extends Animal {
	private String featherColor;

	public Bird(String name, AnimalType type, int price, int age, int maxAge, FoodType foodType, String featherColor) {
		super(name, type, price, age, maxAge, foodType);
		this.featherColor = featherColor;
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

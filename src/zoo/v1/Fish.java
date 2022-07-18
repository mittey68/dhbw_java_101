package zoo.v1;

public class Fish extends Animal {
	private boolean venomous;

	public Fish(String name, AnimalType type, int price, int age, int maxAge, FoodType foodType, boolean venomous) {
		super(name, type, price, age, maxAge, foodType);
		this.venomous = venomous;
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

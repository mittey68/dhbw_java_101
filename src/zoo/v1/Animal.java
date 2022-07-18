package zoo.v1;

public abstract class Animal {
	private String name;
	private AnimalType type;
	private int price;
	private int age;
	private int maxAge;
	private FoodType foodType;
	
	public Animal(String name, AnimalType type, int price, int age, int maxAge, FoodType foodType) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.age = age;
		this.maxAge = maxAge;
		this.foodType = foodType;
	}
	
	public void feed() {
		
	}
	public abstract int getWorth();
	public abstract int print();
	
	
	
}

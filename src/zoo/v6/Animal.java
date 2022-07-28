package zoo.v6;

public abstract class Animal {
	protected String name;
	protected int price;
	protected int age;
	protected int maxAge;
	protected boolean alive;
	protected EnclosureType gehegeType;
	protected FoodType foodType;
	
	public Animal(String name, int price, int maxAge, EnclosureType gehegeType, FoodType foodType) {
		this.name = name;
		this.price = price;
		this.age = 0;
		this.maxAge = maxAge;
		this.alive = true;
		this.gehegeType = gehegeType;
		this.foodType = foodType;
	}
	
	//Getters
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getAge() {
		return age;
	}

	public int getMaxAge() {
		return maxAge;
	}
	
	public boolean getAlive() {
		return alive;
	}
	
	public EnclosureType getGehegeType() {
		return gehegeType;
	}
	
	public FoodType getFoodType() {
		return foodType;
	}
	
	//Methods
	public void getOlder() {
		if (this.age < this.maxAge) {
			this.age++;
		}
		else {
			this.alive = false;
		}
	}
	public abstract int getWorth();
	
	public int feed() {
		return this.foodType.getCost();
	}

	public abstract void print();
}

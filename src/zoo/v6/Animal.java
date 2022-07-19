package zoo.v6;

public abstract class Animal {
	protected String name;
	protected GehegeType type;
	protected int price;
	protected int age;
	protected int maxAge;
	protected FoodType foodType;
	protected boolean alive;
	
	public Animal(String name, GehegeType type, int price, int age, int maxAge, FoodType foodType) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.age = age;
		this.maxAge = maxAge;
		this.foodType = foodType;
		this.alive = true;
	}
	
	//Getters
	public String getName() {
		return name;
	}

	public GehegeType getType() {
		return type;
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

	public FoodType getFoodType() {
		return foodType;
	}
	
	public boolean getAlive() {
		return alive;
	}
	
	//Methods
	
	public int feed() {
		return this.foodType.getCost();
	}


	public void getOlder() {
		this.age++;
		if (this.age > this.maxAge) {
			this.alive = false;
		}
	}
	public abstract int getWorth();
	public abstract void print();
	
	
	
}

package zoo.v1;

public class Animal {
	private String name;
	private int price;
	private int age;
	private int maxAge;
	private boolean alive;
	
	public Animal(String name, int price, int maxAge) {
		this.name = name;
		this.price = price;
		this.age = 0;
		this.maxAge = maxAge;
		this.alive = true;
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
	
	//Methods
	public void getOlder() {
		if (this.age < this.maxAge) {
			this.age++;
		}
		else {
			this.alive = false;
		}
	}
	public int getWorth() {
		if(this.age <= 5) {
			return this.price/2;
		}
		else {
			return this.price;
		}
	}

	public void print() {
		System.out.println("Tier:");
		System.out.println("- Name: " + this.name);
		System.out.println("- Preis: " + this.price);
		System.out.println("- Aktueller Wert: " + this.getWorth());
		System.out.println("- Alter: " + this.age);
		System.out.println("- Geschätzte Lebenserwartung: " + this.maxAge);
		System.out.println("- Am Leben?: " + this.alive);
		
	}
}

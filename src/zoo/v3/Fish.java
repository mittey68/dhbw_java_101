package zoo.v3;

public class Fish extends Animal {
	private boolean venomous;

	public Fish(String name, int price, boolean venomous) {
		super(name, price, 5, GehegeType.WATER, FoodType.FISHFOOD);
		this.venomous = venomous;
	}

	public int getWorth() {
		if(this.venomous) {
			return price*3;
		}
		return price;
	}
	
	public void print() {
		System.out.println("Fisch:");
		System.out.println("- Name: " + this.name);
		System.out.println("- Giftig? " + this.venomous);
		System.out.println("- Tierart: " + this.gehegeType);
		System.out.println("- Preis: " + this.price);
		System.out.println("- Aktueller Wert: " + this.getWorth());
		System.out.println("- Alter: " + this.age);
		System.out.println("- Geschätzte Lebenserwartung: " + this.maxAge);
		System.out.println("- Am Leben?: " + this.alive);
	}
	
	

}

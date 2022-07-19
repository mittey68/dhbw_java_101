package zoo.v8;

public class Horse extends Animal {
	private String race;

	public Horse(String name, int price, String race) {
		super(name, GehegeType.LAND, price, 0, 10, FoodType.HAY);
		this.race = race;
	}

	@Override
	public int getWorth() {
		if(this.age <= 5) {
			return this.price/2;
		}
		else if (this.age >= 5 && this.age <= 10) {
			return this.price*2;
		}
		else {
			return price;
		}
	}

	public void print() {
		System.out.println("Pferd:");
		System.out.println("- Name: " + this.name);
		System.out.println("- Rasse: " + this.race);
		System.out.println("- Tierart: " + this.type);
		System.out.println("- Aktueller Wert: " + this.getWorth());
		System.out.println("- Alter: " + this.age);
		System.out.println("- Geschätzte Lebenserwartung: " + this.maxAge);
	}
	
	

}

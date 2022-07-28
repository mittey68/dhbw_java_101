package zoo.v6;

public class Horse extends Animal {
	private String race;

	public Horse(String name, int price, String race) {
		super(name, price, 10, EnclosureType.LAND, FoodType.HAY);
		this.race = race;
	}

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
		System.out.println("- Tierart: " + this.gehegeType);
		System.out.println("- Preis: " + this.price);
		System.out.println("- Aktueller Wert: " + this.getWorth());
		System.out.println("- Alter: " + this.age);
		System.out.println("- Geschätzte Lebenserwartung: " + this.maxAge);
		System.out.println("- Am Leben?: " + this.alive);
	}
	
	

}

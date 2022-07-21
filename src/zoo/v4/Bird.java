package zoo.v4;

import java.awt.Color;

public class Bird extends Animal {
	private Color featherColor;

	public Bird(String name, int price, Color featherColor) {
		super(name, price, 7, EnclosureType.AIR, FoodType.GRAINS);
		this.featherColor = featherColor;
	}

	public int getWorth() {
		if(this.featherColor.equals( Color.YELLOW)) {
			return this.price*10;
		}
		else if(this.featherColor.equals(Color.GREEN)) {
			return this.price*2;
		}
		return this.price;
	}
	
	public void print() {
		System.out.println("Vogel:");
		System.out.println("- Name: " + this.name);
		System.out.println("- Federfarbe: " + this.featherColor);
		System.out.println("- Tierart: " + this.gehegeType);
		System.out.println("- Preis: " + this.price);
		System.out.println("- Aktueller Wert: " + this.getWorth());
		System.out.println("- Alter: " + this.age);
		System.out.println("- Geschätzte Lebenserwartung: " + this.maxAge);
		System.out.println("- Am Leben?: " + this.alive);
	}
	
	

}

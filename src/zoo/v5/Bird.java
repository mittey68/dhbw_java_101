package zoo.v5;

import java.awt.Color;

public class Bird extends Animal {
	private Color featherColor;

	public Bird(String name, int price, Color featherColor) {
		super(name, GehegeType.AIR, price, 0, 7, FoodType.GRAINS);
		this.featherColor = featherColor;
	}

	public int getWorth() {
		if(this.featherColor.equals( Color.YELLOW)) {
			return price*10;
		}
		else if(this.featherColor.equals(Color.GREEN)) {
			return price*2;
		}
		return price;
	}

	public void print() {
		System.out.println("Vogel:");
		System.out.println("- Name: " + this.name);
		System.out.println("- Federfarbe: " + this.featherColor);
		System.out.println("- Tierart: " + this.type);
		System.out.println("- Aktueller Wert: " + this.getWorth());
		System.out.println("- Alter: " + this.age);
		System.out.println("- Geschätzte Lebenserwartung: " + this.maxAge);
	}
	
	

}

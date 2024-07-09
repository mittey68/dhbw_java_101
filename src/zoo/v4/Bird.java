package zoo.v4;

import java.awt.Color;

public class Bird extends Animal {
	private Color featherColor; // Federfarbe des Vogels

	// Konstruktor zur Initialisierung der Attribute
	public Bird(String name, int price, Color featherColor) {
		super(name, price, 7, EnclosureType.AIR, FoodType.GRAINS); // Aufruf des Konstruktors der Oberklasse
		this.featherColor = featherColor; // Initialisierung der Federfarbe
	}

	// Methode zur Berechnung des Wertes des Vogels basierend auf der Federfarbe
	public int getWorth() {
		if (this.featherColor.equals(Color.YELLOW)) { // Gelbes Gefieder verzehnfacht den Wert
			return this.price * 10;
		} else if (this.featherColor.equals(Color.GREEN)) { // Grünes Gefieder verdoppelt den Wert
			return this.price * 2;
		}
		return this.price; // Andere Gefiederfarben haben keinen Einfluss auf den Wert
	}
	
	// Methode zur Ausgabe der Eigenschaften des Vogels auf der Konsole
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
	
	// Alternative Methode zur Ausgabe der Eigenschaften des Vogels unter Verwendung der print-Methode der Oberklasse
//	public void print() {
//		super.print(); // Aufruf der print-Methode der Oberklasse
//		System.out.println("- Federfarbe: " + this.featherColor);
//	}
}

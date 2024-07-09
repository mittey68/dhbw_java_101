package zoo.v3;

public class Fish extends Animal {
	private boolean venomous; // Gibt an, ob der Fisch giftig ist

	// Konstruktor zur Initialisierung der Attribute
	public Fish(String name, int price, boolean venomous) {
		super(name, price, 5, EnclosureType.WATER, FoodType.FISHFOOD); // Aufruf des Konstruktors der Oberklasse
		this.venomous = venomous; // Initialisierung, ob der Fisch giftig ist
	}

	// Methode zur Berechnung des Wertes des Fisches basierend auf seiner Giftigkeit
	public int getWorth() {
		if (this.venomous) { // Giftige Fische sind das Dreifache ihres Preises wert
			return price * 3;
		}
		return price; // Ungiftige Fische haben ihren normalen Preis als Wert
	}
	
	// Methode zur Ausgabe der Eigenschaften des Fisches auf der Konsole
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
	
	// Alternative Methode zur Ausgabe der Eigenschaften des Fisches unter Verwendung der print-Methode der Oberklasse
//	public void print() {
//		super.print(); // Aufruf der print-Methode der Oberklasse
//		System.out.println("- Giftig? " + this.venomous);
//	}
}

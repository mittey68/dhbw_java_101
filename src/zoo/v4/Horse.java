package zoo.v4;

public class Horse extends Animal {
	private String race; // Rasse des Pferdes

	// Konstruktor zur Initialisierung der Attribute
	public Horse(String name, int price, String race) {
		super(name, price, 10, EnclosureType.LAND, FoodType.HAY); // Aufruf des Konstruktors der Oberklasse
		this.race = race; // Initialisierung der Rasse
	}

	// Methode zur Berechnung des Wertes des Pferdes basierend auf seinem Alter
	public int getWorth() {
		if (this.age <= 5) { // Pferde, die 5 Jahre oder jünger sind, sind die Hälfte ihres Preises wert
			return this.price / 2;
		} else if (this.age > 5 && this.age <= 10) { // Pferde, die älter als 5 aber jünger als 11 sind, sind das Doppelte ihres Preises wert
			return this.price * 2;
		} else { // Pferde, die älter als 10 Jahre sind, haben den gleichen Wert wie ihr Preis
			return price;
		}
	}
	
	// Methode zur Ausgabe der Eigenschaften des Pferdes auf der Konsole
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
	
	// Alternative Methode zur Ausgabe der Eigenschaften des Pferdes unter Verwendung der print-Methode der Oberklasse
//	public void print() {
//		super.print(); // Aufruf der print-Methode der Oberklasse
//		System.out.println("- Rasse: " + this.race);
//	}
}

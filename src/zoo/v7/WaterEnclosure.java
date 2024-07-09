package zoo.v7;

public class WaterEnclosure extends Enclosure {
	
	private int waterCapacity; // Wasserkapazität des Wassergeheges

	// Konstruktor zur Initialisierung der Attribute
	public WaterEnclosure(String name, int length, int width, int waterCapacity) {
		super(name, EnclosureType.WATER, length, width); // Aufruf des Konstruktors der Oberklasse
		this.waterCapacity = waterCapacity; // Initialisierung der Wasserkapazität
	}

	// Methode zur Berechnung der Kapazität des Wassergeheges
	// Die Kapazität berechnet sich aus (Länge * Breite * Wasserkapazität) / 100000
	@Override
	public int calculateCapacity() {
		int capacity = (super.getLength() * super.getWidth() * this.waterCapacity) / 100000;
		return capacity;
	}
}

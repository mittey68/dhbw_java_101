package zoo.v6;

public class AirEnclosure extends Enclosure {
	
	private int height; // Höhe des Luftgeheges

	// Konstruktor, der die Attribute initialisiert und den Konstruktor der Oberklasse aufruft
	public AirEnclosure(String name, int length, int width, int height) {
		super(name, EnclosureType.AIR, length, width); // Aufruf des Konstruktors der Oberklasse
		this.height = height; // Initialisierung der Höhe
	}

	// Methode zur Berechnung der Kapazität des Luftgeheges
	// Die Kapazität berechnet sich aus (Länge * Breite * Höhe) / 10000
	public int calculateCapacity() {
		int capacity = (super.getLength() * super.getWidth() * this.height) / 10000;
		return capacity;
	}
}

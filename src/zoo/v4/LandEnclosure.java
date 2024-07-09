package zoo.v4;

public class LandEnclosure extends Enclosure {
	
	private boolean planting; // Gibt an, ob das Gehege bepflanzt ist

	// Konstruktor zur Initialisierung der Attribute
	public LandEnclosure(String name, int length, int width, boolean planting) {
		super(name, EnclosureType.LAND, length, width); // Aufruf des Konstruktors der Oberklasse
		this.planting = planting; // Initialisierung, ob das Gehege bepflanzt ist
	}

	// Methode zur Berechnung der Kapazität des Landgeheges
	// Die Kapazität berechnet sich aus (Länge * Breite) / 1000
	// Wenn das Gehege bepflanzt ist, wird die Kapazität halbiert
	public int calculateCapacity() {
		int capacity = (super.getLength() * super.getWidth()) / 1000;
		if (this.planting) { // Kapazität halbieren, wenn Bepflanzung vorhanden ist
			capacity = capacity / 2;
		}
		return capacity;
	}
}

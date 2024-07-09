package zoo.v2;

import java.util.ArrayList;

public class Enclosure {
	private String name;
	private EnclosureType gehegeType; // Typ des Geheges (LAND, WATER, AIR)
	private ArrayList<Animal> animals; // Liste der Tiere im Gehege
	private int length; // Länge des Geheges
	private int width; // Breite des Geheges
	private int animalsInside; // Anzahl der Tiere im Gehege

	// Konstruktor, der alle Attribute initialisiert
	public Enclosure(String name, EnclosureType gehegeType, int length, int width) {
		this.name = name;
		this.gehegeType = gehegeType;
		this.animals = new ArrayList<>();
		this.length = length;
		this.width = width;
		this.animalsInside = 0; // Beim Erstellen sind keine Tiere im Gehege
	}

	// Getter-Methoden für die Attribute
	public EnclosureType getGehegetype() {
		return gehegeType;
	}

	public ArrayList<Animal> getAnimals() {
		return animals;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	// Methode, um die Kapazität des Geheges zu berechnen
	// Die Kapazität berechnet sich aus (Länge * Breite) / 1000
	public int calculateCapacity() {
		return (this.length * this.width) / 1000;
	}

	// Methode, um ein Tier zum Gehege hinzuzufügen
	public void addAnimal(Animal animal) {
		if (this.calculateCapacity() > this.animalsInside) { // Prüfen, ob das Gehege noch Platz hat
			if (animal.getGehegeType().equals(this.gehegeType)) { // Prüfen, ob das Tier in dieses Gehege passt
				this.animals.add(animal);
				this.animalsInside++;
			} else {
				System.out.println("Dieses Tier passt nicht in ein " + this.gehegeType.getDescription()
						+ ". Es benötigt ein " + animal.getGehegeType().getDescription());
			}
		} else {
			System.out.println("Dieses Gehege ist zu klein. Die Maximalkapazität von " + this.calculateCapacity()
					+ " ist erreicht.");
		}
	}

	// Methode, um alle Tiere im Gehege altern zu lassen
	public void ageAnimals() {
		for (Animal animal : animals) {
			animal.getOlder();
		}
		removeDeadAnimals(); // Tote Tiere entfernen
	}

	// Methode, um tote Tiere aus dem Gehege zu entfernen
	public void removeDeadAnimals() {
		for (int i = 0; i < this.animals.size(); i++) {
			Animal animal = this.animals.get(i);
			if (animal.getAlive() == false) {
				this.animals.remove(i);
				this.animalsInside--;
			}
		}
	}

	// Methode, um die Futterkosten aller Tiere im Gehege zu berechnen
	public int feedAnimals() {
		int costs = 0;
		for (Animal animal : animals) {
			costs += animal.feed();
		}
		return costs;
	}

	// Methode, um den Gesamtwert aller Tiere im Gehege zu berechnen
	public int worthOfEnclosure() {
		int worth = 0;
		for (Animal animal : animals) {
			worth += animal.getWorth();
		}
		return worth;
	}

	// Methode, um die Eigenschaften des Geheges und der Tiere im Gehege auf der
	// Konsole auszugeben
	public void print() {
		System.out.println("Gehegename: " + this.name);
		System.out.println("Gehegetyp: " + this.gehegeType);
		System.out.println("Gehegekapazität: " + this.calculateCapacity());
		System.out.println("Tiere im Gehege: " + this.animalsInside);
		for (Animal a : this.animals) {
			a.print();
		}
	}
}

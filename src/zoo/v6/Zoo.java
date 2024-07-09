package zoo.v6;

import java.util.ArrayList;

public class Zoo {
	private String name; // Name des Zoos
	private String director; // Name des Zoodirektors
	private int capital; // Kapital des Zoos
	private ArrayList<Enclosure> enclosures; // Liste der Gehege im Zoo
	
	// Konstruktor zur Initialisierung der Attribute
	public Zoo(String name, String director, int capital) {
		this.name = name;
		this.director = director;
		this.capital = capital;
		this.enclosures = new ArrayList<>();
	}

	// Getter-Methoden für die Attribute
	public String getName() {
		return name;
	}

	public String getDirector() {
		return director;
	}
	
	public int getCapital() {
		return capital;
	}
	
	public ArrayList<Enclosure> getEnclosures() {
		return enclosures;
	}

	// Setter-Methode für das Kapital
	public void setCapital(int capital) {
		this.capital = capital;
	}
	
	// Methode, um ein Gehege hinzuzufügen
	public void addEnclosure(Enclosure enclosure) {
		this.enclosures.add(enclosure);
	}
	
	// Methode zur Berechnung des Gesamtwerts aller Tiere im Zoo
	public int calculateWorth() {
		int worth = 0;
		for (Enclosure enclosure : this.enclosures) {
			worth += enclosure.worthOfEnclosure();
		}
		return worth;
	}
	
	// Methode zur Berechnung der Futterkosten aller Tiere im Zoo
	public int calculateFoodCosts() {
		int costs = 0;
		for (Enclosure enclosure : this.enclosures) {
			costs += enclosure.feedAnimals();
		}
		return costs;
	}
	
	// Methode, um alle Tiere im Zoo altern zu lassen
	public void ageAnimals() {
		for (Enclosure enclosure : this.enclosures) {
			enclosure.ageAnimals();
		}
	}
	
	// Methode, die den Zoo besucht und Kapital basierend auf Tierwert und Futterkosten anpasst
	public void getVisited() {
		this.capital += (calculateWorth() - calculateFoodCosts());
		this.capital -= 1000; // Fixkosten
		this.ageAnimals();
	}
	
	// Methode, um die Anzahl der verschiedenen Gehegetypen im Zoo auszugeben
	public void numberEnclosureTypes() {
		int landgehege = 0;
		int luftgehege = 0;
		int wassergehege = 0;
		for (Enclosure enclosure : this.enclosures) {
			if (enclosure instanceof LandEnclosure) {
				landgehege++;
			} else if (enclosure instanceof AirEnclosure) {
				luftgehege++;
			} else if (enclosure instanceof WaterEnclosure) {
				wassergehege++;
			}
		}
		System.out.println(landgehege + " Landgehege");
		System.out.println(luftgehege + " Luftgehege");
		System.out.println(wassergehege + " Wassergehege");
	}
	
	// Methode zur Ausgabe der Eigenschaften des Zoos und seiner Gehege auf der Konsole
	public void print() {
		System.out.println("----------------------------------------------------------");
		System.out.println("----------------------------------------------------------");
		System.out.println("----------------------------------------------------------");
		System.out.println("Name des Zoos: " + this.name);
		System.out.println("Zoodirektor: " + this.director);
		System.out.println("Aktuelles Kapital: " + this.capital);
		System.out.println("Anzahl unserer Gehege:");
		numberEnclosureTypes();
		System.out.println("Unsere Tiere:");
		for (Enclosure g : this.enclosures) {
			g.print();
		}
		System.out.println("----------------------------------------------------------");
		System.out.println("----------------------------------------------------------");
		System.out.println("----------------------------------------------------------");
	}
}

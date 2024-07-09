package zoo.v5;

// Hinweis: Die Klasse Animal ist abstrakt, da es keine konkreten Tiere gibt, sondern nur konkrete Tierarten
public abstract class Animal {
	protected String name; // Name des Tieres
	protected int price; // Preis des Tieres
	protected int age; // Alter des Tieres
	protected int maxAge; // Maximales Alter des Tieres
	protected boolean alive; // Status, ob das Tier noch lebt
	protected EnclosureType gehegeType; // Typ des Geheges, in dem das Tier lebt
	protected FoodType foodType; // Typ des Futters, das das Tier frisst
	
	// Konstruktor zur Initialisierung der Attribute
	public Animal(String name, int price, int maxAge, EnclosureType gehegeType, FoodType foodType) {
		this.name = name;
		this.price = price;
		this.age = 0; // Tiere sind beim Erstellen immer 0 Jahre alt
		this.maxAge = maxAge;
		this.alive = true; // Es dürfen keine toten Tiere erstellt werden
		this.gehegeType = gehegeType;
		this.foodType = foodType;
	}
	
	// Getter-Methoden für die Attribute
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getAge() {
		return age;
	}

	public int getMaxAge() {
		return maxAge;
	}
	
	public boolean getAlive() {
		return alive;
	}
	
	public EnclosureType getGehegeType() {
		return gehegeType;
	}
	
	public FoodType getFoodType() {
		return foodType;
	}
	
	// Methode, um das Alter des Tieres um 1 zu erhöhen
	// Wenn das Maximalalter erreicht ist, wird alive auf false gesetzt
	public void getOlder() {
		if (this.age < this.maxAge) {
			this.age++;
		} else {
			this.alive = false;
		}
	}

	// Abstrakte "leere" Methode zur Berechnung des Wertes des Tieres
	public abstract int getWorth();
	
	// Methode, um die Futterkosten des Tieres zurückzugeben
	public int feed() {
		return this.foodType.getCost();
	}

	// Abstrakte "leere" Methode zur Ausgabe der Eigenschaften des Tieres auf der Konsole
	public abstract void print();
}

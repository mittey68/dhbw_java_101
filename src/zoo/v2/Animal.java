package zoo.v2;

public class Animal {
	private String name;
	private int price;
	private int age;
	private int maxAge;
	private boolean alive;
	private EnclosureType gehegeType; // Typ des Geheges, in dem das Tier lebt
	private FoodType foodType; // Typ des Futters, das das Tier frisst
	
	// Konstruktor, der alle Attribute initialisiert
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

	// Methode, um den Wert des Tieres zu berechnen
	// Tiere, die 5 Jahre oder jünger sind, sind die Hälfte ihres Preises wert
	// Tiere, die älter als 5 Jahre sind, haben den gleichen Wert wie ihr Preis
	public int getWorth() {
		if (this.age <= 5) {
			return this.price / 2;
		} else {
			return this.price;
		}
	}
	
	// Methode, um die Futterkosten des Tieres zurückzugeben
	public int feed() {
		return this.foodType.getCost();
	}

	// Methode, um die Eigenschaften des Tieres auf der Konsole auszugeben
	public void print() {
		System.out.println("Tier:");
		System.out.println("- Name: " + this.name);
		System.out.println("- Tierart: " + this.gehegeType);
		System.out.println("- Preis: " + this.price);
		System.out.println("- Aktueller Wert: " + this.getWorth());
		System.out.println("- Alter: " + this.age);
		System.out.println("- Geschätzte Lebenserwartung: " + this.maxAge);
		System.out.println("- Am Leben?: " + this.alive);
	}
}

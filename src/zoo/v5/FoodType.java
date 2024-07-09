package zoo.v5;

public enum FoodType {
	/*
	 * Aufzählungskonstanten für verschiedene Futtersorten
	 */
	GRAINS(5, EnclosureType.AIR), HAY(3, EnclosureType.LAND), FISHFOOD(10, EnclosureType.WATER);
	
	private int cost; // Kosten des Futters
	private EnclosureType suitableFor; // Geeigneter Gehegetyp für das Futter
	
	// Konstruktor zur Initialisierung der Kosten und des geeigneten Gehegetyps
	FoodType(int cost, EnclosureType suitableFor) {
		this.cost = cost;
		this.suitableFor = suitableFor;
	}

	// Getter-Methode für die Kosten des Futters
	public int getCost() {
		return cost;
	}

	// Getter-Methode für den geeigneten Gehegetyp
	public EnclosureType getSuitableFor() {
		return suitableFor;
	}
}

package zoo.v2;

public enum FoodType {
	/*
	 * Aufzaehlungskonstanten
	 */
	GRAINS(5, EnclosureType.AIR), HAY(3, EnclosureType.LAND),FISHFOOD(10, EnclosureType.WATER);
	
	private int cost; // Kosten des Tierfutter
	private EnclosureType suitableFor; // GehegeTyp für das Futter
	
	// Konstruktor
	FoodType(int cost, EnclosureType suitableFor) {
		this.cost = cost;
		this.suitableFor = suitableFor;
	}
	
	// Getter für Kosten
	public int getCost() {
		return cost;
	}
	
	// Getter für Gehegetyp
	public EnclosureType getSuitableFor() {
		return suitableFor;
	}
	
}

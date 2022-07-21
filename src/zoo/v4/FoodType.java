package zoo.v4;

public enum FoodType {
	/*
	 * Aufzaehlungskonstanten
	 */
	GRAINS(5, EnclosureType.AIR), HAY(3, EnclosureType.LAND),FISHFOOD(10, EnclosureType.WATER);
	
	private int cost;
	private EnclosureType suitableFor;
	
	FoodType(int cost, EnclosureType suitableFor) {
		this.cost = cost;
		this.suitableFor = suitableFor;
	}

	public int getCost() {
		return cost;
	}

	public EnclosureType getSuitableFor() {
		return suitableFor;
	}
	
}

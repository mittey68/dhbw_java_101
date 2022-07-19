package zoo.v6;

public enum FoodType {
	/*
	 * Aufzaehlungskonstanten
	 */
	GRAINS(5, GehegeType.AIR), HAY(3, GehegeType.LAND),FISHFOOD(10, GehegeType.WATER);
	
	private int cost;
	private GehegeType suitableFor;
	
	FoodType(int cost, GehegeType suitableFor) {
		this.cost = cost;
		this.suitableFor = suitableFor;
	}

	public int getCost() {
		return cost;
	}

	public GehegeType getSuitableFor() {
		return suitableFor;
	}
	
}

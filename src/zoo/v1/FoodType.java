package zoo.v1;

public enum FoodType {
	/*
	 * Aufzaehlungskonstanten
	 */
	GRAINS(5, AnimalType.AIR), HAY(3, AnimalType.LAND),FISHFOOD(10, AnimalType.WATER);
	
	private int cost;
	private AnimalType suitableFor;
	
	private FoodType(int cost, AnimalType suitableFor) {
		this.cost = cost;
		this.suitableFor = suitableFor;
	}

	public int getCost() {
		return cost;
	}

	public AnimalType getSuitableFor() {
		return suitableFor;
	}
	
}

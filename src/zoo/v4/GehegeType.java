package zoo.v4;

public enum GehegeType {
	/*
	 * Aufzaehlungskonstanten
	 */
	LAND("Landgehege"), WATER("Wassergehege"),AIR("Luftgehege");
	
	private String description;

	GehegeType(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}

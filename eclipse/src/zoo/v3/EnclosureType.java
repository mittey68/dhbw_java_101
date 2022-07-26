package zoo.v3;

public enum EnclosureType {
	/*
	 * Aufzaehlungskonstanten
	 */
	LAND("Landgehege"), WATER("Wassergehege"),AIR("Luftgehege");
	
	private String description;

	EnclosureType(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}

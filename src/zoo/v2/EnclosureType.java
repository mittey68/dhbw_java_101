package zoo.v2;

public enum EnclosureType {
	/*
	 * Aufzaehlungskonstanten
	 */
	LAND("Landgehege"), WATER("Wassergehege"),AIR("Luftgehege");
	
	private String description; // Beschreibung des Gehegetyps

	// Konstruktor
	EnclosureType(String description) {
		this.description = description;
	}
	
	// Getter für Description
	public String getDescription() {
		return description;
	}
}

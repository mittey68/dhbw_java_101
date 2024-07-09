package zoo.v6;

public enum EnclosureType {
	/*
	 * Aufzählungskonstanten für verschiedene Gehegetypen
	 */
	LAND("Landgehege"), WATER("Wassergehege"), AIR("Luftgehege");
	
	private String description; // Beschreibung des Gehegetyps

	// Konstruktor zur Initialisierung der Beschreibung
	EnclosureType(String description) {
		this.description = description;
	}

	// Getter-Methode für die Beschreibung des Gehegetyps
	public String getDescription() {
		return description;
	}
}

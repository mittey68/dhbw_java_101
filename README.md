# JAVA 101

## Inhaltsverzeichnis:
- Version 1 – erste Klassen und Methoden erstellen
- Version 2 – Erweiterung der bisherigen Klassen und Verknüpfung untereinander
- Version 3 – Vererbung 
- Version 4 – abstrakte Klassen und Methoden
- Version 5 – Scanner Zufallszahlen & instanceOf Operator
- Version 6 – Einlesen von Textdateien & Wrapper Classes

Musterlösung (keine Garantie):  
[GitHub Repository](https://github.com/mittey68/prog-tutorium)

## Hinweise & Tipps:
- Erstelle jede Übung als eigenes Package. So behält jede Version ihre Lauffähigkeit trotz Änderungen in der neuen Version.
- UML Diagramme: Die hier verwendeten UML Diagramme sind von Plant-UML und NICHT die UML Diagramme die in den Vorlesungen verwendet werden. Der Aufbau ist ähnlich, die Legenden und Farben hingegen nicht.
- ArrayList, Color, Scanner etc. müssen bei Verwendung in die jeweiligen Klassen importiert werden. Dazu bietet Eclipse in der entsprechenden Fehlermeldung einen QuickFix an.

## Übungen

### Version 1 – erste Klassen und Methoden erstellen
- Erstelle die Klasse „Animal“ wie abgebildet.
- Der Konstruktor soll alle(!) Attribute initialisieren (Hinweis: Es dürfen keine toten Tiere erstellt werden und Tiere sind beim Erstellen immer 0 Jahre alt).
- `getName()`, `getPrice()`, `getAge()`, `getMaxAge()` & `getAlive()` sind Get-Methoden für die Attribute.
- `getOlder()` soll das Alter des Tieres um 1 erhöhen außer das Maximalalter ist erreicht. Dann soll `alive` auf „falsch“ gesetzt werden.
- `getWorth()` soll der Wert des Tiers berechnen. Dabei sind Tiere gleich oder jünger 5 Jahre die Hälfte ihres Preises wert. Tiere die älter als 5 Jahre sind, haben den gleichen Wert wie ihr Preis.
- `print()` soll eine Konsolenausgabe wie unten aufgeführt ergeben.
- Erstelle die ausführbare Klasse Main.
  - Erstelle 3 Tiere.
  - Gib die Tiere auf der Konsole aus.
  - Lass die Tiere altern.
  - Gib die Tiere erneut aus.
- UML-Diagramm <br>
![Class Diagram](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/mittey68/dhbw-java-101/development/readme/UML/v1/Animal.puml)
- Konsolenausgabe <br> ```Tier:
- Name: Pferd
- Preis: 1000
- Aktueller Wert: 500
- Alter: 0
- Geschätzte Lebenserwartung: 10
- Am Leben?: true
Tier:
- Name: Vogel
- Preis: 60
- Aktueller Wert: 30
- Alter: 0
- Geschätzte Lebenserwartung: 7
- Am Leben?: true
Tier:
- Name: Fisch
- Preis: 30
- Aktueller Wert: 15
- Alter: 0
- Geschätzte Lebenserwartung: 5
- Am Leben?: true
Tier:
- Name: Pferd
- Preis: 1000
- Aktueller Wert: 1000
- Alter: 6
- Geschätzte Lebenserwartung: 10
- Am Leben?: true
Tier:
- Name: Vogel
- Preis: 60
- Aktueller Wert: 30
- Alter: 1
- Geschätzte Lebenserwartung: 7
- Am Leben?: true
Tier:
- Name: Fisch
- Preis: 30
- Aktueller Wert: 15
- Alter: 5
- Geschätzte Lebenserwartung: 5
- Am Leben?: false```

### Version 2 – Erweiterung der bisherigen Klassen und Verknüpfung untereinander
- Verändere die Klasse Animal wie angegeben.
  - Füge die beiden neuen Attribute ein und initialisiere sie (Hinweis: Beachte die Enumeration Hilfsklassen unten oder schreibe sie anhand von den UML Diagrammen selbst).
  - Erstelle die neuen Getter.
  - Die Methode `feed()` soll die Kosten des jeweiligen FoodType aus dem Attribut foodType ausgeben.
  - Verändere die `print()` Methode entsprechend der Konsolenausgaben.
- Erstelle die Klasse Enclosure wie angegeben.
  - Der Konstruktor soll alle Attribute initialisieren (Hinweis: `animalsInside` sagt aus, wie viele Tiere aktuell im Gehege sind und ist beim Erstellen daher 0).
  - `getEnclosureType()`, `getAnimals()`, `getLength()`, `getWidth()` sind die entsprechenden Getter für die Attribute.
  - Die Methode `calculateCapacity()` gibt die Maximalkapazität des Geheges wieder. Diese berechnet sich durch `(Länge*Breite)/1000`.
  - `addAnimals()` soll das übergebene Animal in das Gehege hinzufügen, vorausgesetzt die Maximalkapazität ist nicht erreicht & das Gehege ist für das entsprechende Tier geeignet (Beachte `gehegeType`). Die Fehlermeldungen können aus der Konsolenausgabe herausgelesen werden.
  - `ageAnimals()` soll alle Tiere im Gehege altern lassen & die unten angegebene Hilfsmethode `removeDeadAnimals()` aufrufen.
  - `feedAnimals()` soll die Gesamtkosten für das Futter von allen Tieren in einem Gehege zurückgeben.
  - `worthOfEnclosure()` soll den Gesamtwert aller Tiere eines Geheges ausgeben.
  - Die `print()` Methode muss entsprechend der Konsolenausgaben angepasst werden. (Hinweis: Hier soll die `print()` Methode von Animal aufgerufen werden).
- Verändere die Main Klasse:
  - Erstelle 3 Land-, 3 Luft- und 3 Wassertiere.
  - Erstelle jeweils ein Land-, Luft- und Wassergehege.
  - Erstelle ein zu kleines Gehege mit der Länge 1 und Breite 1.
  - Teste die Fehlermeldungen, wenn ein falsches Gehege beim Hinzufügen verwendet wird und wenn die Maximalkapazität des Geheges nicht ausreichend ist.
  - Füge die Tiere ihrem jeweils richtigen Gehege hinzu.
  - Gib die Gehege auf der Konsole aus.
  - Lasse die Tiere im Gehege altern.
  - Gib die Tiere auf der Konsole aus & teste, ob die Alterung funktioniert.
- UML-Diagramme <br>
![Class Diagram](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/mittey68/dhbw-java-101/development/readme/UML/v2/Animal.puml)<br>
![Class Diagram](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/mittey68/dhbw-java-101/development/readme/UML/v2/Enclosure.puml)<br>
![Class Diagram](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/mittey68/dhbw-java-101/development/readme/UML/v2/FoodType.puml)<br>
![Class Diagram](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/mittey68/dhbw-java-101/development/readme/UML/v2/EnclosureType.puml)

- Hilfsklassen und -methoden
   - `Enum EnclosureType` <br>```public enum EnclosureType {
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
}```
   - `Enum FoodType`<br>```public enum FoodType {
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
	
}```
   - Hilfsmethode `removeDeadAnimals()`<br>```public void removeDeadAnimals() {
		for (int i = 0; i < this.animals.size(); i++) {
			Animal animal = this.animals.get(i);
			if (animal.getAlive() == false) {
				this.animals.remove(i);
				this.animalsInside--;
			}
		}
	}```

### Version 3 – Vererbung
- Erstelle die 3 Unterklassen der Klasse „Animal“: `Bird`, `Horse` und `Fish`.
  - Die Unterklassen sollen die Methoden `print()` und `getWorth()` der Oberklasse überschreiben.
  - **Horse:**
    - Pferde haben das zusätzliche Attribut „race“, in welchem die Rasse des Tieres angegeben wird.
    - Der Wert eines Pferdes berechnet sich aus seinem Alter:
      - Pferde, die 5 oder jünger sind, sind die Hälfte ihres Kaufpreises wert.
      - Pferde, die älter als 5 aber jünger als 11 sind, sind das Doppelte ihres Preises wert.
      - Pferde, die 11 oder älter sind, haben den Wert ihres Preises.
    - Die Methode `print()` soll zusätzlich die Rasse des Pferds ausgeben.
  - **Bird:**
    - Vögel haben das zusätzliche Attribut „featherColor“, welches Objekte der Javaklasse `Color` aufnehmen kann.
    - Der Wert des Vogels wird anhand seiner Federfarbe berechnet:
      - Gelbes Gefieder verzehnfacht den Wert gegenüber dem Kaufpreis.
      - Grünes Gefieder verdoppelt den Wert gegenüber dem Kaufpreis.
      - Andere Gefiederfarben haben keine Auswirkungen auf den Wert und haben somit den Kaufpreis als Wert.
    - Die Methode `print()` soll zusätzlich die Gefiederfarbe ausgeben.
  - **Fish:**
    - Fische haben das zusätzliche Attribut „venomous“, welches `true/false` aufnehmen kann.
    - Der Wert des Fischs berechnet sich aus seiner Giftigkeit:
      - Giftige Fische haben den dreifachen Wert ihres Preises.
      - Ungiftige Fische haben den Wert ihres Preises.
    - Die Methode `print()` soll zusätzlich die Giftigkeit ausgeben.

- Erstelle die Unterklassen der Klasse Enclosure `LandEnclosure`, `AirEnclosure` und `WaterEnclosure`.
  - Die Unterklassen sollen die Methode `calculateCapacity()` der Oberklasse überschreiben.
  - **Landgehege:**
    - Landgehege haben das zusätzliche Attribut „planting“, welches angibt, ob Bepflanzung im Gehege vorhanden ist.
    - Die Kapazität berechnet sich aus `(Länge*Breite/1.000)` und halbiert sich, wenn Bepflanzung vorhanden ist.
  - **Luftgehege:**
    - Luftgehege haben als zusätzliches Attribut die Höhe.
    - Die Kapazität berechnet sich aus `(Länge*Breite*Höhe/10.000)`.
  - **Wassergehege:**
    - Wassergehege haben als zusätzliches Attribut die Wasserkapazität.
    - Die Kapazität berechnet sich aus `(Länge*Breite*Wasserkapazität/100.000)`.
- Verändere die Main Klasse entsprechend:
  - Erstelle statt der 9 Animals 3 Horse-, 3 Bird- und 3 Fish-Objekte.
  - Erstelle statt der 3 Gehege jeweils ein Land-, Wasser- und Luftgehege.
- UML-Diagramm `Animal` <br>
![Class Diagram](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/mittey68/dhbw-java-101/development/readme/UML/v3/SubclassesAnimal.puml)
- UML-Diagramm `Enclosure` <br>
![Class Diagram](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/mittey68/dhbw-java-101/development/readme/UML/v3/SubclassesEnclosure.puml)

### Version 4 – abstrakte Klassen und Methoden
- Verändere die Klasse `Animal`:
  - `Animal` soll nicht mehr instanziert werden können.
  - Die Methoden `print()` und `getWorth()` sollen erzwungenermaßen von den Unterklassen implementiert werden müssen.
- Verändere die Klasse `Enclosure`:
  - `Enclosure` soll nicht mehr instanziert werden können.
  - Die Methode `getCapacity()` soll erzwungenermaßen von den Unterklassen implementiert werden müssen.

### Version 5 – Scanner Zufallszahlen & `instanceOf` Operator
- Erstelle die Klasse `Zoo`:
  - Der Konstruktor soll alle Attribute initialisieren.
  - `getName()`, `getDirector()`, `getCapital()`, `getEnclosures()` sind die Getter der entsprechenden Attribute.
  - `setCapital()` ist der Setter des entsprechenden Attributs.
  - `addEnclosure()` soll dem Zoo ein Gehege hinzufügen.
  - `calculateWorth()` soll den Wert aller Tiere des Zoos zurückgeben.
  - `calculateFoodCosts()` soll die Futterkosten aller Tiere zurückgeben.
  - `ageAnimals()` soll alle Tiere des Zoos altern lassen.
  - `getVisited()` soll den Wert aller Tiere auf das Kapital des Zoos aufaddieren, die Futterkosten vom Kapital abziehen und 1000 als Fixkosten vom Kapital abziehen. Des Weiteren sollen in dieser Methode die Tiere einmal gealtert werden.
  - `numberEnclosureTypes()` soll als Hilfsmethode der `print()` Methode per Konsolenausgabe die Anzahl der jeweiligen Gehegetypen ausgeben, d.h. wie viele Land-, Luft- und Wassergehege im Zoo existieren.
  - `print()` soll die Konsolenausgabe wie unten aufgeführt erzeugen und dabei die Hilfsmethode `numberEnclosureTypes()` und die `print()` Methode der Klasse `Enclosure` verwenden.
- Verändere die Main Klasse:
  - Lies den Zoonamen per Scanner ein.
  - Lies den Namen des Zoodirektors per Scanner ein.
  - Erstelle für das Kapital eine Zufallszahl zwischen 2000 – 10000.
  - Erstelle den Zoo mit diesen Angaben.
  - Füge dem Zoo die Gehege inklusive der Tiere hinzu.
  - Lasse den Zoo über die Methode `getVisited()` mehrmals Besucher empfangen und prüfe auch die Alterung der Tiere und die Veränderung des Kapitals.
- UML-Diagramm `Zoo` <br>
![Class Diagram](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/mittey68/dhbw-java-101/development/readme/UML/v5/Zoo.puml)

### Version 6 – Einlesen von Textdateien & Wrapper Classes
- Erstelle eine Textdatei wie unten angegeben oder lade sie aus dem Repository herunter.
- Verändere die Main Klasse:
  - Ergänze `throws FileNotFoundException` im Header deiner Main-Methode.
  - Lies die erstellte Datei zeilenweise ein (Hinweis: Wenn die Textdatei im Projektverzeichnis abgelegt wird, kann die relative Pfadangabe `<Name der Textdatei>.txt` verwendet werden).
  - Jede Zeile der Datei gibt die Daten für ein Objekt der Klasse `Horse` an.
  - Erstelle die Pferde mit den eingelesenen Daten aus der txt-Datei & füge sie einem bereits erstellten Gehege hinzu.

**Hinweis: Textdatei, UML-Diagramme und Konsolenausgabe wurden entfernt.**

---

Java 101  
Alexander Mittermeier

# Java 101 Aufgaben

Willkommen zu den Aufgaben für den Java 101 Kurs. Diese README bietet eine Übersicht und Anweisungen zu den verschiedenen Versionen und Übungen.

## Inhaltsverzeichnis

1. [Version 1: Erste Klassen und Methoden erstellen](#version-1-erste-klassen-und-methoden-erstellen)
2. [Version 2: Erweiterung der bisherigen Klassen und Verknüpfung untereinander](#version-2-erweiterung-der-bisherigen-klassen-und-verknüpfung-untereinander)
3. [Version 3: Vererbung](#version-3-vererbung)
4. [Version 4: Abstrakte Klassen und Methoden](#version-4-abstrakte-klassen-und-methoden)
5. [Version 5: Scanner, Zufallszahlen & instanceOf Operator](#version-5-scanner-zufallszahlen--instanceof-operator)
6. [Version 6: Einlesen von Textdateien & Wrapper Classes](#version-6-einlesen-von-textdateien--wrapper-classes)

## Hinweise & Tipps

- Erstelle jede Übung als eigenes Package, um die Lauffähigkeit trotz Änderungen in neuen Versionen zu gewährleisten.
- UML-Legende:
  - `-` = private
  - `+` = public
  - `#` = protected
- Die verwendeten UML-Diagramme sind von PlantUML und unterscheiden sich von denen in den Vorlesungen.
- Importiere benötigte Klassen wie `ArrayList`, `Color`, `Scanner`, etc., in den jeweiligen Klassen.

## Übungen

### Version 1: Erste Klassen und Methoden erstellen

1. Erstelle die Klasse `Animal` mit folgenden Anforderungen:
   - Der Konstruktor initialisiert alle Attribute.
   - Methoden: `getName()`, `getPrice()`, `getAge()`, `getMaxAge()`, `getAlive()`, `getOlder()`, `getWorth()`, `print()`.
2. Erstelle die ausführbare Klasse `Main`:
   - Erstelle und gib drei Tiere auf der Konsole aus.
   - Lass die Tiere altern und gib sie erneut aus.
3. UML Diagramm <br>
![Class Diagram](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/mittey68/dhbw-java-101/development/readme/UML/Instance.puml)
4. Konsolenausgabe <br>
```
Test snfjdksaf
```

### Version 2: Erweiterung der bisherigen Klassen und Verknüpfung untereinander

1. Erweiterung der Klasse `Animal`:
   - Neue Attribute und Methoden (`feed()`, angepasste `print()` Methode).
2. Erstelle die Klasse `Enclosure`:
   - Konstruktor und Methoden (`calculateCapacity()`, `addAnimals()`, `ageAnimals()`, `feedAnimals()`, `worthOfEnclosure()`, `print()`).
3. Verändere die `Main` Klasse:
   - Erstelle verschiedene Tiere und Gehege, teste Fehlermeldungen und füge Tiere den Gehegen hinzu.

### Version 3: Vererbung

1. Erstelle Unterklassen der Klasse `Animal`:
   - `Bird`, `Horse`, `Fish` mit zusätzlichen Attributen und angepassten Methoden (`print()`, `getWorth()`).
2. Erstelle Unterklassen der Klasse `Enclosure`:
   - `LandEnclosure`, `AirEnclosure`, `WaterEnclosure` mit spezifischen Kapazitätsberechnungen.
3. Verändere die `Main` Klasse entsprechend den neuen Klassen.

### Version 4: Abstrakte Klassen und Methoden

1. Mache die Klasse `Animal` abstrakt:
   - Erzwinge die Implementierung von `print()` und `getWorth()` in den Unterklassen.
2. Mache die Klasse `Enclosure` abstrakt:
   - Erzwinge die Implementierung von `getCapacity()` in den Unterklassen.

### Version 5: Scanner, Zufallszahlen & instanceOf Operator

1. Erstelle die Klasse `Zoo`:
   - Konstruktor und Methoden (`calculateWorth()`, `calculateFoodCosts()`, `ageAnimals()`, `getVisited()`, `numberEnclosureTypes()`, `print()`).
2. Verändere die `Main` Klasse:
   - Lese Zoonamen und Direktor per Scanner ein, erzeuge Kapital als Zufallszahl und erstelle den Zoo.

### Version 6: Einlesen von Textdateien & Wrapper Classes

1. Erstelle eine Textdatei für Pferdedaten oder lade sie aus dem Repository herunter.
2. Verändere die `Main` Klasse:
   - Lese die Datei zeilenweise ein, erstelle Pferde mit den Daten und füge sie einem Gehege hinzu.

## Musterlösung

Die Musterlösung ist verfügbar unter: [GitHub Repository](https://github.com/mittey68/prog-tutorium).

Viel Erfolg beim Bearbeiten der Aufgaben!

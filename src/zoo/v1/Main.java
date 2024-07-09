package zoo.v1;

public class Main {

	public static void main(String[] args) {
		// Tiere erstellen
		Animal horse = new Animal("Pferd", 1000, 10);
		Animal bird = new Animal("Vogel", 60, 7);
		Animal fish = new Animal("Fisch", 30, 5);
		
		// Initiale Eigenschaften der Tiere anzeigen
		horse.print();
		bird.print();
		fish.print();
		
		// Alter der Tiere erhöhen
		horse.getOlder(); // Pferd wird 1 Jahr älter
		horse.getOlder(); // Pferd wird 2 Jahre älter
		horse.getOlder(); // Pferd wird 3 Jahre älter
		horse.getOlder(); // Pferd wird 4 Jahre älter
		horse.getOlder(); // Pferd wird 5 Jahre älter
		horse.getOlder(); // Pferd wird 6 Jahre älter
		
		bird.getOlder(); // Vogel wird 1 Jahr älter
		
		fish.getOlder(); // Fisch wird 1 Jahr älter
		fish.getOlder(); // Fisch wird 2 Jahre älter
		fish.getOlder(); // Fisch wird 3 Jahre älter
		fish.getOlder(); // Fisch wird 4 Jahre älter
		fish.getOlder(); // Fisch wird 5 Jahre älter
		fish.getOlder(); // Fisch wird 6 Jahre älter (jetzt tot)
		
		// Aktualisierte Eigenschaften der Tiere anzeigen
		horse.print();
		bird.print();
		fish.print();
	}
}

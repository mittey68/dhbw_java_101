package zoo.v1;

public class Main {

	public static void main(String[] args) {
		// Tiere erstellen
		Animal horse = new Animal("Pferd", 1000, 10);
		Animal bird = new Animal("Vogel", 60, 7);
		Animal fish = new Animal("Fisch", 30, 5);
		
		// Tiere ausgeben
		horse.print();
		bird.print();
		fish.print();
		
		// Tiere altern
		horse.getOlder();
		horse.getOlder();
		horse.getOlder();
		horse.getOlder();
		horse.getOlder();
		horse.getOlder();
		bird.getOlder();
		fish.getOlder();
		fish.getOlder();
		fish.getOlder();
		fish.getOlder();
		fish.getOlder();
		fish.getOlder();
		
		// Tiere ausgeben
		horse.print();
		bird.print();
		fish.print();
	}

}

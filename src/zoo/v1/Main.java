package zoo.v1;

import java.awt.Color;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Tiere erstellen
		Animal horse = new Animal("Pferd", 1000, 0, 10);
		Animal bird = new Animal("Vogel", 60, 0, 7);
		Animal fish = new Animal("Fisch", 30, 0, 5);
		
		// Tiere ausgeben
		horse.print();
		bird.print();
		fish.print();
		
		// Tiere altern
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

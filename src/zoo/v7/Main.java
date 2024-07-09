package zoo.v7;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// Zoo erstellen 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Gib bitte den Namen deines Zoos ein: ");
		String zooName = scanner.nextLine();
		System.out.print("Gib deinen Namen ein: ");
		String zooDirector = scanner.nextLine();
		scanner.close();

		// Kapital berechnen
		Random rnd = new Random();
		int zooCapital = rnd.nextInt(8000) + 2000; // Zufallszahl zwischen 2000 und 10000
		Zoo zoo = new Zoo(zooName, zooDirector, zooCapital);
		zoo.print();
		
		// Pferde erstellen
		Horse horse1 = new Horse("Gisela", 1000, "Schimmel");
		Horse horse2 = new Horse("Peter", 4600, "Schimmel");
		Horse horse3 = new Horse("Horst", 300, "Schimmel");
		
		// Vögel erstellen
		Bird bird1 = new Bird("Fritz", 60, Color.YELLOW);
		Bird bird2 = new Bird("Quirin", 30, Color.GREEN);
		Bird bird3 = new Bird("Felix", 40, Color.BLUE);
		
		// Fische erstellen
		Fish fish1 = new Fish("Uwe", 50, true);
		Fish fish2 = new Fish("Nathan", 30, false);
		Fish fish3 = new Fish("Nemo", 25, false);
		
		// Gehege erstellen
		LandEnclosure gehege1 = new LandEnclosure("Pferdekoppel", 200, 300, true);
		AirEnclosure gehege2 = new AirEnclosure("Vogelvoliere", 150, 200, 100);
		WaterEnclosure gehege3 = new WaterEnclosure("Aquarium", 400, 300, 120);
		LandEnclosure vielZuKleinesGehege = new LandEnclosure("Viel zu kleines Gehege", 1, 1, false);
		
		// Fehler testen
		vielZuKleinesGehege.addAnimal(horse1); // Testen, ob das Gehege zu klein ist
		gehege2.addAnimal(horse1); // Testen, ob das Tier in das Gehege passt
		
		// Tiere zum Gehege hinzufügen
		gehege1.addAnimal(horse1);
		gehege1.addAnimal(horse2);
		gehege1.addAnimal(horse3);
		
		gehege2.addAnimal(bird1);
		gehege2.addAnimal(bird2);
		gehege2.addAnimal(bird3);
		
		gehege3.addAnimal(fish1);
		gehege3.addAnimal(fish2);
		gehege3.addAnimal(fish3);
		
		// Gehege zum Zoo hinzufügen
		zoo.addEnclosure(gehege1);
		zoo.addEnclosure(gehege2);
		zoo.addEnclosure(gehege3);

		// Pferde über Dateiauslese erstellen
		// Eine Datei-Instanz wird erstellt, die auf die Datei "animals.txt" verweist.
		File file = new File("animals.txt");
		// Ein Scanner wird erstellt, um die Datei zu lesen.
        Scanner fileScanner = new Scanner(file);

		// Solange die Datei eine weitere Zeile enthält, wird die Schleife ausgeführt.
        while (fileScanner.hasNextLine()) {
			// Die aktuelle Zeile wird gelesen und in der Variablen `line` gespeichert.
            String line = fileScanner.nextLine();
			// Die Zeile wird an den Semikolons getrennt und in ein Array gespeichert.
            String[] array = line.split(";");
			// Der Name des Pferdes wird aus dem Array extrahiert.
			String horseName = array[0];
			// Der Preis des Pferdes wird aus dem Array extrahiert und in einen Integer umgewandelt.
			int horsePrice = Integer.valueOf(array[1]);
			// Die Rasse des Pferdes wird aus dem Array extrahiert.
			String horseRace = array[2];
			// Ein neues Pferd-Objekt wird mit den extrahierten Informationen erstellt.
			Horse horse = new Horse(horseName, horsePrice, horseRace);
			// Das erstellte Pferd wird dem Gehege `gehege1` hinzugefügt.
			gehege1.addAnimal(horse);
        }
		// Der Datei-Scanner wird geschlossen.
        fileScanner.close();

		// Den aktuellen Zustand des Zoos ausgeben
		zoo.print();
		
		// Zoobesuche simulieren
		zoo.getVisited();
		zoo.getVisited();
		zoo.getVisited();
		zoo.getVisited();
		zoo.getVisited();
		zoo.getVisited();
		zoo.getVisited();
		
		zoo.print();
	}
}

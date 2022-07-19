package zoo.v4;

import java.awt.Color;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Zoo erstellen 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Gibt bitte den Namen deines Zoos ein: ");
		String name = scanner.nextLine();
		System.out.print("Gibt deinen Namen ein: ");
		String director = scanner.nextLine();
		// calculate capital
		Random rnd = new Random();
		int capital = rnd.nextInt(8000) + 2000;
		Zoo zoo = new Zoo(name, director, capital);
		zoo.print();
		
		// create Gehege
		Landgehege gehege1 = new Landgehege("Pferdekoppel",200,300,true);
		Luftgehege gehege2 = new Luftgehege("Vogelvolaire",400,200,30);
		Wassergehege gehege3 = new Wassergehege("Aquarium",700,600,20);
		Landgehege vielZuKleinesGehege = new Landgehege("Viel zu kleines Gehege",1,1,true);
				
		// create Horses
		Horse horse1 = new Horse("Gisela", 1000, "Schimmel");
		Horse horse2 = new Horse("Peter", 4600, "Schimmel");
		Horse horse3 = new Horse("Gisela", 300, "Schimmel");
		
		// create Horses
		Bird bird1 = new Bird("Birdie", 60, Color.YELLOW);
		Bird bird2 = new Bird("Felix", 30, Color.GREEN);
		Bird bird3 = new Bird("Fritzi", 45, Color.RED);
				
		// create Horses
		Fish fish1 = new Fish("Uwe", 40, true);
		Fish fish2 = new Fish("Olaf", 10, false);
		Fish fish3 = new Fish("Gundula", 15, false);
		
		// Pferdekoppel füllen
		gehege1.addAninmal(horse1);
		gehege1.addAninmal(horse2);
		gehege1.addAninmal(horse3);
		// Vogelvolaire füllen
		gehege2.addAninmal(bird1);
		gehege2.addAninmal(bird2);
		gehege2.addAninmal(bird3);
		// Aquarium füllen
		gehege3.addAninmal(fish1);
		//gehege3.addAninmal(fish2);
		//gehege3.addAninmal(fish3);
		
		// Viel zu kleines Gehege füllen
		vielZuKleinesGehege.addAninmal(horse1);
		vielZuKleinesGehege.addAninmal(horse2);
		vielZuKleinesGehege.addAninmal(horse3);
		
		// falsches Gehege
		gehege2.addAninmal(horse1);
		
		// gehege zum Zoo hinzufügen 
		//zoo.addGehege(gehege1);
		//zoo.addGehege(gehege2);
		zoo.addGehege(gehege3);
		zoo.addGehege(vielZuKleinesGehege);
		
		//Besuche
		zoo.getVisited();
		zoo.getVisited();
		zoo.getVisited();
		zoo.getVisited();
		zoo.print();
		zoo.getVisited();
		zoo.print();
		zoo.getVisited();
		zoo.print();
		zoo.removeGehege(vielZuKleinesGehege);
		zoo.getVisited();
		zoo.print();
		
		
		
		

	}

}

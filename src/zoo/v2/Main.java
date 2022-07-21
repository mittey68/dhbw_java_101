package zoo.v2;

public class Main {

	public static void main(String[] args) {
		// Pferde erstellen
		Animal horse1 = new Animal("Pferd 1", 1000, 10, EnclosureType.LAND, FoodType.HAY);
		Animal horse2 = new Animal("Pferd 2", 4600, 10, EnclosureType.LAND, FoodType.HAY);
		Animal horse3 = new Animal("Pferd 3", 300, 10, EnclosureType.LAND, FoodType.HAY);
		// Vögel erstellen
		Animal bird1 = new Animal("Vogel 1", 60, 7, EnclosureType.AIR, FoodType.GRAINS);
		Animal bird2 = new Animal("Vogel 2", 30, 7, EnclosureType.AIR, FoodType.GRAINS);
		Animal bird3 = new Animal("Vogel 3", 40, 7, EnclosureType.AIR, FoodType.GRAINS);
		// Fische erstellen
		Animal fish1 = new Animal("Fisch 1", 50, 5, EnclosureType.WATER, FoodType.FISHFOOD);
		Animal fish2 = new Animal("Fisch 2", 30, 5, EnclosureType.WATER, FoodType.FISHFOOD);
		Animal fish3 = new Animal("Fisch 3", 25, 5, EnclosureType.WATER, FoodType.FISHFOOD);
		
		// Gehege erstellen
		Enclosure gehege1 = new Enclosure("Pferdekoppel",EnclosureType.LAND, 200, 300);
		Enclosure gehege2 = new Enclosure("Vogelvoliere",EnclosureType.AIR, 150, 200);
		Enclosure gehege3 = new Enclosure("Aquarium",EnclosureType.WATER, 400, 300);
		Enclosure vielZuKleinesGehege = new Enclosure(" Viel zu kleines Gehege",EnclosureType.LAND, 1, 1);
		
		// Fehler testen
		vielZuKleinesGehege.addAninmal(horse1);
		gehege2.addAninmal(horse1);
		
		// Tiere zum Gehege hinzufügen
		gehege1.addAninmal(horse1);
		gehege1.addAninmal(horse2);
		gehege1.addAninmal(horse3);
		
		gehege2.addAninmal(bird1);
		gehege2.addAninmal(bird2);
		gehege2.addAninmal(bird3);
		
		gehege3.addAninmal(fish1);
		gehege3.addAninmal(fish2);
		gehege3.addAninmal(fish3);
		
		// Gehege ausgeben
		gehege1.print();
		gehege2.print();
		gehege3.print();
		
		// Tiere altern lassen
		gehege1.ageAnimals();
		gehege1.ageAnimals();
		gehege1.ageAnimals();
		gehege1.ageAnimals();
		gehege1.ageAnimals();
		gehege1.ageAnimals();
		
		gehege2.ageAnimals();
		gehege2.ageAnimals();
		gehege2.ageAnimals();
		
		gehege3.ageAnimals();
		gehege3.ageAnimals();
		gehege3.ageAnimals();
		gehege3.ageAnimals();
		gehege3.ageAnimals();
		gehege3.ageAnimals();
		
		// Gehege ausgeben
		gehege1.print();
		gehege2.print();
		gehege3.print();
	}

}

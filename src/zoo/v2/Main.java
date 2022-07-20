package zoo.v2;

public class Main {

	public static void main(String[] args) {
		// Pferde erstellen
		Animal horse1 = new Animal("Pferd 1", 1000, 10, GehegeType.LAND, FoodType.HAY);
		Animal horse2 = new Animal("Pferd 2", 4600, 10, GehegeType.LAND, FoodType.HAY);
		Animal horse3 = new Animal("Pferd 3", 300, 10, GehegeType.LAND, FoodType.HAY);
		// Vögel erstellen
		Animal bird1 = new Animal("Vogel 1", 60, 7, GehegeType.AIR, FoodType.GRAINS);
		Animal bird2 = new Animal("Vogel 2", 30, 7, GehegeType.AIR, FoodType.GRAINS);
		Animal bird3 = new Animal("Vogel 3", 40, 7, GehegeType.AIR, FoodType.GRAINS);
		// Fische erstellen
		Animal fish1 = new Animal("Fisch 1", 50, 5, GehegeType.WATER, FoodType.FISHFOOD);
		Animal fish2 = new Animal("Fisch 2", 30, 5, GehegeType.WATER, FoodType.FISHFOOD);
		Animal fish3 = new Animal("Fisch 3", 25, 5, GehegeType.WATER, FoodType.FISHFOOD);
		
		// Gehege erstellen
		Gehege gehege1 = new Gehege("Pferdekoppel",GehegeType.LAND, 200, 300);
		Gehege gehege2 = new Gehege("Vogelvoliere",GehegeType.AIR, 150, 200);
		Gehege gehege3 = new Gehege("Aquarium",GehegeType.WATER, 400, 300);
		Gehege vielZuKleinesGehege = new Gehege(" Viel zu kleines Gehege",GehegeType.LAND, 1, 1);
		
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

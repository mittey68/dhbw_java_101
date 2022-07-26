package zoo.v5;

import java.util.ArrayList;

public class Zoo {
	private String name;
	private String director;
	private int capital;
	private ArrayList<Enclosure> enclosures;
	
	public Zoo(String name, String director, int capital) {
		this.name = name;
		this.director = director;
		this.capital = capital;
		this.enclosures = new ArrayList<>();
	}

	// Getters
	public String getName() {
		return name;
	}

	public String getDirector() {
		return director;
	}
	
	public int getCapital() {
		return capital;
	}
	
	public ArrayList<Enclosure> getEnclosures() {
		return enclosures;
	}

	// Setters
	public void setCapital(int capital) {
		this.capital = capital;
	}
	
	// methods
	
	
	// Upcast Downcast
	public void addEnclosure (Enclosure enclosure) {
		this.enclosures.add(enclosure);
	}
	
	public int calculateWorth() {
		int worth = 0;
		for (Enclosure enclosure : this.enclosures) {
			worth += enclosure.worthOfEnclosure();
		}
		return worth;
	}
	
	public int calculateFoodCosts() {
		int costs = 0;
		for (Enclosure enclosure : this.enclosures) {
			costs += enclosure.feedAnimals();
		}
		return costs;
	}
	
	public void ageAnimals() {
		for (Enclosure enclosure : this.enclosures) {
			enclosure.ageAnimals();
		}
	}
	
	public void getVisited() {
		this.capital += (calculateWorth()-calculateFoodCosts());
		this.capital -= 1000; //Fixkosten
		this.ageAnimals();
	}
	
	public void numberEnclosureTypes() {
		int landgehege = 0;
		int luftgehege = 0;
		int wassergehege = 0;
		for (Enclosure enclosure : this.enclosures) {
			if(enclosure instanceof LandEnclosure) {
				landgehege++;
			}
			else if(enclosure instanceof AirEnclosure) {
				luftgehege++;
			}
			else if(enclosure instanceof WaterEnclosure) {
				wassergehege++;
			}
		}
		System.out.println(landgehege + " Landgehege");
		System.out.println(luftgehege + " Luftgehege");
		System.out.println(wassergehege + " Wassergehege");
	}
	
//	public void removeGehege(Enclosure enclosure) {
//		for (int i = 0; i < this.enclosures.size(); i++) {
//			if (gehege.equals(this.enclosures.get(i))) {
//				this.enclosures.remove(i);
//			}
//		}
//	}
	
	public void print() {
		System.out.println("----------------------------------------------------------");
		System.out.println("----------------------------------------------------------");
		System.out.println("----------------------------------------------------------");
		System.out.println("Name des Zoos: " + this.name);
		System.out.println("Zoodirektor: " + this.director);
		System.out.println("Aktuelles Kapital: " + this.capital);
		System.out.println("Anzahl unserer Gehege:");
		numberEnclosureTypes();
		System.out.println("Unsere Tiere:");
		for (Enclosure g : this.enclosures) {
			g.print();
		}
		System.out.println("----------------------------------------------------------");
		System.out.println("----------------------------------------------------------");
		System.out.println("----------------------------------------------------------");
		
	}
}



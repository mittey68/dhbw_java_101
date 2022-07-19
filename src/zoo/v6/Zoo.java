package zoo.v6;

import java.util.ArrayList;

public class Zoo {
	private String name;
	private String director;
	private int capital;
	private ArrayList<Gehege> gehege;
	
	public Zoo(String name, String director, int capital) {
		super();
		this.name = name;
		this.director = director;
		this.capital = capital;
		this.gehege = new ArrayList<>();
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
	
	public ArrayList<Gehege> getGehege() {
		return gehege;
	}

	// Setters
	public void setCapital(int capital) {
		this.capital = capital;
	}
	
	// methods
	
	
	// Upcast Downcast
	public void addGehege(Gehege gehege) {
		this.gehege.add(gehege);
	}
	
	public int calculateWorth() {
		int worth = 0;
		for (Gehege gehege : this.gehege) {
			worth += gehege.worthOfEnclosure();
		}
		return worth;
	}
	
	public int calculateFoodCosts() {
		int costs = 0;
		for (Gehege gehege : this.gehege) {
			costs += gehege.feedAnimals();
		}
		return costs;
	}
	
	public void ageAnimals() {
		for (Gehege gehege : this.gehege) {
			gehege.ageAnimals();
		}
	}
	
	public void removeDeadAnimals() {
		for (Gehege gehege : this.gehege) {
			gehege.removeDeadAnimals();
		}
	}
	
	public void getVisited() {
		this.capital += (calculateWorth()-calculateFoodCosts());
		this.capital -= 1000; //Fixkosten
		ageAnimals();
		removeDeadAnimals();
	}
	
	public void anzahlGehegetypen() {
		int landgehege = 0;
		int luftgehege = 0;
		int wassergehege = 0;
		for (Gehege gehege : this.gehege) {
			if(gehege instanceof Landgehege) {
				landgehege++;
			}
			else if(gehege instanceof Luftgehege) {
				luftgehege++;
			}
			else if(gehege instanceof Wassergehege) {
				wassergehege++;
			}
		}
		System.out.println(landgehege + " Landgehege");
		System.out.println(luftgehege + " Luftgehege");
		System.out.println(wassergehege + " Wassergehege");
	}
	
	public void removeGehege(Gehege gehege) {
		for (int i = 0; i < this.gehege.size(); i++) {
			if (gehege.equals(this.gehege.get(i))) {
				this.gehege.remove(i);
			}
		}
	}
	
	public void print() {
		System.out.println("----------------------------------------------------------");
		System.out.println("----------------------------------------------------------");
		System.out.println("----------------------------------------------------------");
		System.out.println("Name des Zoos: " + this.name);
		System.out.println("Zoodirektor: " + this.director);
		System.out.println("Aktuelles Kapital: " + this.capital);
		System.out.println("Anzahl unserer Gehege:");
		anzahlGehegetypen();
		System.out.println("Unsere Tiere:");
		for (Gehege g : this.gehege) {
			g.print();
		}
		System.out.println("----------------------------------------------------------");
		System.out.println("----------------------------------------------------------");
		System.out.println("----------------------------------------------------------");
		
	}
}



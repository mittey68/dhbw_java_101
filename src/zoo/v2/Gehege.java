package zoo.v2;

import java.util.ArrayList;

public class Gehege {
	private String name;
	private GehegeType gehegeType;
	private ArrayList<Animal> animals;
	private int length;
	private int width;
	private int animalsInside;
	
	public Gehege(String name, GehegeType gehegetype, int length, int width) {
		this.name = name;
		this.gehegeType = gehegetype;
		this.animals = new ArrayList<>();
		this.length = length;
		this.width = width;
		this.animalsInside = 0;
	}
	
	// Getters

	public GehegeType getGehegetype() {
		return gehegeType;
	}

	public ArrayList<Animal> getAnimals() {
		return animals;
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}
	
	//Methods
	
	public int caculateCapacity() {
		return (this.length*this.width)/1000;
	}
	
	public void addAninmal(Animal animal) {
		if(this.caculateCapacity()>this.animalsInside) {
			if (animal.getGehegeType().equals(this.gehegeType)) {
				this.animals.add(animal);
				this.animalsInside++;
			}
			else {
				System.out.println("Dieses Tier passt nicht in ein " + this.gehegeType.getDescription() + ". Es benötigt ein " + animal.getGehegeType().getDescription());
			}
		}
		else {
			System.out.println("Dieses Gehege ist zu klein. Die Maximalkapazität von " + this.caculateCapacity() + " ist erreicht.");
		}
	}
	
	public void ageAnimals() {
		for (Animal animal : animals) {
			animal.getOlder();
		}
		removeDeadAnimals();
	}
	
	public void removeDeadAnimals() {
		for (int i = 0; i < this.animals.size(); i++) {
			Animal animal = this.animals.get(i);
			if (animal.getAlive() == false) {
				this.animals.remove(i);
				this.animalsInside--;
			}
		}
	}
	
	public int feedAnimals() {
		int costs = 0;
		for (Animal animal : animals) {
			costs += animal.feed();
		}
		return costs;
	}
	
	public int worthOfEnclosure() {
		int worth = 0;
		for (Animal animal : animals) {
			worth += animal.getWorth();
		}
		return worth;
	}
	
	public void print() {
		System.out.println("Gehegename: " + this.name);
		System.out.println("Gehegetyp: " + this.gehegeType);
		System.out.println("Gehegekapazität: " + this.caculateCapacity());
		System.out.println("Tiere im Gehege: " + this.animalsInside);
		for (Animal a: this.animals) {
			a.print();
		}
	}	
}

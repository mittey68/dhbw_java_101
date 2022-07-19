package zoo.v5;

import java.util.ArrayList;

public abstract class Gehege {
	protected String name;
	protected GehegeType gehegetype;
	protected ArrayList<Animal> animals;
	protected int length;
	protected int width;
	protected int animalsInside;
	
	public Gehege(String name, GehegeType gehegetype, int length, int width) {
		this.name = name;
		this.gehegetype = gehegetype;
		this.animals = new ArrayList<>();
		this.length = length;
		this.width = width;
		this.animalsInside = 0;
	}
	
	// Getters

	public GehegeType getGehegetype() {
		return gehegetype;
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
	
	public abstract int caculateCapacity();
	
	public void addAninmal(Animal animal) {
		if(this.caculateCapacity()>this.animalsInside) {
			if (animal.getType().equals(this.gehegetype)) {
				this.animals.add(animal);
				this.animalsInside++;
			}
			else {
				System.out.println("Dieses Tier passt nicht in ein " + this.gehegetype.getDescription() + ". Es benötigt ein " + animal.getType().getDescription());
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
	}
	
	public void removeDeadAnimals() {
		for (int i = 0; i < this.animals.size(); i++) {
			Animal animal = this.animals.get(i);
			if (animal.getAlive() == false) {
				this.animals.remove(i);
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
		for (Animal a: this.animals) {
			a.print();
		}
	}
	
	
	
}

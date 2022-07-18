package zoo.v1;

import java.util.ArrayList;

public abstract class Gehege {
	private AnimalType gehegetype;
	private ArrayList<Animal> animals;
	private int length;
	private int width;
	
	public Gehege(AnimalType gehegetype, int length, int width) {
		this.gehegetype = gehegetype;
		this.animals = new ArrayList<>();
		this.length = length;
		this.width = width;
	}
	
	// Getters

	public AnimalType getGehegetype() {
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
		
	}
	
	
	
}

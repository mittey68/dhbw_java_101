package zoo.v1;

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
	
	public int calculateWorth() {
		return 0;
	}
	
	
	public void getVisited() {
		// Gehege get worth
		//test
	}
}



package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {
	boolean laysEggs;
	
	public boolean getLaysEggs() {
		return this.laysEggs;
	}
	
	public void setLaysEggs(boolean newLaysEggs) {
		this.laysEggs= newLaysEggs;
	}
	
	public Reptile (Integer nrOfLegs, String name, boolean laysEggs) {
		super(nrOfLegs,name);
		this.laysEggs = laysEggs;
	}
}

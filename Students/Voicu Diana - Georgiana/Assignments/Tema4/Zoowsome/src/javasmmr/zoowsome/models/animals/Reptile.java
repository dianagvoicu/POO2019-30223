package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal {
	boolean laysEggs;
	
	public boolean getLaysEggs() {
		return this.laysEggs;
	}
	
	public void setLaysEggs(boolean newLaysEggs) {
		this.laysEggs= newLaysEggs;
	}
	
	public Reptile (Integer nrOfLegs, String name,Double maintenanceCost,double dangerPerc, boolean laysEggs) {
		super(nrOfLegs,name,maintenanceCost,dangerPerc);
		this.laysEggs = laysEggs;
	}
}

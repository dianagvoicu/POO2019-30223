package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile {
	public Crocodile (Integer nrOfLegs, String name, boolean laysEggs) {
		super(nrOfLegs, name, laysEggs);
	}
	
	public Crocodile() {
		super(4,"Croc",true);
	}

}

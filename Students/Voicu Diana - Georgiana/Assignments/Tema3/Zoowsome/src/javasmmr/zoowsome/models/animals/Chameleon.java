package javasmmr.zoowsome.models.animals;

public class Chameleon extends Reptile {
	public Chameleon (Integer nrOfLegs, String name, boolean laysEggs) {
		super(nrOfLegs, name, laysEggs);
	}
	
	public Chameleon() {
		super(4,"Transcendental",true);
	}

}

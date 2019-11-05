package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {
	public Snake (Integer nrOfLegs, String name, boolean laysEggs) {
		super(nrOfLegs, name, laysEggs);
	}
	
	public Snake() {
		super(0,"Apophis",true);
	}
}

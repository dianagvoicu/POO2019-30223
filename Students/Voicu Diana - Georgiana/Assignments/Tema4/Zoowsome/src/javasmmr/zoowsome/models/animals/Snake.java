package javasmmr.zoowsome.models.animals;

public class Snake extends Reptile {
	public Snake (Integer nrOfLegs, String name,Double maintenanceCost,double dangerPerc, boolean laysEggs) {
		super(nrOfLegs, name, maintenanceCost,dangerPerc, laysEggs);
	}
	
	public Snake() {
		super(0,"Apophis",6.2,0.8,true);
	}
}

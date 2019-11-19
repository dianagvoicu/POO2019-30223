package javasmmr.zoowsome.models.animals;

public class Chameleon extends Reptile {
	public Chameleon (Integer nrOfLegs, String name,Double maintenanceCost,double dangerPerc, boolean laysEggs) {
		super(nrOfLegs, name, maintenanceCost,dangerPerc, laysEggs);
	}
	
	public Chameleon() {
		super(4,"Transcendental",(double) 1,0.15,true);
	}

}

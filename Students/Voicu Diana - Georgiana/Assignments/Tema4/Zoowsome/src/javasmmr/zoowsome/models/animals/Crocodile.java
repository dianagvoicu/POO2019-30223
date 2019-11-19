package javasmmr.zoowsome.models.animals;

public class Crocodile extends Reptile {
	public Crocodile (Integer nrOfLegs, String name, Double maintenanceCost,double dangerPerc, boolean laysEggs) {
		super(nrOfLegs, name, maintenanceCost,dangerPerc, laysEggs);
	}
	
	public Crocodile() {
		super(4,"Croc",3.9,1,true);
	}

}

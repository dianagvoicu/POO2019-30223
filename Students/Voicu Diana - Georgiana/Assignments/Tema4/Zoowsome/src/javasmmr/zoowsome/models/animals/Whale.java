package javasmmr.zoowsome.models.animals;

public class Whale extends Aquatic {
	public Whale(Integer nrOfLegs, String name, Double maintenanceCost,double dangerPerc, Integer avgSwimDepth, waterType livingWater) {
		super(nrOfLegs,name,maintenanceCost,dangerPerc,avgSwimDepth,livingWater);
	}
	
	public Whale() {
		super(0,"Juliette",7.7,0.6,2300,waterType.saltWater);
	}

}

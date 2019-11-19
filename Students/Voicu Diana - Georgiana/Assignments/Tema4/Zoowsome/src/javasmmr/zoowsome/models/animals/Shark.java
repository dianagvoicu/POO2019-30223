package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {
	public Shark(Integer nrOfLegs, String name,Double maintenanceCost,double dangerPerc, Integer avgSwimDepth, waterType livingWater) {
		super(nrOfLegs,name,maintenanceCost,dangerPerc,avgSwimDepth,livingWater);
	}
	
	public Shark() {
		super(0,"Speedy",(double) 8,1,1200,waterType.saltWater);
	}
}

package javasmmr.zoowsome.models.animals;

public class Clownfish extends Aquatic {
	public Clownfish(Integer nrOfLegs, String name,Double maintenanceCost,double dangerPerc, Integer avgSwimDepth, waterType livingWater) {
		super(nrOfLegs,name,maintenanceCost,dangerPerc,avgSwimDepth,livingWater);
	}
	
	public Clownfish() {
		super(0,"Nemo",1.8,0.1,250,waterType.saltWater);
	}

}

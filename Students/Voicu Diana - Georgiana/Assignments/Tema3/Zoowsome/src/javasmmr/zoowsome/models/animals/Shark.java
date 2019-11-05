package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {
	public Shark(Integer nrOfLegs, String name, Integer avgSwimDepth, waterType livingWater) {
		super(nrOfLegs,name,avgSwimDepth,livingWater);
	}
	
	public Shark() {
		super(0,"Speedy",1200,waterType.saltWater);
	}
}

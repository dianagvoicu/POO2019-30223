package javasmmr.zoowsome.models.animals;

public class Whale extends Aquatic {
	public Whale(Integer nrOfLegs, String name, Integer avgSwimDepth, waterType livingWater) {
		super(nrOfLegs,name,avgSwimDepth,livingWater);
	}
	
	public Whale() {
		super(0,"Juliette",2300,waterType.saltWater);
	}

}

package javasmmr.zoowsome.models.animals;

public class Clownfish extends Aquatic {
	public Clownfish(Integer nrOfLegs, String name, Integer avgSwimDepth, waterType livingWater) {
		super(nrOfLegs,name,avgSwimDepth,livingWater);
	}
	
	public Clownfish() {
		super(0,"Nemo",250,waterType.saltWater);
	}

}

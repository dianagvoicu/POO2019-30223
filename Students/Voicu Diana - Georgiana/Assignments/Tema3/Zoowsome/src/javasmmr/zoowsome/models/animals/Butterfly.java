package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {
	public Butterfly(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		super(nrOfLegs,name,canFly,isDangerous);
	}
	public Butterfly() {
		super(6,"Fae",true,false);
	}
}

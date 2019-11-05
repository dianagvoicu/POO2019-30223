package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {
	public Cockroach(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		super(nrOfLegs,name,canFly,isDangerous);
	}
	public Cockroach() {
		super(6,"Joe",true,false);
	}

}

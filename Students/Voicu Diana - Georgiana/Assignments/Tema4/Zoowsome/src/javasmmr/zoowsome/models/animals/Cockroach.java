package javasmmr.zoowsome.models.animals;

public class Cockroach extends Insect {
	public Cockroach(Integer nrOfLegs, String name,Double maintenanceCost,double dangerPerc, boolean canFly, boolean isDangerous) {
		super(nrOfLegs,name,maintenanceCost,dangerPerc,canFly,isDangerous);
	}
	public Cockroach() {
		super(6,"Joe",0.7,0.1,true,false);
	}

}

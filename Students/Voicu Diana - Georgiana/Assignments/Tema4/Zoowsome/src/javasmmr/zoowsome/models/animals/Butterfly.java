package javasmmr.zoowsome.models.animals;

public class Butterfly extends Insect {
	public Butterfly(Integer nrOfLegs, String name,Double maintenanceCost,double dangerPerc,boolean canFly, boolean isDangerous) {
		super(nrOfLegs,name,maintenanceCost,dangerPerc,canFly,isDangerous);
	}
	public Butterfly() {
		super(6,"Fae",(double) 1,0.1,true,false);
	}
}

package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {
	public Spider(Integer nrOfLegs, String name,Double maintenanceCost,double dangerPerc, boolean canFly, boolean isDangerous) {
		super(nrOfLegs,name,maintenanceCost,dangerPerc,canFly,isDangerous);
	}
	public Spider() {
		super(8,"Vicentiu",2.3,0.7,false,true);
	}

}

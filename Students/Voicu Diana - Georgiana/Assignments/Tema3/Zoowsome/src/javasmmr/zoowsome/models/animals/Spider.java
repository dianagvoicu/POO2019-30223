package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {
	public Spider(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		super(nrOfLegs,name,canFly,isDangerous);
	}
	public Spider() {
		super(8,"Vicentiu",false,true);
	}

}

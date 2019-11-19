package javasmmr.zoowsome.models.animals;

public class Cow extends Mammal {
	public Cow (Integer nrOfLegs, String name, Double maintenanceCost,double dangerPerc, float normalBodyTemp, float percBodyHair) {
		 super(nrOfLegs, name, maintenanceCost,dangerPerc, normalBodyTemp ,percBodyHair);
	}
	
	public Cow () {
		super(4,"Janine",3.5,0.1,38.33f,90.5f);
	}

}

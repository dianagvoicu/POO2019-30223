package javasmmr.zoowsome.models.animals;

public class Tiger extends Mammal {
	public Tiger(Integer nrOfLegs, String name,Double maintenanceCost,double dangerPerc, float normalBodyTemp, float percBodyHair) {
		 super(nrOfLegs, name,maintenanceCost,dangerPerc, normalBodyTemp ,percBodyHair);
	}
	
	public Tiger() {
		super(4,"Azul",7.3,0.8,37.5f,98.8f);
	}
}

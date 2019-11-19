package javasmmr.zoowsome.models.animals;

public class Monkey extends Mammal {
	public Monkey(Integer nrOfLegs, String name, Double maintenanceCost,double dangerPerc, float normalBodyTemp, float percBodyHair) {
		 super(nrOfLegs, name, maintenanceCost,dangerPerc, normalBodyTemp ,percBodyHair);
	}
	public Monkey() {
		super(2,"Rami",7.5,0.5,37.5f,95.55f);
	}
}

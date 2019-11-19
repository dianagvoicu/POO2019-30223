package javasmmr.zoowsome.models.animals;

public class Mockingbird extends Bird {
	public Mockingbird (Integer nrOfLegs, String name,Double maintenanceCost,double dangerPerc, boolean migrates, Integer avaFlightAltitude) {
		super(nrOfLegs,name,maintenanceCost, dangerPerc,migrates,avaFlightAltitude);
	}
	
	public Mockingbird() {
		super(2,"Jewel",1.9,0.1,true,19);
	}

}

package javasmmr.zoowsome.models.animals;

public class Mockingbird extends Bird {
	public Mockingbird (Integer nrOfLegs, String name, boolean migrates, Integer avaFlightAltitude) {
		super(nrOfLegs,name,migrates,avaFlightAltitude);
	}
	
	public Mockingbird() {
		super(2,"Jewel",true,19);
	}

}

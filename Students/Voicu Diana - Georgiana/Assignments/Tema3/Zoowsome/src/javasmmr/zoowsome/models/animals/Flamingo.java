package javasmmr.zoowsome.models.animals;

public class Flamingo extends Bird {
	public Flamingo (Integer nrOfLegs, String name, boolean migrates, Integer avaFlightAltitude) {
		super(nrOfLegs,name,migrates,avaFlightAltitude);
	}
	
	public Flamingo() {
		super(2,"Cosco",true,3000);
	}

}

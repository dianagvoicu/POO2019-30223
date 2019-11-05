package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird {
	public Parrot (Integer nrOfLegs, String name, boolean migrates, Integer avaFlightAltitude) {
		super(nrOfLegs,name,migrates,avaFlightAltitude);
	}
	
	public Parrot() {
		super(2,"Cosmo",false,1135);
	}
}

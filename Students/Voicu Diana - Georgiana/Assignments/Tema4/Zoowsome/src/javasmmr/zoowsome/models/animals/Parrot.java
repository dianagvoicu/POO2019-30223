package javasmmr.zoowsome.models.animals;

public class Parrot extends Bird {
	public Parrot (Integer nrOfLegs, String name,Double maintenanceCost,double dangerPerc, boolean migrates, Integer avaFlightAltitude) {
		super(nrOfLegs,name,maintenanceCost,dangerPerc,migrates,avaFlightAltitude);
	}
	
	public Parrot() {
		super(2,"Cosmo",5.7,0.2,false,1135);
	}
}

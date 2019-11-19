package javasmmr.zoowsome.models.animals;

public class Flamingo extends Bird {
	public Flamingo (Integer nrOfLegs, String name, Double maintenanceCost,double dangerPerc, boolean migrates, Integer avaFlightAltitude) {
		super(nrOfLegs,name,maintenanceCost, dangerPerc,migrates,avaFlightAltitude);
	}
	
	public Flamingo() {
		super(2,"Cosco",2.5,0.3,true,3000);
	}

}

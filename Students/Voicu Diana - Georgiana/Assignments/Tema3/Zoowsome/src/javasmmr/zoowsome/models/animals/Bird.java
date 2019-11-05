package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal {
	boolean migrates;
	Integer avaFlightAltitude;
	
	public boolean ifMigrates() {
		return this.migrates;
	}
	
	public void setIfMigrates(boolean newMigrates) {
		this.migrates= newMigrates;
	}
	
	public Integer getAvaFlightAltitude() {
		return this.avaFlightAltitude;
	}
	
	public void setavaFlightAltitude(Integer newAvaFlightAltitude) {
		this.avaFlightAltitude= newAvaFlightAltitude;
	}
	
	public Bird(Integer nrOfLegs, String name, boolean migrates, Integer avaFlightAltitude) {
		super(nrOfLegs, name);
		this.migrates= migrates;
		this.avaFlightAltitude = avaFlightAltitude;
	}
}

package javasmmr.zoowsome.models.animals;

public abstract class Mammal extends Animal {
	float normalBodyTemp;
	float percBodyHair;
	
	public float getNormalBodyTemp() {
		return this.normalBodyTemp;
	}
	
	public void setNormalBodyTemp(float newNormalBodyTemp) {
		this.normalBodyTemp= newNormalBodyTemp;
	}
	
	public float getPercBodyHair() {
		return this.percBodyHair;
	}
	
	public void setPercBodyHair(float newPercBodyHair) {
		this.percBodyHair = newPercBodyHair;
	}
	
	public Mammal (Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
		super(nrOfLegs,name);
		this.normalBodyTemp = normalBodyTemp;
		this.percBodyHair = percBodyHair;
	}
	
}

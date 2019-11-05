package javasmmr.zoowsome.models.animals;

public abstract class Insect extends Animal {
	boolean canFly;
	boolean isDangerous;
	
	public boolean ifCanFly() {
		return this.canFly;
	}
	
	public void setIfCanFly(boolean newCanFly) {
		this.canFly = newCanFly;
	}
	
	public boolean ifIsDangerous() {
		return this.isDangerous;
	}
	
	public void setIfIsDangerous(boolean newIsDangerous) {
		this.isDangerous= newIsDangerous;
	}
	
	public Insect (Integer nrOfLegs, String name, boolean canFly, boolean isDangerous) {
		super(nrOfLegs,name);
		this.canFly = canFly;
		this.isDangerous = isDangerous;
	}
}
